package com.po.reservation.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.po.reservation.entity.Container;
import com.po.reservation.entity.Item;
import com.po.reservation.form.ContainerForm;
import com.po.reservation.form.ContainerSearchForm;
import com.po.reservation.info.ContainerInfo;
import com.po.reservation.info.ItemInfo;
import com.po.reservation.info.UserInfo;
import com.po.reservation.repository.ContainerRepository;

/**
 * @author Bhajuram.c
 *
 */
@Service
public class ContainerService {
	
	private static Logger logger = LoggerFactory.getLogger(ContainerService.class);
	
	@Autowired
	private ContainerRepository containerRepository;

	public List<ContainerInfo> searchContainers(ContainerForm containerForm) {

		List<Container> containerList = containerRepository.findAll();
		List<ContainerInfo> ContainerInfoList = new ArrayList<>();
		if (!containerList.isEmpty() && containerList != null) {
			if (containerForm.getTerritory() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getTerritory().equalsIgnoreCase(containerForm.getTerritory()))
						.collect(Collectors.toList());
			} else if (containerForm.getMarket() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getMarket().equalsIgnoreCase(containerForm.getMarket()))
						.collect(Collectors.toList());
			} else if (containerForm.getSubMarket() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getSubMarket().equalsIgnoreCase(containerForm.getSubMarket()))
						.collect(Collectors.toList());
			} else if (containerForm.getLocalMarket() != null) {
				containerList = containerList.stream().filter(
						container -> container.getLocalMarket().equalsIgnoreCase(containerForm.getLocalMarket()))
						.collect(Collectors.toList());
			} else if (containerForm.getContainerCode() != null) {
				containerList = containerList.stream().filter(
						container -> container.getContainerCode().equalsIgnoreCase(containerForm.getContainerCode()))
						.collect(Collectors.toList());
			} else if (containerForm.getBuyer() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getBuyer().getUsername().equals(containerForm.getBuyer()))
						.collect(Collectors.toList());
			} else if (containerForm.getBuyer() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getBuyer().getUsername().equals(containerForm.getBuyer()))
						.collect(Collectors.toList());
			} else if (containerForm.getProjectId() != 0) {
				containerList = containerList.stream()
						.filter(container -> container.getProject().getId() == (containerForm.getProjectId()))
						.collect(Collectors.toList());
			} else if (containerForm.getSearchKey() != null) {
				containerList = containerList.stream()
						.filter(container -> container.getContainerCode().equalsIgnoreCase(containerForm.getSearchKey())
								|| container.getProject().getId() == (Integer.valueOf(containerForm.getSearchKey()))
								|| container.getProject().getPslc().equals(containerForm.getSearchKey())
								|| container.getBuyer().getId() == (Integer.valueOf(containerForm.getSearchKey())))
						.collect(Collectors.toList());
			}
			
			if (!containerList.isEmpty()) {
				for (Container container : containerList) {
					ContainerInfoList.add(getContainerInfo(container));
				}
			}
		}

		return ContainerInfoList;
	}
	
	/**
	 * @param Set<Item> items
	 * @return List<ItemInfo> itemsInfoList
	 */
	private List<ItemInfo> getItemsInfo(Set<Item> items) {
		List<ItemInfo> itemsInfoList = new ArrayList<ItemInfo>();
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			ItemInfo itemInfo = new ItemInfo();
			Item item = it.next();
			BeanUtils.copyProperties(item, itemInfo);
			itemsInfoList.add(itemInfo);
		}
		return itemsInfoList;
	}

	/**
	 * @param containerId
	 * @return containerInfo
	 */
	public ContainerInfo getContainerById(int containerId) {
		Container container = containerRepository.getOne(containerId);
		ContainerInfo containerInfo = null;
		if (container != null) {
			containerInfo = getContainerInfo(container);
		} else {
			logger.info("method :: getContainerById ::: Containers not found  with containerId : " + containerId);
		}
		return containerInfo;
	}

	/**
	 * @param Container container
	 * @return ContainerInfo containerInfo
	 */
	private ContainerInfo getContainerInfo(Container container) {
		ContainerInfo containerInfo = new ContainerInfo();
		containerInfo.setCatsStatus(container.getCatsStatus());
		containerInfo.setContainerCode(container.getContainerCode());
		containerInfo.setUseByDate(container.getUseBy());
		containerInfo.setFuzeProjectId(container.getProject().getId());
		containerInfo.setProjectName(container.getProject().getProjectName());
		containerInfo.setFuzeReservationId(container.getFuzeReservationId());
		containerInfo.setBuyerId(container.getBuyer().getId());
		containerInfo.setBuyerName(container.getBuyer().getFirstName() + " " + container.getBuyer().getFirstName());
		containerInfo.setMROrderCode(container.getMrOrderCode());
		containerInfo.setFuzeStatus(container.getFuzeStatus());
		containerInfo.setMarket(container.getMarket());
		containerInfo.setSubMarket(container.getSubMarket());
		containerInfo.setLocalMarket(container.getLocalMarket());
		containerInfo.setPslc(container.getPslc());
		containerInfo.setPSProject(container.getPSProject());

		containerInfo.setItemsInfo(getItemsInfo(container.getItems()));

		return containerInfo;
	}

	public List<ContainerInfo> searchContainersBasedOnCheckBox(ContainerSearchForm containerSearchForm) {
		
		List<Container> containerList = new ArrayList<>();
		List<ContainerInfo> containerInfoList =new ArrayList<>();
		if(containerSearchForm.getIsReserved()!= null && "Y".equals(containerSearchForm.getIsReserved())) {
			containerList = containerRepository.findByCatsStatusAndMrOrderCodeIsNull("RESERVED EXCESS");
		}else if(containerSearchForm.getContainerOnMrOrder()!=null && "Y".equals(containerSearchForm.getContainerOnMrOrder())) {
			containerList = containerRepository.findByCatsStatusAndMrOrderCodeIsNotNull("RESERVED EXCESS");
		}else if(containerSearchForm.getIncludeContainersOnReceived()!=null && "Y".equals(containerSearchForm.getIncludeContainersOnReceived())) {
			containerList = containerRepository.findByCatsStatus("RECEIVED");
		}else if(containerSearchForm.getSearchContainerNationwide()!=null && "Y".equals(containerSearchForm.getSearchContainerNationwide())) {
			containerList = containerRepository.findByCatsStatus("AVAILABLE EXCESS");
		}
		return containerInfoList;
	}
	
	/**
	 * @param UserInfo userInfo
	 * @return List<ContainerInfo> containerInfoList
	 */
	public List<ContainerInfo> getContainerList(UserInfo userInfo) {
		List<Container> containers = containerRepository.findAll();
		List<ContainerInfo> containerInfoList = new ArrayList<ContainerInfo>();

		/*
		 * filter container based on user location and that which is in available access
		 * at nation wide
		 */
		containers = containers.stream()
				.filter(container -> container.getCatsStatus().equals("EA")
						|| (container.getTerritory().equals(userInfo.getTerritory())
								&& container.getMarket().equals(userInfo.getMarket())
								&& container.getBuyer().getId() == userInfo.getId()))
				.collect(Collectors.toList());

		if (containers != null && !containers.isEmpty()) {
			for (Container container : containers) {
				ContainerInfo containerInfo = getContainerInfo(container);
				containerInfoList.add(containerInfo);
			}
		} else {
			logger.info("method :: getContainerListContainers ::: Containers not found");
		}
		return containerInfoList;
	}

	/**
	 * @param UserInfo userInfo
	 * @return List<ContainerInfo> containerInfoList
	 */
	public List<ContainerInfo> getReservedContainerByUser(final UserInfo userInfo) {
		List<Container> containers = containerRepository.findAllReservedContainerByUser(
				userInfo.getTerritory(), userInfo.getMarket(), userInfo.getId());
		List<ContainerInfo> containerInfoList = new ArrayList<ContainerInfo>();
		
		if (containers != null && !containers.isEmpty()) {
			for (Container container : containers) {
				ContainerInfo containerInfo = getContainerInfo(container);
				containerInfoList.add(containerInfo);
			}
		} else {
			logger.info("method :: getReservedContainerByUser ::: Containers not found");
		}

		return containerInfoList;
	}

}

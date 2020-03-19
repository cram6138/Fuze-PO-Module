package com.po.reservation.info;

import java.util.Date;
import java.util.List;


public class ContainerInfo {

	private int id;
	private String containerCode;
	private String MROrderCode;
	private String MRSource;
	private String territory;
	private String fuzeReservationId;
	private int fuzeProjectId;
	private String projectName;
	private String PSProject;
	private String pslc;
	private String reservedUsername;
	private Date useByDate;
	private Date reservationCreationDate;
	private String fuzeStatus;
	private String catsStatus;
	private String market;
	private String localMarket;
	private String subMarket;
	private int buyerId;
	private String buyerName;
	private List<ItemInfo> itemsInfo;
	
	public List<ItemInfo> getItemsInfo() {
		return itemsInfo;
	}

	public void setItemsInfo(List<ItemInfo> itemsInfo) {
		this.itemsInfo = itemsInfo;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getLocalMarket() {
		return localMarket;
	}

	public void setLocalMarket(String localMarket) {
		this.localMarket = localMarket;
	}

	public String getSubMarket() {
		return subMarket;
	}

	public void setSubMarket(String subMarket) {
		this.subMarket = subMarket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContainerCode() {
		return containerCode;
	}

	public void setContainerCode(String containerCode) {
		this.containerCode = containerCode;
	}

	public String getMROrderCode() {
		return MROrderCode;
	}

	public void setMROrderCode(String mROrderCode) {
		MROrderCode = mROrderCode;
	}

	public String getMRSource() {
		return MRSource;
	}

	public void setMRSource(String mRSource) {
		MRSource = mRSource;
	}

	public String getFuzeReservationId() {
		return fuzeReservationId;
	}

	public void setFuzeReservationId(String fuzeReservationId) {
		this.fuzeReservationId = fuzeReservationId;
	}

	public String getPSProject() {
		return PSProject;
	}

	public void setPSProject(String pSProject) {
		PSProject = pSProject;
	}

	public String getPslc() {
		return pslc;
	}

	public void setPslc(String pslc) {
		this.pslc = pslc;
	}

	public String getReservedUsername() {
		return reservedUsername;
	}
	

	public int getFuzeProjectId() {
		return fuzeProjectId;
	}

	public void setFuzeProjectId(int fuzeProjectId) {
		this.fuzeProjectId = fuzeProjectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public void setReservedUsername(String reservedUsername) {
		this.reservedUsername = reservedUsername;
	}

	

	public Date getUseByDate() {
		return useByDate;
	}

	public void setUseByDate(Date useByDate) {
		this.useByDate = useByDate;
	}

	public Date getReservationCreationDate() {
		return reservationCreationDate;
	}

	public void setReservationCreationDate(Date reservationCreationDate) {
		this.reservationCreationDate = reservationCreationDate;
	}

	public String getFuzeStatus() {
		return fuzeStatus;
	}

	public void setFuzeStatus(String fuzeStatus) {
		this.fuzeStatus = fuzeStatus;
	}

	public String getCatsStatus() {
		return catsStatus;
	}

	public void setCatsStatus(String catsStatus) {
		this.catsStatus = catsStatus;
	}


}

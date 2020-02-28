//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.28 at 11:16:20 AM IST 
//


package com.fuze.po.PurchaseOrderAppServices.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pslc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="psProject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="projectStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="projectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerProjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siteTracker" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "siteName",
    "projectName",
    "projectId",
    "pslc",
    "psProject",
    "projectStatus",
    "type",
    "projectType",
    "customerProjectType",
    "siteTracker",
    "status"
})
@XmlRootElement(name = "POReqEditRequest", namespace = "http://www.poreqeditproducer.com/poreqedit")
public class POReqEditRequest {

    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit")
    protected int id;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String siteName;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String projectName;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String projectId;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String pslc;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String psProject;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String projectStatus;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String type;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String projectType;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String customerProjectType;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String siteTracker;
    @XmlElement(namespace = "http://www.poreqeditproducer.com/poreqedit", required = true)
    protected String status;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the pslc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPslc() {
        return pslc;
    }

    /**
     * Sets the value of the pslc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPslc(String value) {
        this.pslc = value;
    }

    /**
     * Gets the value of the psProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsProject() {
        return psProject;
    }

    /**
     * Sets the value of the psProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsProject(String value) {
        this.psProject = value;
    }

    /**
     * Gets the value of the projectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * Sets the value of the projectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectStatus(String value) {
        this.projectStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectType(String value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the customerProjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProjectType() {
        return customerProjectType;
    }

    /**
     * Sets the value of the customerProjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProjectType(String value) {
        this.customerProjectType = value;
    }

    /**
     * Gets the value of the siteTracker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTracker() {
        return siteTracker;
    }

    /**
     * Sets the value of the siteTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTracker(String value) {
        this.siteTracker = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}

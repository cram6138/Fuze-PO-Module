//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.27 at 05:27:33 PM IST 
//


package com.poreqeditproducer.poreqedit;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poreqeditpojo" type="{http://www.poreqeditproducer.com/poreqedit}poreqeditpojo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "poreqeditpojo"
})
@XmlRootElement(name = "POReqEditResponse")
public class POReqEditResponse {

    @XmlElement(required = true)
    protected Poreqeditpojo poreqeditpojo;

    /**
     * Gets the value of the poreqeditpojo property.
     * 
     * @return
     *     possible object is
     *     {@link Poreqeditpojo }
     *     
     */
    public Poreqeditpojo getPoreqeditpojo() {
        return poreqeditpojo;
    }

    /**
     * Sets the value of the poreqeditpojo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poreqeditpojo }
     *     
     */
    public void setPoreqeditpojo(Poreqeditpojo value) {
        this.poreqeditpojo = value;
    }

}

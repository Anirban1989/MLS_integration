//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 11:55:46 AM IST 
//


package rets1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reProperties",
    "reOffices",
    "reAgents",
    "reOfficeRosters",
    "reProspects",
    "reActivities",
    "reHistories",
    "rePublicRecords"
})
@XmlRootElement(name = "REData")
public class REData {

    @XmlElement(name = "REProperties")
    protected REProperties reProperties;
    @XmlElement(name = "REOffices")
    protected REOffices reOffices;
    @XmlElement(name = "REAgents")
    protected REAgents reAgents;
    @XmlElement(name = "REOfficeRosters")
    protected REOfficeRosters reOfficeRosters;
    @XmlElement(name = "REProspects")
    protected REProspects reProspects;
    @XmlElement(name = "REActivities")
    protected REActivities reActivities;
    @XmlElement(name = "REHistories")
    protected REHistories reHistories;
    @XmlElement(name = "REPublicRecords")
    protected REPublicRecords rePublicRecords;

    /**
     * Gets the value of the reProperties property.
     * 
     * @return
     *     possible object is
     *     {@link REProperties }
     *     
     */
    public REProperties getREProperties() {
        return reProperties;
    }

    /**
     * Sets the value of the reProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link REProperties }
     *     
     */
    public void setREProperties(REProperties value) {
        this.reProperties = value;
    }

    /**
     * Gets the value of the reOffices property.
     * 
     * @return
     *     possible object is
     *     {@link REOffices }
     *     
     */
    public REOffices getREOffices() {
        return reOffices;
    }

    /**
     * Sets the value of the reOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOffices }
     *     
     */
    public void setREOffices(REOffices value) {
        this.reOffices = value;
    }

    /**
     * Gets the value of the reAgents property.
     * 
     * @return
     *     possible object is
     *     {@link REAgents }
     *     
     */
    public REAgents getREAgents() {
        return reAgents;
    }

    /**
     * Sets the value of the reAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link REAgents }
     *     
     */
    public void setREAgents(REAgents value) {
        this.reAgents = value;
    }

    /**
     * Gets the value of the reOfficeRosters property.
     * 
     * @return
     *     possible object is
     *     {@link REOfficeRosters }
     *     
     */
    public REOfficeRosters getREOfficeRosters() {
        return reOfficeRosters;
    }

    /**
     * Sets the value of the reOfficeRosters property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOfficeRosters }
     *     
     */
    public void setREOfficeRosters(REOfficeRosters value) {
        this.reOfficeRosters = value;
    }

    /**
     * Gets the value of the reProspects property.
     * 
     * @return
     *     possible object is
     *     {@link REProspects }
     *     
     */
    public REProspects getREProspects() {
        return reProspects;
    }

    /**
     * Sets the value of the reProspects property.
     * 
     * @param value
     *     allowed object is
     *     {@link REProspects }
     *     
     */
    public void setREProspects(REProspects value) {
        this.reProspects = value;
    }

    /**
     * Gets the value of the reActivities property.
     * 
     * @return
     *     possible object is
     *     {@link REActivities }
     *     
     */
    public REActivities getREActivities() {
        return reActivities;
    }

    /**
     * Sets the value of the reActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link REActivities }
     *     
     */
    public void setREActivities(REActivities value) {
        this.reActivities = value;
    }

    /**
     * Gets the value of the reHistories property.
     * 
     * @return
     *     possible object is
     *     {@link REHistories }
     *     
     */
    public REHistories getREHistories() {
        return reHistories;
    }

    /**
     * Sets the value of the reHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link REHistories }
     *     
     */
    public void setREHistories(REHistories value) {
        this.reHistories = value;
    }

    /**
     * Gets the value of the rePublicRecords property.
     * 
     * @return
     *     possible object is
     *     {@link REPublicRecords }
     *     
     */
    public REPublicRecords getREPublicRecords() {
        return rePublicRecords;
    }

    /**
     * Sets the value of the rePublicRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPublicRecords }
     *     
     */
    public void setREPublicRecords(REPublicRecords value) {
        this.rePublicRecords = value;
    }

}

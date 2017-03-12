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
    "activityID",
    "startDateTime",
    "endDateTime",
    "activityClassification",
    "activityStatus",
    "regarding",
    "activityComments",
    "activityAgent",
    "activityOffice",
    "modificationTimestamp"
})
@XmlRootElement(name = "Event")
public class Event {

    @XmlElement(name = "ActivityID")
    protected String activityID;
    @XmlElement(name = "StartDateTime")
    protected StartDateTime startDateTime;
    @XmlElement(name = "EndDateTime")
    protected EndDateTime endDateTime;
    @XmlElement(name = "ActivityClassification")
    protected ActivityClassification activityClassification;
    @XmlElement(name = "ActivityStatus")
    protected ActivityStatus activityStatus;
    @XmlElement(name = "Regarding")
    protected String regarding;
    @XmlElement(name = "ActivityComments")
    protected String activityComments;
    @XmlElement(name = "ActivityAgent")
    protected ActivityAgent activityAgent;
    @XmlElement(name = "ActivityOffice")
    protected ActivityOffice activityOffice;
    @XmlElement(name = "ModificationTimestamp")
    protected ModificationTimestamp modificationTimestamp;

    /**
     * Gets the value of the activityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityID(String value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateTime }
     *     
     */
    public StartDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateTime }
     *     
     */
    public void setStartDateTime(StartDateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link EndDateTime }
     *     
     */
    public EndDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateTime }
     *     
     */
    public void setEndDateTime(EndDateTime value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the activityClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityClassification }
     *     
     */
    public ActivityClassification getActivityClassification() {
        return activityClassification;
    }

    /**
     * Sets the value of the activityClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityClassification }
     *     
     */
    public void setActivityClassification(ActivityClassification value) {
        this.activityClassification = value;
    }

    /**
     * Gets the value of the activityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityStatus }
     *     
     */
    public ActivityStatus getActivityStatus() {
        return activityStatus;
    }

    /**
     * Sets the value of the activityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStatus }
     *     
     */
    public void setActivityStatus(ActivityStatus value) {
        this.activityStatus = value;
    }

    /**
     * Gets the value of the regarding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegarding() {
        return regarding;
    }

    /**
     * Sets the value of the regarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegarding(String value) {
        this.regarding = value;
    }

    /**
     * Gets the value of the activityComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityComments() {
        return activityComments;
    }

    /**
     * Sets the value of the activityComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityComments(String value) {
        this.activityComments = value;
    }

    /**
     * Gets the value of the activityAgent property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAgent }
     *     
     */
    public ActivityAgent getActivityAgent() {
        return activityAgent;
    }

    /**
     * Sets the value of the activityAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAgent }
     *     
     */
    public void setActivityAgent(ActivityAgent value) {
        this.activityAgent = value;
    }

    /**
     * Gets the value of the activityOffice property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityOffice }
     *     
     */
    public ActivityOffice getActivityOffice() {
        return activityOffice;
    }

    /**
     * Sets the value of the activityOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityOffice }
     *     
     */
    public void setActivityOffice(ActivityOffice value) {
        this.activityOffice = value;
    }

    /**
     * Gets the value of the modificationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationTimestamp }
     *     
     */
    public ModificationTimestamp getModificationTimestamp() {
        return modificationTimestamp;
    }

    /**
     * Sets the value of the modificationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationTimestamp }
     *     
     */
    public void setModificationTimestamp(ModificationTimestamp value) {
        this.modificationTimestamp = value;
    }

}

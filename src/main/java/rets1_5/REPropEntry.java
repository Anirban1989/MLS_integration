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
    "entryID",
    "listingID",
    "entryAgent",
    "entryOffice",
    "changeType",
    "propertyRecord",
    "modificationTimestamp"
})
@XmlRootElement(name = "REPropEntry")
public class REPropEntry {

    @XmlElement(name = "EntryID")
    protected String entryID;
    @XmlElement(name = "ListingID")
    protected ListingID listingID;
    @XmlElement(name = "EntryAgent")
    protected EntryAgent entryAgent;
    @XmlElement(name = "EntryOffice")
    protected EntryOffice entryOffice;
    @XmlElement(name = "ChangeType")
    protected ChangeType changeType;
    @XmlElement(name = "PropertyRecord")
    protected PropertyRecord propertyRecord;
    @XmlElement(name = "ModificationTimestamp")
    protected ModificationTimestamp modificationTimestamp;

    /**
     * Gets the value of the entryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryID() {
        return entryID;
    }

    /**
     * Sets the value of the entryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryID(String value) {
        this.entryID = value;
    }

    /**
     * Gets the value of the listingID property.
     * 
     * @return
     *     possible object is
     *     {@link ListingID }
     *     
     */
    public ListingID getListingID() {
        return listingID;
    }

    /**
     * Sets the value of the listingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingID }
     *     
     */
    public void setListingID(ListingID value) {
        this.listingID = value;
    }

    /**
     * Gets the value of the entryAgent property.
     * 
     * @return
     *     possible object is
     *     {@link EntryAgent }
     *     
     */
    public EntryAgent getEntryAgent() {
        return entryAgent;
    }

    /**
     * Sets the value of the entryAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryAgent }
     *     
     */
    public void setEntryAgent(EntryAgent value) {
        this.entryAgent = value;
    }

    /**
     * Gets the value of the entryOffice property.
     * 
     * @return
     *     possible object is
     *     {@link EntryOffice }
     *     
     */
    public EntryOffice getEntryOffice() {
        return entryOffice;
    }

    /**
     * Sets the value of the entryOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryOffice }
     *     
     */
    public void setEntryOffice(EntryOffice value) {
        this.entryOffice = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeType }
     *     
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeType }
     *     
     */
    public void setChangeType(ChangeType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the propertyRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRecord }
     *     
     */
    public PropertyRecord getPropertyRecord() {
        return propertyRecord;
    }

    /**
     * Sets the value of the propertyRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRecord }
     *     
     */
    public void setPropertyRecord(PropertyRecord value) {
        this.propertyRecord = value;
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

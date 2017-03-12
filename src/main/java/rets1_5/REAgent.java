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
    "firstName",
    "lastName",
    "contactInformation",
    "streetAddress",
    "listingServiceName",
    "agentID",
    "nrdsMemberID",
    "officeID",
    "brokerID",
    "modificationTimestamp"
})
@XmlRootElement(name = "REAgent")
public class REAgent {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ContactInformation")
    protected ContactInformation contactInformation;
    @XmlElement(name = "StreetAddress")
    protected StreetAddress streetAddress;
    @XmlElement(name = "ListingServiceName")
    protected String listingServiceName;
    @XmlElement(name = "AgentID")
    protected AgentID agentID;
    @XmlElement(name = "NRDSMemberID")
    protected String nrdsMemberID;
    @XmlElement(name = "OfficeID")
    protected OfficeID officeID;
    @XmlElement(name = "BrokerID")
    protected String brokerID;
    @XmlElement(name = "ModificationTimestamp")
    protected ModificationTimestamp modificationTimestamp;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddress }
     *     
     */
    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddress }
     *     
     */
    public void setStreetAddress(StreetAddress value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the listingServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingServiceName() {
        return listingServiceName;
    }

    /**
     * Sets the value of the listingServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingServiceName(String value) {
        this.listingServiceName = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link AgentID }
     *     
     */
    public AgentID getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentID }
     *     
     */
    public void setAgentID(AgentID value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the nrdsMemberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRDSMemberID() {
        return nrdsMemberID;
    }

    /**
     * Sets the value of the nrdsMemberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRDSMemberID(String value) {
        this.nrdsMemberID = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeID }
     *     
     */
    public OfficeID getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeID }
     *     
     */
    public void setOfficeID(OfficeID value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the brokerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerID() {
        return brokerID;
    }

    /**
     * Sets the value of the brokerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerID(String value) {
        this.brokerID = value;
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

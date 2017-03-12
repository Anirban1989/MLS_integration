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
    "streetAddress",
    "mailingAddress",
    "taxID",
    "county",
    "modificationTimestamp",
    "legalDescription",
    "ownersName",
    "assessedValuation",
    "propertyZoning",
    "parcelMapURL"
})
@XmlRootElement(name = "TaxData")
public class TaxData {

    @XmlElement(name = "StreetAddress")
    protected StreetAddress streetAddress;
    @XmlElement(name = "MailingAddress")
    protected MailingAddress mailingAddress;
    @XmlElement(name = "TaxID")
    protected String taxID;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "ModificationTimestamp")
    protected ModificationTimestamp modificationTimestamp;
    @XmlElement(name = "LegalDescription")
    protected String legalDescription;
    @XmlElement(name = "OwnersName")
    protected String ownersName;
    @XmlElement(name = "AssessedValuation")
    protected AssessedValuation assessedValuation;
    @XmlElement(name = "PropertyZoning")
    protected String propertyZoning;
    @XmlElement(name = "ParcelMapURL")
    protected String parcelMapURL;

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
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailingAddress }
     *     
     */
    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingAddress }
     *     
     */
    public void setMailingAddress(MailingAddress value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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

    /**
     * Gets the value of the legalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDescription() {
        return legalDescription;
    }

    /**
     * Sets the value of the legalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDescription(String value) {
        this.legalDescription = value;
    }

    /**
     * Gets the value of the ownersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnersName() {
        return ownersName;
    }

    /**
     * Sets the value of the ownersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnersName(String value) {
        this.ownersName = value;
    }

    /**
     * Gets the value of the assessedValuation property.
     * 
     * @return
     *     possible object is
     *     {@link AssessedValuation }
     *     
     */
    public AssessedValuation getAssessedValuation() {
        return assessedValuation;
    }

    /**
     * Sets the value of the assessedValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessedValuation }
     *     
     */
    public void setAssessedValuation(AssessedValuation value) {
        this.assessedValuation = value;
    }

    /**
     * Gets the value of the propertyZoning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyZoning() {
        return propertyZoning;
    }

    /**
     * Sets the value of the propertyZoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyZoning(String value) {
        this.propertyZoning = value;
    }

    /**
     * Gets the value of the parcelMapURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelMapURL() {
        return parcelMapURL;
    }

    /**
     * Sets the value of the parcelMapURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelMapURL(String value) {
        this.parcelMapURL = value;
    }

}

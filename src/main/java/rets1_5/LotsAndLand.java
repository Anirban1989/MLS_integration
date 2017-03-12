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
    "listing",
    "lotSize",
    "utilities",
    "presentUse",
    "topography",
    "parcelAccess",
    "developmentStatus",
    "existingStructures"
})
@XmlRootElement(name = "LotsAndLand")
public class LotsAndLand {

    @XmlElement(name = "Listing")
    protected Listing listing;
    @XmlElement(name = "LotSize")
    protected LotSize lotSize;
    @XmlElement(name = "Utilities")
    protected Utilities utilities;
    @XmlElement(name = "PresentUse")
    protected String presentUse;
    @XmlElement(name = "Topography")
    protected String topography;
    @XmlElement(name = "ParcelAccess")
    protected String parcelAccess;
    @XmlElement(name = "DevelopmentStatus")
    protected String developmentStatus;
    @XmlElement(name = "ExistingStructures")
    protected String existingStructures;

    /**
     * Gets the value of the listing property.
     * 
     * @return
     *     possible object is
     *     {@link Listing }
     *     
     */
    public Listing getListing() {
        return listing;
    }

    /**
     * Sets the value of the listing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listing }
     *     
     */
    public void setListing(Listing value) {
        this.listing = value;
    }

    /**
     * Gets the value of the lotSize property.
     * 
     * @return
     *     possible object is
     *     {@link LotSize }
     *     
     */
    public LotSize getLotSize() {
        return lotSize;
    }

    /**
     * Sets the value of the lotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotSize }
     *     
     */
    public void setLotSize(LotSize value) {
        this.lotSize = value;
    }

    /**
     * Gets the value of the utilities property.
     * 
     * @return
     *     possible object is
     *     {@link Utilities }
     *     
     */
    public Utilities getUtilities() {
        return utilities;
    }

    /**
     * Sets the value of the utilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilities }
     *     
     */
    public void setUtilities(Utilities value) {
        this.utilities = value;
    }

    /**
     * Gets the value of the presentUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentUse() {
        return presentUse;
    }

    /**
     * Sets the value of the presentUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentUse(String value) {
        this.presentUse = value;
    }

    /**
     * Gets the value of the topography property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopography() {
        return topography;
    }

    /**
     * Sets the value of the topography property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopography(String value) {
        this.topography = value;
    }

    /**
     * Gets the value of the parcelAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelAccess() {
        return parcelAccess;
    }

    /**
     * Sets the value of the parcelAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelAccess(String value) {
        this.parcelAccess = value;
    }

    /**
     * Gets the value of the developmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentStatus() {
        return developmentStatus;
    }

    /**
     * Sets the value of the developmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentStatus(String value) {
        this.developmentStatus = value;
    }

    /**
     * Gets the value of the existingStructures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingStructures() {
        return existingStructures;
    }

    /**
     * Sets the value of the existingStructures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingStructures(String value) {
        this.existingStructures = value;
    }

}

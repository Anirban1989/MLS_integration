//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 11:55:46 AM IST 
//


package rets1_5;

import java.util.ArrayList;
import java.util.List;
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
    "reAgent",
    "reOffice",
    "listDate",
    "listPrice",
    "expirationDate",
    "showingInstructions",
    "listingType",
    "commission",
    "remarks",
    "publicRemarks"
})
@XmlRootElement(name = "ListingData")
public class ListingData {

    @XmlElement(name = "REAgent")
    protected List<REAgent> reAgent;
    @XmlElement(name = "REOffice")
    protected REOffice reOffice;
    @XmlElement(name = "ListDate")
    protected ListDate listDate;
    @XmlElement(name = "ListPrice")
    protected ListPrice listPrice;
    @XmlElement(name = "ExpirationDate")
    protected ExpirationDate expirationDate;
    @XmlElement(name = "ShowingInstructions")
    protected String showingInstructions;
    @XmlElement(name = "ListingType")
    protected String listingType;
    @XmlElement(name = "Commission")
    protected Commission commission;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "PublicRemarks")
    protected String publicRemarks;

    /**
     * Gets the value of the reAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REAgent }
     * 
     * 
     */
    public List<REAgent> getREAgent() {
        if (reAgent == null) {
            reAgent = new ArrayList<REAgent>();
        }
        return this.reAgent;
    }

    /**
     * Gets the value of the reOffice property.
     * 
     * @return
     *     possible object is
     *     {@link REOffice }
     *     
     */
    public REOffice getREOffice() {
        return reOffice;
    }

    /**
     * Sets the value of the reOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOffice }
     *     
     */
    public void setREOffice(REOffice value) {
        this.reOffice = value;
    }

    /**
     * Gets the value of the listDate property.
     * 
     * @return
     *     possible object is
     *     {@link ListDate }
     *     
     */
    public ListDate getListDate() {
        return listDate;
    }

    /**
     * Sets the value of the listDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDate }
     *     
     */
    public void setListDate(ListDate value) {
        this.listDate = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ListPrice }
     *     
     */
    public ListPrice getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPrice }
     *     
     */
    public void setListPrice(ListPrice value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDate }
     *     
     */
    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDate }
     *     
     */
    public void setExpirationDate(ExpirationDate value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the showingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowingInstructions() {
        return showingInstructions;
    }

    /**
     * Sets the value of the showingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowingInstructions(String value) {
        this.showingInstructions = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingType(String value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the publicRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicRemarks() {
        return publicRemarks;
    }

    /**
     * Sets the value of the publicRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicRemarks(String value) {
        this.publicRemarks = value;
    }

}

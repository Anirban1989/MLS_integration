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
    "pictureID",
    "modificationTimestamp",
    "url",
    "pictureCaption"
})
@XmlRootElement(name = "PictureData")
public class PictureData {

    @XmlElement(name = "PictureID")
    protected String pictureID;
    @XmlElement(name = "ModificationTimestamp")
    protected ModificationTimestamp modificationTimestamp;
    @XmlElement(name = "URL")
    protected URL url;
    @XmlElement(name = "PictureCaption")
    protected String pictureCaption;

    /**
     * Gets the value of the pictureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureID() {
        return pictureID;
    }

    /**
     * Sets the value of the pictureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureID(String value) {
        this.pictureID = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setURL(URL value) {
        this.url = value;
    }

    /**
     * Gets the value of the pictureCaption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureCaption() {
        return pictureCaption;
    }

    /**
     * Sets the value of the pictureCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureCaption(String value) {
        this.pictureCaption = value;
    }

}

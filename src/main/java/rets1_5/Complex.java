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
    "buildingType",
    "totalUnits",
    "buildingName",
    "complexFeatures"
})
@XmlRootElement(name = "Complex")
public class Complex {

    @XmlElement(name = "BuildingType")
    protected String buildingType;
    @XmlElement(name = "TotalUnits")
    protected TotalUnits totalUnits;
    @XmlElement(name = "BuildingName")
    protected String buildingName;
    @XmlElement(name = "ComplexFeatures")
    protected String complexFeatures;

    /**
     * Gets the value of the buildingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingType(String value) {
        this.buildingType = value;
    }

    /**
     * Gets the value of the totalUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TotalUnits }
     *     
     */
    public TotalUnits getTotalUnits() {
        return totalUnits;
    }

    /**
     * Sets the value of the totalUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalUnits }
     *     
     */
    public void setTotalUnits(TotalUnits value) {
        this.totalUnits = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the complexFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexFeatures() {
        return complexFeatures;
    }

    /**
     * Sets the value of the complexFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexFeatures(String value) {
        this.complexFeatures = value;
    }

}

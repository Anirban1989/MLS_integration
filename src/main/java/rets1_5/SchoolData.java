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
    "schoolDistrict",
    "elementarySchool",
    "middleSchool",
    "highSchool"
})
@XmlRootElement(name = "SchoolData")
public class SchoolData {

    @XmlElement(name = "SchoolDistrict")
    protected String schoolDistrict;
    @XmlElement(name = "ElementarySchool")
    protected String elementarySchool;
    @XmlElement(name = "MiddleSchool")
    protected String middleSchool;
    @XmlElement(name = "HighSchool")
    protected String highSchool;

    /**
     * Gets the value of the schoolDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    /**
     * Sets the value of the schoolDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrict(String value) {
        this.schoolDistrict = value;
    }

    /**
     * Gets the value of the elementarySchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementarySchool() {
        return elementarySchool;
    }

    /**
     * Sets the value of the elementarySchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementarySchool(String value) {
        this.elementarySchool = value;
    }

    /**
     * Gets the value of the middleSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleSchool() {
        return middleSchool;
    }

    /**
     * Sets the value of the middleSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleSchool(String value) {
        this.middleSchool = value;
    }

    /**
     * Gets the value of the highSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * Sets the value of the highSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighSchool(String value) {
        this.highSchool = value;
    }

}
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
    "board",
    "profSequence",
    "profDirections",
    "profComments",
    "profOptions"
})
@XmlRootElement(name = "ProfDetails")
public class ProfDetails {

    @XmlElement(name = "Board")
    protected String board;
    @XmlElement(name = "ProfSequence")
    protected ProfSequence profSequence;
    @XmlElement(name = "ProfDirections")
    protected String profDirections;
    @XmlElement(name = "ProfComments")
    protected String profComments;
    @XmlElement(name = "ProfOptions")
    protected ProfOptions profOptions;

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoard(String value) {
        this.board = value;
    }

    /**
     * Gets the value of the profSequence property.
     * 
     * @return
     *     possible object is
     *     {@link ProfSequence }
     *     
     */
    public ProfSequence getProfSequence() {
        return profSequence;
    }

    /**
     * Sets the value of the profSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfSequence }
     *     
     */
    public void setProfSequence(ProfSequence value) {
        this.profSequence = value;
    }

    /**
     * Gets the value of the profDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfDirections() {
        return profDirections;
    }

    /**
     * Sets the value of the profDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfDirections(String value) {
        this.profDirections = value;
    }

    /**
     * Gets the value of the profComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfComments() {
        return profComments;
    }

    /**
     * Sets the value of the profComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfComments(String value) {
        this.profComments = value;
    }

    /**
     * Gets the value of the profOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProfOptions }
     *     
     */
    public ProfOptions getProfOptions() {
        return profOptions;
    }

    /**
     * Sets the value of the profOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfOptions }
     *     
     */
    public void setProfOptions(ProfOptions value) {
        this.profOptions = value;
    }

}

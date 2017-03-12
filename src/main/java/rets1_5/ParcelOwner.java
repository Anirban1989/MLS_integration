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
    "ownersName",
    "ownershipType",
    "person"
})
@XmlRootElement(name = "ParcelOwner")
public class ParcelOwner {

    @XmlElement(name = "OwnersName")
    protected String ownersName;
    @XmlElement(name = "OwnershipType")
    protected String ownershipType;
    @XmlElement(name = "Person")
    protected List<Person> person;

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
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipType(String value) {
        this.ownershipType = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPerson() {
        if (person == null) {
            person = new ArrayList<Person>();
        }
        return this.person;
    }

}

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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agentIDOrREAgent"
})
@XmlRootElement(name = "EntryAgent")
public class EntryAgent {

    @XmlElements({
        @XmlElement(name = "AgentID", type = AgentID.class),
        @XmlElement(name = "REAgent", type = REAgent.class)
    })
    protected List<Object> agentIDOrREAgent;

    /**
     * Gets the value of the agentIDOrREAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIDOrREAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentIDOrREAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentID }
     * {@link REAgent }
     * 
     * 
     */
    public List<Object> getAgentIDOrREAgent() {
        if (agentIDOrREAgent == null) {
            agentIDOrREAgent = new ArrayList<Object>();
        }
        return this.agentIDOrREAgent;
    }

}

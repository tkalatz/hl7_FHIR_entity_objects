//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * 
 * <p>Java class for Provenance.Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provenance.Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}ProvenanceEntityRole"/>
 *         &lt;element name="what" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="agent" type="{http://hl7.org/fhir}Provenance.Agent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance.Entity", propOrder = {
    "role",
    "what",
    "agent"
})
public class ProvenanceEntity
    extends BackboneElement
{

    @XmlElement(required = true)
    protected ProvenanceEntityRole role;
    @XmlElement(required = true)
    protected Reference what;
    protected List<ProvenanceAgent> agent;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public ProvenanceEntityRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public void setRole(ProvenanceEntityRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the what property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getWhat() {
        return what;
    }

    /**
     * Sets the value of the what property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setWhat(Reference value) {
        this.what = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvenanceAgent }
     * 
     * 
     */
    public List<ProvenanceAgent> getAgent() {
        if (agent == null) {
            agent = new ArrayList<ProvenanceAgent>();
        }
        return this.agent;
    }

}

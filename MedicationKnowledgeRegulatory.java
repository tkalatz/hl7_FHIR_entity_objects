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
 * Information about a medication that is used to support knowledge.
 * 
 * <p>Java class for MedicationKnowledge.Regulatory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationKnowledge.Regulatory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="regulatoryAuthority" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationKnowledge.Substitution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxDispense" type="{http://hl7.org/fhir}MedicationKnowledge.MaxDispense" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationKnowledge.Regulatory", propOrder = {
    "regulatoryAuthority",
    "substitution",
    "schedule",
    "maxDispense"
})
public class MedicationKnowledgeRegulatory
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference regulatoryAuthority;
    protected List<MedicationKnowledgeSubstitution> substitution;
    protected List<CodeableConcept> schedule;
    protected MedicationKnowledgeMaxDispense maxDispense;

    /**
     * Gets the value of the regulatoryAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRegulatoryAuthority() {
        return regulatoryAuthority;
    }

    /**
     * Sets the value of the regulatoryAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRegulatoryAuthority(Reference value) {
        this.regulatoryAuthority = value;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeSubstitution }
     * 
     * 
     */
    public List<MedicationKnowledgeSubstitution> getSubstitution() {
        if (substitution == null) {
            substitution = new ArrayList<MedicationKnowledgeSubstitution>();
        }
        return this.substitution;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<CodeableConcept>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the maxDispense property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationKnowledgeMaxDispense }
     *     
     */
    public MedicationKnowledgeMaxDispense getMaxDispense() {
        return maxDispense;
    }

    /**
     * Sets the value of the maxDispense property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationKnowledgeMaxDispense }
     *     
     */
    public void setMaxDispense(MedicationKnowledgeMaxDispense value) {
        this.maxDispense = value;
    }

}

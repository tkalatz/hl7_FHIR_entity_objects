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
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (eg population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
 * 
 * <p>Java class for Evidence.VariableDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Evidence.VariableDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variableRole" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="observed" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="intended" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="directnessMatch" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Evidence.VariableDefinition", propOrder = {
    "description",
    "note",
    "variableRole",
    "observed",
    "intended",
    "directnessMatch"
})
public class EvidenceVariableDefinition
    extends BackboneElement
{

    protected Markdown description;
    protected List<Annotation> note;
    @XmlElement(required = true)
    protected CodeableConcept variableRole;
    protected Reference observed;
    protected Reference intended;
    protected CodeableConcept directnessMatch;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDescription(Markdown value) {
        this.description = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNote() {
        if (note == null) {
            note = new ArrayList<Annotation>();
        }
        return this.note;
    }

    /**
     * Gets the value of the variableRole property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVariableRole() {
        return variableRole;
    }

    /**
     * Sets the value of the variableRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVariableRole(CodeableConcept value) {
        this.variableRole = value;
    }

    /**
     * Gets the value of the observed property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getObserved() {
        return observed;
    }

    /**
     * Sets the value of the observed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setObserved(Reference value) {
        this.observed = value;
    }

    /**
     * Gets the value of the intended property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getIntended() {
        return intended;
    }

    /**
     * Sets the value of the intended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setIntended(Reference value) {
        this.intended = value;
    }

    /**
     * Gets the value of the directnessMatch property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDirectnessMatch() {
        return directnessMatch;
    }

    /**
     * Sets the value of the directnessMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDirectnessMatch(CodeableConcept value) {
        this.directnessMatch = value;
    }

}

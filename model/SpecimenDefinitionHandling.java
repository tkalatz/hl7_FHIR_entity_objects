//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A kind of specimen with associated set of requirements.
 * 
 * <p>Java class for SpecimenDefinition.Handling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecimenDefinition.Handling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="temperatureQualifier" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="temperatureRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="maxDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="instruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecimenDefinition.Handling", propOrder = {
    "temperatureQualifier",
    "temperatureRange",
    "maxDuration",
    "instruction"
})
public class SpecimenDefinitionHandling
    extends BackboneElement
{

    protected CodeableConcept temperatureQualifier;
    protected Range temperatureRange;
    protected Duration maxDuration;
    protected String instruction;

    /**
     * Gets the value of the temperatureQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getTemperatureQualifier() {
        return temperatureQualifier;
    }

    /**
     * Sets the value of the temperatureQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setTemperatureQualifier(CodeableConcept value) {
        this.temperatureQualifier = value;
    }

    /**
     * Gets the value of the temperatureRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * Sets the value of the temperatureRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setTemperatureRange(Range value) {
        this.temperatureRange = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxDuration(Duration value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

}

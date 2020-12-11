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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Dosage.DoseAndRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dosage.DoseAndRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="doseRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="rateRatio" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="rateRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="rateQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dosage.DoseAndRate", propOrder = {
    "type",
    "doseRange",
    "doseQuantity",
    "rateRatio",
    "rateRange",
    "rateQuantity"
})
public class DosageDoseAndRate
    extends BackboneType
{

    protected CodeableConcept type;
    protected Range doseRange;
    protected Quantity doseQuantity;
    protected Ratio rateRatio;
    protected Range rateRange;
    protected Quantity rateQuantity;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the doseRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDoseRange() {
        return doseRange;
    }

    /**
     * Sets the value of the doseRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDoseRange(Range value) {
        this.doseRange = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDoseQuantity(Quantity value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the rateRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getRateRatio() {
        return rateRatio;
    }

    /**
     * Sets the value of the rateRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRateRatio(Ratio value) {
        this.rateRatio = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setRateRange(Range value) {
        this.rateRange = value;
    }

    /**
     * Gets the value of the rateQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getRateQuantity() {
        return rateQuantity;
    }

    /**
     * Sets the value of the rateQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setRateQuantity(Quantity value) {
        this.rateQuantity = value;
    }

}
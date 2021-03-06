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
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * 
 * <p>Java class for MedicationRequest.DispenseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationRequest.DispenseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="initialFill" type="{http://hl7.org/fhir}MedicationRequest.InitialFill" minOccurs="0"/>
 *         &lt;element name="dispenseInterval" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="validityPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="numberOfRepeatsAllowed" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="expectedSupplyDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="dispenser" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationRequest.DispenseRequest", propOrder = {
    "initialFill",
    "dispenseInterval",
    "validityPeriod",
    "numberOfRepeatsAllowed",
    "quantity",
    "expectedSupplyDuration",
    "dispenser"
})
public class MedicationRequestDispenseRequest
    extends BackboneElement
{

    protected MedicationRequestInitialFill initialFill;
    protected Duration dispenseInterval;
    protected Period validityPeriod;
    protected UnsignedInt numberOfRepeatsAllowed;
    protected Quantity quantity;
    protected Duration expectedSupplyDuration;
    protected Reference dispenser;

    /**
     * Gets the value of the initialFill property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationRequestInitialFill }
     *     
     */
    public MedicationRequestInitialFill getInitialFill() {
        return initialFill;
    }

    /**
     * Sets the value of the initialFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationRequestInitialFill }
     *     
     */
    public void setInitialFill(MedicationRequestInitialFill value) {
        this.initialFill = value;
    }

    /**
     * Gets the value of the dispenseInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDispenseInterval() {
        return dispenseInterval;
    }

    /**
     * Sets the value of the dispenseInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDispenseInterval(Duration value) {
        this.dispenseInterval = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValidityPeriod(Period value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the numberOfRepeatsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getNumberOfRepeatsAllowed() {
        return numberOfRepeatsAllowed;
    }

    /**
     * Sets the value of the numberOfRepeatsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setNumberOfRepeatsAllowed(UnsignedInt value) {
        this.numberOfRepeatsAllowed = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the expectedSupplyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedSupplyDuration() {
        return expectedSupplyDuration;
    }

    /**
     * Sets the value of the expectedSupplyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedSupplyDuration(Duration value) {
        this.expectedSupplyDuration = value;
    }

    /**
     * Gets the value of the dispenser property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDispenser() {
        return dispenser;
    }

    /**
     * Sets the value of the dispenser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDispenser(Reference value) {
        this.dispenser = value;
    }

}

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
 * A sample to be used for analysis.
 * 
 * <p>Java class for Specimen.Collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specimen.Collection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="collector" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="collectedDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="collectedPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="fastingStatusCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="fastingStatusDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Collection", propOrder = {
    "collector",
    "collectedDateTime",
    "collectedPeriod",
    "duration",
    "quantity",
    "method",
    "bodySite",
    "fastingStatusCodeableConcept",
    "fastingStatusDuration"
})
public class SpecimenCollection
    extends BackboneElement
{

    protected Reference collector;
    protected DateTime collectedDateTime;
    protected Period collectedPeriod;
    protected Duration duration;
    protected Quantity quantity;
    protected CodeableConcept method;
    protected CodeableConcept bodySite;
    protected CodeableConcept fastingStatusCodeableConcept;
    protected Duration fastingStatusDuration;

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCollector(Reference value) {
        this.collector = value;
    }

    /**
     * Gets the value of the collectedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCollectedDateTime() {
        return collectedDateTime;
    }

    /**
     * Sets the value of the collectedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCollectedDateTime(DateTime value) {
        this.collectedDateTime = value;
    }

    /**
     * Gets the value of the collectedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getCollectedPeriod() {
        return collectedPeriod;
    }

    /**
     * Sets the value of the collectedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setCollectedPeriod(Period value) {
        this.collectedPeriod = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
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
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * Sets the value of the bodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySite(CodeableConcept value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the fastingStatusCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getFastingStatusCodeableConcept() {
        return fastingStatusCodeableConcept;
    }

    /**
     * Sets the value of the fastingStatusCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setFastingStatusCodeableConcept(CodeableConcept value) {
        this.fastingStatusCodeableConcept = value;
    }

    /**
     * Gets the value of the fastingStatusDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFastingStatusDuration() {
        return fastingStatusDuration;
    }

    /**
     * Sets the value of the fastingStatusDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFastingStatusDuration(Duration value) {
        this.fastingStatusDuration = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for MarketingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="dateRange" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="restoreDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingStatus", propOrder = {
    "country",
    "jurisdiction",
    "status",
    "dateRange",
    "restoreDate"
})
public class MarketingStatus
    extends BackboneType
{

    protected CodeableConcept country;
    protected CodeableConcept jurisdiction;
    @XmlElement(required = true)
    protected CodeableConcept status;
    protected Period dateRange;
    protected DateTime restoreDate;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCountry(CodeableConcept value) {
        this.country = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setJurisdiction(CodeableConcept value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStatus(CodeableConcept value) {
        this.status = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setDateRange(Period value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the restoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRestoreDate() {
        return restoreDate;
    }

    /**
     * Sets the value of the restoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRestoreDate(DateTime value) {
        this.restoreDate = value;
    }

}
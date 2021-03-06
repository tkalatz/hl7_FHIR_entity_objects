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
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * 
 * <p>Java class for Goal.Target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goal.Target">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="measure" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="detailQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="detailRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="detailCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="detailString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="detailBoolean" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="detailInteger" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="detailRatio" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="dueDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal.Target", propOrder = {
    "measure",
    "detailQuantity",
    "detailRange",
    "detailCodeableConcept",
    "detailString",
    "detailBoolean",
    "detailInteger",
    "detailRatio",
    "dueDate",
    "dueDuration"
})
public class GoalTarget
    extends BackboneElement
{

    protected CodeableConcept measure;
    protected Quantity detailQuantity;
    protected Range detailRange;
    protected CodeableConcept detailCodeableConcept;
    protected String detailString;
    protected Boolean detailBoolean;
    protected Integer detailInteger;
    protected Ratio detailRatio;
    protected Date dueDate;
    protected Duration dueDuration;

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMeasure(CodeableConcept value) {
        this.measure = value;
    }

    /**
     * Gets the value of the detailQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDetailQuantity() {
        return detailQuantity;
    }

    /**
     * Sets the value of the detailQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDetailQuantity(Quantity value) {
        this.detailQuantity = value;
    }

    /**
     * Gets the value of the detailRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDetailRange() {
        return detailRange;
    }

    /**
     * Sets the value of the detailRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDetailRange(Range value) {
        this.detailRange = value;
    }

    /**
     * Gets the value of the detailCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDetailCodeableConcept() {
        return detailCodeableConcept;
    }

    /**
     * Sets the value of the detailCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDetailCodeableConcept(CodeableConcept value) {
        this.detailCodeableConcept = value;
    }

    /**
     * Gets the value of the detailString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailString() {
        return detailString;
    }

    /**
     * Sets the value of the detailString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailString(String value) {
        this.detailString = value;
    }

    /**
     * Gets the value of the detailBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDetailBoolean() {
        return detailBoolean;
    }

    /**
     * Sets the value of the detailBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailBoolean(Boolean value) {
        this.detailBoolean = value;
    }

    /**
     * Gets the value of the detailInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetailInteger() {
        return detailInteger;
    }

    /**
     * Sets the value of the detailInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetailInteger(Integer value) {
        this.detailInteger = value;
    }

    /**
     * Gets the value of the detailRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getDetailRatio() {
        return detailRatio;
    }

    /**
     * Sets the value of the detailRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setDetailRatio(Ratio value) {
        this.detailRatio = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the dueDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDueDuration() {
        return dueDuration;
    }

    /**
     * Sets the value of the dueDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDueDuration(Duration value) {
        this.dueDuration = value;
    }

}

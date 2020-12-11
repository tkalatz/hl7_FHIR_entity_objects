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
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * 
 * <p>Java class for Contract.Answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract.Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="valueTime" type="{http://hl7.org/fhir}time" minOccurs="0"/>
 *         &lt;element name="valueString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="valueUri" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment" minOccurs="0"/>
 *         &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract.Answer", propOrder = {
    "valueBoolean",
    "valueDecimal",
    "valueInteger",
    "valueDate",
    "valueDateTime",
    "valueTime",
    "valueString",
    "valueUri",
    "valueAttachment",
    "valueCoding",
    "valueQuantity",
    "valueReference"
})
public class ContractAnswer
    extends BackboneElement
{

    protected Boolean valueBoolean;
    protected Decimal valueDecimal;
    protected Integer valueInteger;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Time valueTime;
    protected String valueString;
    protected Uri valueUri;
    protected Attachment valueAttachment;
    protected Coding valueCoding;
    protected Quantity valueQuantity;
    protected Reference valueReference;

    /**
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Gets the value of the valueDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Sets the value of the valueDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * Gets the value of the valueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInteger(Integer value) {
        this.valueInteger = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * Gets the value of the valueTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getValueTime() {
        return valueTime;
    }

    /**
     * Sets the value of the valueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setValueTime(Time value) {
        this.valueTime = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * Sets the value of the valueUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * Gets the value of the valueAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * Sets the value of the valueAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * Gets the value of the valueCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * Sets the value of the valueCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * Sets the value of the valueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setValueReference(Reference value) {
        this.valueReference = value;
    }

}

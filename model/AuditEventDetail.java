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
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * 
 * <p>Java class for AuditEvent.Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent.Detail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="valueString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent.Detail", propOrder = {
    "type",
    "valueString",
    "valueBase64Binary"
})
public class AuditEventDetail
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String type;
    protected String valueString;
    protected Base64Binary valueBase64Binary;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the valueBase64Binary property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Sets the value of the valueBase64Binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
    }

}

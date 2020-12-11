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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Signature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DataType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded"/>
 *         &lt;element name="when" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="who" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="onBehalfOf" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="targetFormat" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="sigFormat" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "type",
    "when",
    "who",
    "onBehalfOf",
    "targetFormat",
    "sigFormat",
    "data"
})
public class Signature
    extends DataType
{

    @XmlElement(required = true)
    protected List<Coding> type;
    @XmlElement(required = true)
    protected Instant when;
    @XmlElement(required = true)
    protected Reference who;
    protected Reference onBehalfOf;
    protected Code targetFormat;
    protected Code sigFormat;
    protected Base64Binary data;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getType() {
        if (type == null) {
            type = new ArrayList<Coding>();
        }
        return this.type;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setWhen(Instant value) {
        this.when = value;
    }

    /**
     * Gets the value of the who property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getWho() {
        return who;
    }

    /**
     * Sets the value of the who property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setWho(Reference value) {
        this.who = value;
    }

    /**
     * Gets the value of the onBehalfOf property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOnBehalfOf() {
        return onBehalfOf;
    }

    /**
     * Sets the value of the onBehalfOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOnBehalfOf(Reference value) {
        this.onBehalfOf = value;
    }

    /**
     * Gets the value of the targetFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getTargetFormat() {
        return targetFormat;
    }

    /**
     * Sets the value of the targetFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setTargetFormat(Code value) {
        this.targetFormat = value;
    }

    /**
     * Gets the value of the sigFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSigFormat() {
        return sigFormat;
    }

    /**
     * Sets the value of the sigFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSigFormat(Code value) {
        this.sigFormat = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setData(Base64Binary value) {
        this.data = value;
    }

}
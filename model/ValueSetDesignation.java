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
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 * 
 * <p>Java class for ValueSet.Designation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Designation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Designation", propOrder = {
    "language",
    "use",
    "value"
})
public class ValueSetDesignation
    extends BackboneElement
{

    protected Code language;
    protected Coding use;
    @XmlElement(required = true)
    protected String value;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setUse(Coding value) {
        this.use = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}

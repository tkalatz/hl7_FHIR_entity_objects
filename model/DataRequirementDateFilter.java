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
 * <p>Java class for DataRequirement.DateFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRequirement.DateFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DataType">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="valueDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRequirement.DateFilter", propOrder = {
    "path",
    "searchParam",
    "valueDateTime",
    "valuePeriod",
    "valueDuration"
})
public class DataRequirementDateFilter
    extends DataType
{

    protected String path;
    protected String searchParam;
    protected DateTime valueDateTime;
    protected Period valuePeriod;
    protected Duration valueDuration;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the searchParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchParam() {
        return searchParam;
    }

    /**
     * Sets the value of the searchParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchParam(String value) {
        this.searchParam = value;
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
     * Gets the value of the valuePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * Sets the value of the valuePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * Gets the value of the valueDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getValueDuration() {
        return valueDuration;
    }

    /**
     * Sets the value of the valueDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setValueDuration(Duration value) {
        this.valueDuration = value;
    }

}
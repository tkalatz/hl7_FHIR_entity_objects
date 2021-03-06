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
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
 * 
 * <p>Java class for Citation.PeriodicRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citation.PeriodicRelease">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="citedMedium" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="issue" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dateOfPublication" type="{http://hl7.org/fhir}Citation.DateOfPublication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citation.PeriodicRelease", propOrder = {
    "citedMedium",
    "volume",
    "issue",
    "dateOfPublication"
})
public class CitationPeriodicRelease
    extends BackboneElement
{

    protected CodeableConcept citedMedium;
    protected String volume;
    protected String issue;
    protected CitationDateOfPublication dateOfPublication;

    /**
     * Gets the value of the citedMedium property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCitedMedium() {
        return citedMedium;
    }

    /**
     * Sets the value of the citedMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCitedMedium(CodeableConcept value) {
        this.citedMedium = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the dateOfPublication property.
     * 
     * @return
     *     possible object is
     *     {@link CitationDateOfPublication }
     *     
     */
    public CitationDateOfPublication getDateOfPublication() {
        return dateOfPublication;
    }

    /**
     * Sets the value of the dateOfPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationDateOfPublication }
     *     
     */
    public void setDateOfPublication(CitationDateOfPublication value) {
        this.dateOfPublication = value;
    }

}

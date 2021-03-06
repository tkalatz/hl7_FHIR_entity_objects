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
 * Raw data describing a biological sequence.
 * 
 * <p>Java class for MolecularSequence.Variant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MolecularSequence.Variant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="observedAllele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="referenceAllele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="cigar" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="variantPointer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MolecularSequence.Variant", propOrder = {
    "start",
    "end",
    "observedAllele",
    "referenceAllele",
    "cigar",
    "variantPointer"
})
public class MolecularSequenceVariant
    extends BackboneElement
{

    protected Integer start;
    protected Integer end;
    protected String observedAllele;
    protected String referenceAllele;
    protected String cigar;
    protected Reference variantPointer;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnd(Integer value) {
        this.end = value;
    }

    /**
     * Gets the value of the observedAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedAllele() {
        return observedAllele;
    }

    /**
     * Sets the value of the observedAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedAllele(String value) {
        this.observedAllele = value;
    }

    /**
     * Gets the value of the referenceAllele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAllele() {
        return referenceAllele;
    }

    /**
     * Sets the value of the referenceAllele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAllele(String value) {
        this.referenceAllele = value;
    }

    /**
     * Gets the value of the cigar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCigar() {
        return cigar;
    }

    /**
     * Sets the value of the cigar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCigar(String value) {
        this.cigar = value;
    }

    /**
     * Gets the value of the variantPointer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getVariantPointer() {
        return variantPointer;
    }

    /**
     * Sets the value of the variantPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setVariantPointer(Reference value) {
        this.variantPointer = value;
    }

}

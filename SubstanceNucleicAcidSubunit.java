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
import javax.xml.bind.annotation.XmlType;


/**
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5�-3� direction.
 * 
 * <p>Java class for SubstanceNucleicAcid.Subunit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceNucleicAcid.Subunit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="subunit" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="sequenceAttachment" type="{http://hl7.org/fhir}Attachment" minOccurs="0"/>
 *         &lt;element name="fivePrime" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="threePrime" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="linkage" type="{http://hl7.org/fhir}SubstanceNucleicAcid.Linkage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sugar" type="{http://hl7.org/fhir}SubstanceNucleicAcid.Sugar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceNucleicAcid.Subunit", propOrder = {
    "subunit",
    "sequence",
    "length",
    "sequenceAttachment",
    "fivePrime",
    "threePrime",
    "linkage",
    "sugar"
})
public class SubstanceNucleicAcidSubunit
    extends BackboneElement
{

    protected Integer subunit;
    protected String sequence;
    protected Integer length;
    protected Attachment sequenceAttachment;
    protected CodeableConcept fivePrime;
    protected CodeableConcept threePrime;
    protected List<SubstanceNucleicAcidLinkage> linkage;
    protected List<SubstanceNucleicAcidSugar> sugar;

    /**
     * Gets the value of the subunit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubunit() {
        return subunit;
    }

    /**
     * Sets the value of the subunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubunit(Integer value) {
        this.subunit = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the sequenceAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getSequenceAttachment() {
        return sequenceAttachment;
    }

    /**
     * Sets the value of the sequenceAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setSequenceAttachment(Attachment value) {
        this.sequenceAttachment = value;
    }

    /**
     * Gets the value of the fivePrime property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getFivePrime() {
        return fivePrime;
    }

    /**
     * Sets the value of the fivePrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setFivePrime(CodeableConcept value) {
        this.fivePrime = value;
    }

    /**
     * Gets the value of the threePrime property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getThreePrime() {
        return threePrime;
    }

    /**
     * Sets the value of the threePrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setThreePrime(CodeableConcept value) {
        this.threePrime = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceNucleicAcidLinkage }
     * 
     * 
     */
    public List<SubstanceNucleicAcidLinkage> getLinkage() {
        if (linkage == null) {
            linkage = new ArrayList<SubstanceNucleicAcidLinkage>();
        }
        return this.linkage;
    }

    /**
     * Gets the value of the sugar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sugar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSugar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceNucleicAcidSugar }
     * 
     * 
     */
    public List<SubstanceNucleicAcidSugar> getSugar() {
        if (sugar == null) {
            sugar = new ArrayList<SubstanceNucleicAcidSugar>();
        }
        return this.sugar;
    }

}

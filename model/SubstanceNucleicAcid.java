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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for SubstanceNucleicAcid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceNucleicAcid">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="sequenceType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="numberOfSubunits" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="areaOfHybridisation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="oligoNucleotideType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="subunit" type="{http://hl7.org/fhir}SubstanceNucleicAcid.Subunit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceNucleicAcid", propOrder = {
    "sequenceType",
    "numberOfSubunits",
    "areaOfHybridisation",
    "oligoNucleotideType",
    "subunit"
})
public class SubstanceNucleicAcid
    extends DomainResource
{

    protected CodeableConcept sequenceType;
    protected Integer numberOfSubunits;
    protected String areaOfHybridisation;
    protected CodeableConcept oligoNucleotideType;
    protected List<SubstanceNucleicAcidSubunit> subunit;

    /**
     * Gets the value of the sequenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSequenceType() {
        return sequenceType;
    }

    /**
     * Sets the value of the sequenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSequenceType(CodeableConcept value) {
        this.sequenceType = value;
    }

    /**
     * Gets the value of the numberOfSubunits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSubunits() {
        return numberOfSubunits;
    }

    /**
     * Sets the value of the numberOfSubunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSubunits(Integer value) {
        this.numberOfSubunits = value;
    }

    /**
     * Gets the value of the areaOfHybridisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaOfHybridisation() {
        return areaOfHybridisation;
    }

    /**
     * Sets the value of the areaOfHybridisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaOfHybridisation(String value) {
        this.areaOfHybridisation = value;
    }

    /**
     * Gets the value of the oligoNucleotideType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getOligoNucleotideType() {
        return oligoNucleotideType;
    }

    /**
     * Sets the value of the oligoNucleotideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setOligoNucleotideType(CodeableConcept value) {
        this.oligoNucleotideType = value;
    }

    /**
     * Gets the value of the subunit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subunit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubunit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceNucleicAcidSubunit }
     * 
     * 
     */
    public List<SubstanceNucleicAcidSubunit> getSubunit() {
        if (subunit == null) {
            subunit = new ArrayList<SubstanceNucleicAcidSubunit>();
        }
        return this.subunit;
    }

}
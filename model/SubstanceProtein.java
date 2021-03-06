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
 * <p>Java class for SubstanceProtein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceProtein">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="sequenceType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="numberOfSubunits" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="disulfideLinkage" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subunit" type="{http://hl7.org/fhir}SubstanceProtein.Subunit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceProtein", propOrder = {
    "sequenceType",
    "numberOfSubunits",
    "disulfideLinkage",
    "subunit"
})
public class SubstanceProtein
    extends DomainResource
{

    protected CodeableConcept sequenceType;
    protected Integer numberOfSubunits;
    protected List<String> disulfideLinkage;
    protected List<SubstanceProteinSubunit> subunit;

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
     * Gets the value of the disulfideLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disulfideLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisulfideLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisulfideLinkage() {
        if (disulfideLinkage == null) {
            disulfideLinkage = new ArrayList<String>();
        }
        return this.disulfideLinkage;
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
     * {@link SubstanceProteinSubunit }
     * 
     * 
     */
    public List<SubstanceProteinSubunit> getSubunit() {
        if (subunit == null) {
            subunit = new ArrayList<SubstanceProteinSubunit>();
        }
        return this.subunit;
    }

}

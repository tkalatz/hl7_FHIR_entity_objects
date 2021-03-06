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
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * 
 * <p>Java class for SubstanceDefinition.Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceDefinition.Property">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="definingSubstance" type="{http://hl7.org/fhir}CodeableReference" minOccurs="0"/>
 *         &lt;element name="amountQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="amountString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceDefinition.Property", propOrder = {
    "category",
    "code",
    "parameters",
    "definingSubstance",
    "amountQuantity",
    "amountString",
    "referenceRange",
    "source"
})
public class SubstanceDefinitionProperty
    extends BackboneElement
{

    protected CodeableConcept category;
    protected CodeableConcept code;
    protected String parameters;
    protected CodeableReference definingSubstance;
    protected Quantity amountQuantity;
    protected String amountString;
    protected Range referenceRange;
    protected List<Reference> source;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameters(String value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the definingSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableReference }
     *     
     */
    public CodeableReference getDefiningSubstance() {
        return definingSubstance;
    }

    /**
     * Sets the value of the definingSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableReference }
     *     
     */
    public void setDefiningSubstance(CodeableReference value) {
        this.definingSubstance = value;
    }

    /**
     * Gets the value of the amountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getAmountQuantity() {
        return amountQuantity;
    }

    /**
     * Sets the value of the amountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setAmountQuantity(Quantity value) {
        this.amountQuantity = value;
    }

    /**
     * Gets the value of the amountString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountString() {
        return amountString;
    }

    /**
     * Sets the value of the amountString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountString(String value) {
        this.amountString = value;
    }

    /**
     * Gets the value of the referenceRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getReferenceRange() {
        return referenceRange;
    }

    /**
     * Sets the value of the referenceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setReferenceRange(Range value) {
        this.referenceRange = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSource() {
        if (source == null) {
            source = new ArrayList<Reference>();
        }
        return this.source;
    }

}

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
 * Details of a Health Insurance product/plan provided by an organization.
 * 
 * <p>Java class for InsurancePlan.Benefit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsurancePlan.Benefit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="requirement" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://hl7.org/fhir}InsurancePlan.Limit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurancePlan.Benefit", propOrder = {
    "type",
    "requirement",
    "limit"
})
public class InsurancePlanBenefit
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected String requirement;
    protected List<InsurancePlanLimit> limit;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirement(String value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePlanLimit }
     * 
     * 
     */
    public List<InsurancePlanLimit> getLimit() {
        if (limit == null) {
            limit = new ArrayList<InsurancePlanLimit>();
        }
        return this.limit;
    }

}

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
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * 
 * <p>Java class for CoverageEligibilityRequest.SupportingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageEligibilityRequest.SupportingInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="information" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="appliesToAll" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageEligibilityRequest.SupportingInfo", propOrder = {
    "sequence",
    "information",
    "appliesToAll"
})
public class CoverageEligibilityRequestSupportingInfo
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected Reference information;
    protected Boolean appliesToAll;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequence(PositiveInt value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInformation(Reference value) {
        this.information = value;
    }

    /**
     * Gets the value of the appliesToAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAppliesToAll() {
        return appliesToAll;
    }

    /**
     * Sets the value of the appliesToAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToAll(Boolean value) {
        this.appliesToAll = value;
    }

}

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
 * A record of a healthcare consumerís  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * 
 * <p>Java class for Consent.Verification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consent.Verification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="verified" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="verificationType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="verifiedBy" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="verifiedWith" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="verificationDate" type="{http://hl7.org/fhir}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consent.Verification", propOrder = {
    "verified",
    "verificationType",
    "verifiedBy",
    "verifiedWith",
    "verificationDate"
})
public class ConsentVerification
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Boolean verified;
    protected CodeableConcept verificationType;
    protected Reference verifiedBy;
    protected Reference verifiedWith;
    protected List<DateTime> verificationDate;

    /**
     * Gets the value of the verified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerified(Boolean value) {
        this.verified = value;
    }

    /**
     * Gets the value of the verificationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVerificationType() {
        return verificationType;
    }

    /**
     * Sets the value of the verificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVerificationType(CodeableConcept value) {
        this.verificationType = value;
    }

    /**
     * Gets the value of the verifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getVerifiedBy() {
        return verifiedBy;
    }

    /**
     * Sets the value of the verifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setVerifiedBy(Reference value) {
        this.verifiedBy = value;
    }

    /**
     * Gets the value of the verifiedWith property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getVerifiedWith() {
        return verifiedWith;
    }

    /**
     * Sets the value of the verifiedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setVerifiedWith(Reference value) {
        this.verifiedWith = value;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verificationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerificationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTime }
     * 
     * 
     */
    public List<DateTime> getVerificationDate() {
        if (verificationDate == null) {
            verificationDate = new ArrayList<DateTime>();
        }
        return this.verificationDate;
    }

}

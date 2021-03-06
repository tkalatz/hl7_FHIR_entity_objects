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
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 * 
 * <p>Java class for CoverageEligibilityRequest.Diagnosis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageEligibilityRequest.Diagnosis">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="diagnosisCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="diagnosisReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageEligibilityRequest.Diagnosis", propOrder = {
    "diagnosisCodeableConcept",
    "diagnosisReference"
})
public class CoverageEligibilityRequestDiagnosis
    extends BackboneElement
{

    protected CodeableConcept diagnosisCodeableConcept;
    protected Reference diagnosisReference;

    /**
     * Gets the value of the diagnosisCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDiagnosisCodeableConcept() {
        return diagnosisCodeableConcept;
    }

    /**
     * Sets the value of the diagnosisCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDiagnosisCodeableConcept(CodeableConcept value) {
        this.diagnosisCodeableConcept = value;
    }

    /**
     * Gets the value of the diagnosisReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDiagnosisReference() {
        return diagnosisReference;
    }

    /**
     * Sets the value of the diagnosisReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDiagnosisReference(Reference value) {
        this.diagnosisReference = value;
    }

}

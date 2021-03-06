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
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 * 
 * <p>Java class for Composition.RelatesTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Composition.RelatesTo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}DocumentRelationshipType"/>
 *         &lt;element name="targetIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="targetReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composition.RelatesTo", propOrder = {
    "code",
    "targetIdentifier",
    "targetReference"
})
public class CompositionRelatesTo
    extends BackboneElement
{

    @XmlElement(required = true)
    protected DocumentRelationshipType code;
    protected Identifier targetIdentifier;
    protected Reference targetReference;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRelationshipType }
     *     
     */
    public DocumentRelationshipType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRelationshipType }
     *     
     */
    public void setCode(DocumentRelationshipType value) {
        this.code = value;
    }

    /**
     * Gets the value of the targetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getTargetIdentifier() {
        return targetIdentifier;
    }

    /**
     * Sets the value of the targetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setTargetIdentifier(Identifier value) {
        this.targetIdentifier = value;
    }

    /**
     * Gets the value of the targetReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTargetReference() {
        return targetReference;
    }

    /**
     * Sets the value of the targetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTargetReference(Reference value) {
        this.targetReference = value;
    }

}

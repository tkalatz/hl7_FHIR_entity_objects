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
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 * 
 * <p>Java class for VisionPrescription.Prism complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisionPrescription.Prism">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}VisionBase"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisionPrescription.Prism", propOrder = {
    "amount",
    "base"
})
public class VisionPrescriptionPrism
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Decimal amount;
    @XmlElement(required = true)
    protected VisionBase base;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAmount(Decimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link VisionBase }
     *     
     */
    public VisionBase getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisionBase }
     *     
     */
    public void setBase(VisionBase value) {
        this.base = value;
    }

}

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
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 * 
 * <p>Java class for Device.UdiCarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device.UdiCarrier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="deviceIdentifier" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="carrierAIDC" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="carrierHRF" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="entryType" type="{http://hl7.org/fhir}UDIEntryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device.UdiCarrier", propOrder = {
    "deviceIdentifier",
    "issuer",
    "jurisdiction",
    "carrierAIDC",
    "carrierHRF",
    "entryType"
})
public class DeviceUdiCarrier
    extends BackboneElement
{

    protected String deviceIdentifier;
    protected Uri issuer;
    protected Uri jurisdiction;
    protected Base64Binary carrierAIDC;
    protected String carrierHRF;
    protected UDIEntryType entryType;

    /**
     * Gets the value of the deviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Sets the value of the deviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIdentifier(String value) {
        this.deviceIdentifier = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setIssuer(Uri value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setJurisdiction(Uri value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the carrierAIDC property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getCarrierAIDC() {
        return carrierAIDC;
    }

    /**
     * Sets the value of the carrierAIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setCarrierAIDC(Base64Binary value) {
        this.carrierAIDC = value;
    }

    /**
     * Gets the value of the carrierHRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierHRF() {
        return carrierHRF;
    }

    /**
     * Sets the value of the carrierHRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierHRF(String value) {
        this.carrierHRF = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link UDIEntryType }
     *     
     */
    public UDIEntryType getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDIEntryType }
     *     
     */
    public void setEntryType(UDIEntryType value) {
        this.entryType = value;
    }

}
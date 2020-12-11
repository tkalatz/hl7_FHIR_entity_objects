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
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Java class for CapabilityStatement.Messaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityStatement.Messaging">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}CapabilityStatement.Endpoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reliableCache" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="supportedMessage" type="{http://hl7.org/fhir}CapabilityStatement.SupportedMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityStatement.Messaging", propOrder = {
    "endpoint",
    "reliableCache",
    "documentation",
    "supportedMessage"
})
public class CapabilityStatementMessaging
    extends BackboneElement
{

    protected List<CapabilityStatementEndpoint> endpoint;
    protected UnsignedInt reliableCache;
    protected Markdown documentation;
    protected List<CapabilityStatementSupportedMessage> supportedMessage;

    /**
     * Gets the value of the endpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatementEndpoint }
     * 
     * 
     */
    public List<CapabilityStatementEndpoint> getEndpoint() {
        if (endpoint == null) {
            endpoint = new ArrayList<CapabilityStatementEndpoint>();
        }
        return this.endpoint;
    }

    /**
     * Gets the value of the reliableCache property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getReliableCache() {
        return reliableCache;
    }

    /**
     * Sets the value of the reliableCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setReliableCache(UnsignedInt value) {
        this.reliableCache = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDocumentation(Markdown value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the supportedMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatementSupportedMessage }
     * 
     * 
     */
    public List<CapabilityStatementSupportedMessage> getSupportedMessage() {
        if (supportedMessage == null) {
            supportedMessage = new ArrayList<CapabilityStatementSupportedMessage>();
        }
        return this.supportedMessage;
    }

}
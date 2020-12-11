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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="eventCoding" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="eventUri" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}MessageHeader.Destination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}MessageHeader.Source"/>
 *         &lt;element name="responsible" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}MessageHeader.Response" minOccurs="0"/>
 *         &lt;element name="focus" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "eventCoding",
    "eventUri",
    "destination",
    "sender",
    "enterer",
    "author",
    "source",
    "responsible",
    "reason",
    "response",
    "focus",
    "definition"
})
public class MessageHeader
    extends DomainResource
{

    protected Coding eventCoding;
    protected Uri eventUri;
    protected List<MessageHeaderDestination> destination;
    protected Reference sender;
    protected Reference enterer;
    protected Reference author;
    @XmlElement(required = true)
    protected MessageHeaderSource source;
    protected Reference responsible;
    protected CodeableConcept reason;
    protected MessageHeaderResponse response;
    protected List<Reference> focus;
    protected Canonical definition;

    /**
     * Gets the value of the eventCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getEventCoding() {
        return eventCoding;
    }

    /**
     * Sets the value of the eventCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setEventCoding(Coding value) {
        this.eventCoding = value;
    }

    /**
     * Gets the value of the eventUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getEventUri() {
        return eventUri;
    }

    /**
     * Sets the value of the eventUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setEventUri(Uri value) {
        this.eventUri = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageHeaderDestination }
     * 
     * 
     */
    public List<MessageHeaderDestination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<MessageHeaderDestination>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSender(Reference value) {
        this.sender = value;
    }

    /**
     * Gets the value of the enterer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEnterer() {
        return enterer;
    }

    /**
     * Sets the value of the enterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEnterer(Reference value) {
        this.enterer = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthor(Reference value) {
        this.author = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderSource }
     *     
     */
    public MessageHeaderSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderSource }
     *     
     */
    public void setSource(MessageHeaderSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponsible(Reference value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public MessageHeaderResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public void setResponse(MessageHeaderResponse value) {
        this.response = value;
    }

    /**
     * Gets the value of the focus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the focus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFocus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getFocus() {
        if (focus == null) {
            focus = new ArrayList<Reference>();
        }
        return this.focus;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setDefinition(Canonical value) {
        this.definition = value;
    }

}
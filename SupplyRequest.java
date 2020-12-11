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
 * <p>Java class for SupplyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SupplyRequestStatus" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}RequestPriority" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}CodeableReference"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity"/>
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}SupplyRequest.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occurrenceDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="occurrencePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="occurrenceTiming" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="authoredOn" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deliverFrom" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="deliverTo" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyRequest", propOrder = {
    "identifier",
    "status",
    "category",
    "priority",
    "item",
    "quantity",
    "parameter",
    "occurrenceDateTime",
    "occurrencePeriod",
    "occurrenceTiming",
    "authoredOn",
    "requester",
    "supplier",
    "reason",
    "deliverFrom",
    "deliverTo"
})
public class SupplyRequest
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected SupplyRequestStatus status;
    protected CodeableConcept category;
    protected RequestPriority priority;
    @XmlElement(required = true)
    protected CodeableReference item;
    @XmlElement(required = true)
    protected Quantity quantity;
    protected List<SupplyRequestParameter> parameter;
    protected DateTime occurrenceDateTime;
    protected Period occurrencePeriod;
    protected Timing occurrenceTiming;
    protected DateTime authoredOn;
    protected Reference requester;
    protected List<Reference> supplier;
    protected List<CodeableReference> reason;
    protected Reference deliverFrom;
    protected Reference deliverTo;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyRequestStatus }
     *     
     */
    public SupplyRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequestStatus }
     *     
     */
    public void setStatus(SupplyRequestStatus value) {
        this.status = value;
    }

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPriority }
     *     
     */
    public RequestPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPriority }
     *     
     */
    public void setPriority(RequestPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableReference }
     *     
     */
    public CodeableReference getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableReference }
     *     
     */
    public void setItem(CodeableReference value) {
        this.item = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyRequestParameter }
     * 
     * 
     */
    public List<SupplyRequestParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<SupplyRequestParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the occurrenceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * Sets the value of the occurrenceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOccurrenceDateTime(DateTime value) {
        this.occurrenceDateTime = value;
    }

    /**
     * Gets the value of the occurrencePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getOccurrencePeriod() {
        return occurrencePeriod;
    }

    /**
     * Sets the value of the occurrencePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setOccurrencePeriod(Period value) {
        this.occurrencePeriod = value;
    }

    /**
     * Gets the value of the occurrenceTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getOccurrenceTiming() {
        return occurrenceTiming;
    }

    /**
     * Sets the value of the occurrenceTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setOccurrenceTiming(Timing value) {
        this.occurrenceTiming = value;
    }

    /**
     * Gets the value of the authoredOn property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAuthoredOn() {
        return authoredOn;
    }

    /**
     * Sets the value of the authoredOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAuthoredOn(DateTime value) {
        this.authoredOn = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequester(Reference value) {
        this.requester = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupplier() {
        if (supplier == null) {
            supplier = new ArrayList<Reference>();
        }
        return this.supplier;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableReference }
     * 
     * 
     */
    public List<CodeableReference> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeableReference>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the deliverFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDeliverFrom() {
        return deliverFrom;
    }

    /**
     * Sets the value of the deliverFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDeliverFrom(Reference value) {
        this.deliverFrom = value;
    }

    /**
     * Gets the value of the deliverTo property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDeliverTo() {
        return deliverTo;
    }

    /**
     * Sets the value of the deliverTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDeliverTo(Reference value) {
        this.deliverTo = value;
    }

}

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
 * <p>Java class for CoverageEligibilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageEligibilityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}FinancialResourceStatusCodes"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}EligibilityRequestPurpose" maxOccurs="unbounded"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="servicedDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="servicedPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="insurer" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="facility" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="supportingInfo" type="{http://hl7.org/fhir}CoverageEligibilityRequest.SupportingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="insurance" type="{http://hl7.org/fhir}CoverageEligibilityRequest.Insurance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}CoverageEligibilityRequest.Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageEligibilityRequest", propOrder = {
    "identifier",
    "status",
    "priority",
    "purpose",
    "patient",
    "servicedDate",
    "servicedPeriod",
    "created",
    "enterer",
    "provider",
    "insurer",
    "facility",
    "supportingInfo",
    "insurance",
    "item"
})
public class CoverageEligibilityRequest
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected FinancialResourceStatusCodes status;
    protected CodeableConcept priority;
    @XmlElement(required = true)
    protected List<EligibilityRequestPurpose> purpose;
    @XmlElement(required = true)
    protected Reference patient;
    protected Date servicedDate;
    protected Period servicedPeriod;
    @XmlElement(required = true)
    protected DateTime created;
    protected Reference enterer;
    protected Reference provider;
    @XmlElement(required = true)
    protected Reference insurer;
    protected Reference facility;
    protected List<CoverageEligibilityRequestSupportingInfo> supportingInfo;
    protected List<CoverageEligibilityRequestInsurance> insurance;
    protected List<CoverageEligibilityRequestItem> item;

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
     *     {@link FinancialResourceStatusCodes }
     *     
     */
    public FinancialResourceStatusCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResourceStatusCodes }
     *     
     */
    public void setStatus(FinancialResourceStatusCodes value) {
        this.status = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPriority(CodeableConcept value) {
        this.priority = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibilityRequestPurpose }
     * 
     * 
     */
    public List<EligibilityRequestPurpose> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<EligibilityRequestPurpose>();
        }
        return this.purpose;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the servicedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getServicedDate() {
        return servicedDate;
    }

    /**
     * Sets the value of the servicedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setServicedDate(Date value) {
        this.servicedDate = value;
    }

    /**
     * Gets the value of the servicedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getServicedPeriod() {
        return servicedPeriod;
    }

    /**
     * Sets the value of the servicedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setServicedPeriod(Period value) {
        this.servicedPeriod = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
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
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProvider(Reference value) {
        this.provider = value;
    }

    /**
     * Gets the value of the insurer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInsurer() {
        return insurer;
    }

    /**
     * Sets the value of the insurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInsurer(Reference value) {
        this.insurer = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setFacility(Reference value) {
        this.facility = value;
    }

    /**
     * Gets the value of the supportingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageEligibilityRequestSupportingInfo }
     * 
     * 
     */
    public List<CoverageEligibilityRequestSupportingInfo> getSupportingInfo() {
        if (supportingInfo == null) {
            supportingInfo = new ArrayList<CoverageEligibilityRequestSupportingInfo>();
        }
        return this.supportingInfo;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageEligibilityRequestInsurance }
     * 
     * 
     */
    public List<CoverageEligibilityRequestInsurance> getInsurance() {
        if (insurance == null) {
            insurance = new ArrayList<CoverageEligibilityRequestInsurance>();
        }
        return this.insurance;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageEligibilityRequestItem }
     * 
     * 
     */
    public List<CoverageEligibilityRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<CoverageEligibilityRequestItem>();
        }
        return this.item;
    }

}

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
 * <p>Java class for Permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://hl7.org/fhir}PermissionStatus"/>
 *         &lt;element name="intent" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="assertionDate" type="{http://hl7.org/fhir}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataScope" type="{http://hl7.org/fhir}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processingActivity" type="{http://hl7.org/fhir}Permission.ProcessingActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="justification" type="{http://hl7.org/fhir}Permission.Justification" minOccurs="0"/>
 *         &lt;element name="usageLimitations" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permission", propOrder = {
    "status",
    "intent",
    "asserter",
    "assertionDate",
    "validity",
    "purpose",
    "dataScope",
    "processingActivity",
    "justification",
    "usageLimitations"
})
public class Permission
    extends DomainResource
{

    @XmlElement(required = true)
    protected PermissionStatus status;
    protected CodeableConcept intent;
    protected Reference asserter;
    protected List<DateTime> assertionDate;
    protected Period validity;
    protected List<CodeableConcept> purpose;
    protected List<Expression> dataScope;
    protected List<PermissionProcessingActivity> processingActivity;
    protected PermissionJustification justification;
    protected List<CodeableConcept> usageLimitations;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionStatus }
     *     
     */
    public PermissionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionStatus }
     *     
     */
    public void setStatus(PermissionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setIntent(CodeableConcept value) {
        this.intent = value;
    }

    /**
     * Gets the value of the asserter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAsserter() {
        return asserter;
    }

    /**
     * Sets the value of the asserter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAsserter(Reference value) {
        this.asserter = value;
    }

    /**
     * Gets the value of the assertionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTime }
     * 
     * 
     */
    public List<DateTime> getAssertionDate() {
        if (assertionDate == null) {
            assertionDate = new ArrayList<DateTime>();
        }
        return this.assertionDate;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValidity(Period value) {
        this.validity = value;
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
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<CodeableConcept>();
        }
        return this.purpose;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getDataScope() {
        if (dataScope == null) {
            dataScope = new ArrayList<Expression>();
        }
        return this.dataScope;
    }

    /**
     * Gets the value of the processingActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionProcessingActivity }
     * 
     * 
     */
    public List<PermissionProcessingActivity> getProcessingActivity() {
        if (processingActivity == null) {
            processingActivity = new ArrayList<PermissionProcessingActivity>();
        }
        return this.processingActivity;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionJustification }
     *     
     */
    public PermissionJustification getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionJustification }
     *     
     */
    public void setJustification(PermissionJustification value) {
        this.justification = value;
    }

    /**
     * Gets the value of the usageLimitations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageLimitations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageLimitations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getUsageLimitations() {
        if (usageLimitations == null) {
            usageLimitations = new ArrayList<CodeableConcept>();
        }
        return this.usageLimitations;
    }

}
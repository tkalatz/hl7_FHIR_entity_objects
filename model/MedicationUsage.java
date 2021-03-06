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
 * <p>Java class for MedicationUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basedOn" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationUsageStatusCodes"/>
 *         &lt;element name="statusReason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medication" type="{http://hl7.org/fhir}CodeableReference"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="dateAsserted" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="derivedFrom" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renderedDosageInstruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}Dosage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="takenAsOrdered" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationUsage", propOrder = {
    "identifier",
    "basedOn",
    "partOf",
    "status",
    "statusReason",
    "category",
    "medication",
    "subject",
    "encounter",
    "effectiveDateTime",
    "effectivePeriod",
    "dateAsserted",
    "informationSource",
    "derivedFrom",
    "reason",
    "note",
    "renderedDosageInstruction",
    "dosage",
    "takenAsOrdered"
})
public class MedicationUsage
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected List<Reference> basedOn;
    protected List<Reference> partOf;
    @XmlElement(required = true)
    protected MedicationUsageStatusCodes status;
    protected List<CodeableConcept> statusReason;
    protected List<CodeableConcept> category;
    @XmlElement(required = true)
    protected CodeableReference medication;
    @XmlElement(required = true)
    protected Reference subject;
    protected Reference encounter;
    protected DateTime effectiveDateTime;
    protected Period effectivePeriod;
    protected DateTime dateAsserted;
    protected Reference informationSource;
    protected List<Reference> derivedFrom;
    protected List<CodeableReference> reason;
    protected List<Annotation> note;
    protected String renderedDosageInstruction;
    protected List<Dosage> dosage;
    protected Boolean takenAsOrdered;

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
     * Gets the value of the basedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasedOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getBasedOn() {
        if (basedOn == null) {
            basedOn = new ArrayList<Reference>();
        }
        return this.basedOn;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<Reference>();
        }
        return this.partOf;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationUsageStatusCodes }
     *     
     */
    public MedicationUsageStatusCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationUsageStatusCodes }
     *     
     */
    public void setStatus(MedicationUsageStatusCodes value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getStatusReason() {
        if (statusReason == null) {
            statusReason = new ArrayList<CodeableConcept>();
        }
        return this.statusReason;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCategory() {
        if (category == null) {
            category = new ArrayList<CodeableConcept>();
        }
        return this.category;
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableReference }
     *     
     */
    public CodeableReference getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableReference }
     *     
     */
    public void setMedication(CodeableReference value) {
        this.medication = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveDateTime(DateTime value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectivePeriod(Period value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the dateAsserted property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateAsserted() {
        return dateAsserted;
    }

    /**
     * Sets the value of the dateAsserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateAsserted(DateTime value) {
        this.dateAsserted = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInformationSource(Reference value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the derivedFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getDerivedFrom() {
        if (derivedFrom == null) {
            derivedFrom = new ArrayList<Reference>();
        }
        return this.derivedFrom;
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
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNote() {
        if (note == null) {
            note = new ArrayList<Annotation>();
        }
        return this.note;
    }

    /**
     * Gets the value of the renderedDosageInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderedDosageInstruction() {
        return renderedDosageInstruction;
    }

    /**
     * Sets the value of the renderedDosageInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderedDosageInstruction(String value) {
        this.renderedDosageInstruction = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dosage }
     * 
     * 
     */
    public List<Dosage> getDosage() {
        if (dosage == null) {
            dosage = new ArrayList<Dosage>();
        }
        return this.dosage;
    }

    /**
     * Gets the value of the takenAsOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTakenAsOrdered() {
        return takenAsOrdered;
    }

    /**
     * Sets the value of the takenAsOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTakenAsOrdered(Boolean value) {
        this.takenAsOrdered = value;
    }

}

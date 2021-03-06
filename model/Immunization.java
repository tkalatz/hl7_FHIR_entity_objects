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
 * <p>Java class for Immunization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immunization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesCanonical" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesUri" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basedOn" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ImmunizationStatusCodes"/>
 *         &lt;element name="statusReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="vaccineCode" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="occurrenceDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="occurrenceString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="recorded" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="primarySource" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="informationSourceCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="informationSourceReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Immunization.Performer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSubpotent" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="subpotentReason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="education" type="{http://hl7.org/fhir}Immunization.Education" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="programEligibility" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fundingSource" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}Immunization.Reaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocolApplied" type="{http://hl7.org/fhir}Immunization.ProtocolApplied" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization", propOrder = {
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "basedOn",
    "status",
    "statusReason",
    "vaccineCode",
    "manufacturer",
    "lotNumber",
    "expirationDate",
    "patient",
    "encounter",
    "occurrenceDateTime",
    "occurrenceString",
    "recorded",
    "primarySource",
    "informationSourceCodeableConcept",
    "informationSourceReference",
    "location",
    "site",
    "route",
    "doseQuantity",
    "performer",
    "note",
    "reason",
    "isSubpotent",
    "subpotentReason",
    "education",
    "programEligibility",
    "fundingSource",
    "reaction",
    "protocolApplied"
})
public class Immunization
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected List<Canonical> instantiatesCanonical;
    protected List<Uri> instantiatesUri;
    protected List<Reference> basedOn;
    @XmlElement(required = true)
    protected ImmunizationStatusCodes status;
    protected CodeableConcept statusReason;
    @XmlElement(required = true)
    protected CodeableConcept vaccineCode;
    protected Reference manufacturer;
    protected String lotNumber;
    protected Date expirationDate;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference encounter;
    protected DateTime occurrenceDateTime;
    protected String occurrenceString;
    protected DateTime recorded;
    protected Boolean primarySource;
    protected CodeableConcept informationSourceCodeableConcept;
    protected Reference informationSourceReference;
    protected Reference location;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected Quantity doseQuantity;
    protected List<ImmunizationPerformer> performer;
    protected List<Annotation> note;
    protected List<CodeableReference> reason;
    protected Boolean isSubpotent;
    protected List<CodeableConcept> subpotentReason;
    protected List<ImmunizationEducation> education;
    protected List<CodeableConcept> programEligibility;
    protected CodeableConcept fundingSource;
    protected List<ImmunizationReaction> reaction;
    protected List<ImmunizationProtocolApplied> protocolApplied;

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
     * Gets the value of the instantiatesCanonical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiatesCanonical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiatesCanonical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getInstantiatesCanonical() {
        if (instantiatesCanonical == null) {
            instantiatesCanonical = new ArrayList<Canonical>();
        }
        return this.instantiatesCanonical;
    }

    /**
     * Gets the value of the instantiatesUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiatesUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiatesUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getInstantiatesUri() {
        if (instantiatesUri == null) {
            instantiatesUri = new ArrayList<Uri>();
        }
        return this.instantiatesUri;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationStatusCodes }
     *     
     */
    public ImmunizationStatusCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationStatusCodes }
     *     
     */
    public void setStatus(ImmunizationStatusCodes value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStatusReason(CodeableConcept value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the vaccineCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVaccineCode() {
        return vaccineCode;
    }

    /**
     * Sets the value of the vaccineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVaccineCode(CodeableConcept value) {
        this.vaccineCode = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setManufacturer(Reference value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
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
     * Gets the value of the occurrenceString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceString() {
        return occurrenceString;
    }

    /**
     * Sets the value of the occurrenceString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceString(String value) {
        this.occurrenceString = value;
    }

    /**
     * Gets the value of the recorded property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRecorded() {
        return recorded;
    }

    /**
     * Sets the value of the recorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRecorded(DateTime value) {
        this.recorded = value;
    }

    /**
     * Gets the value of the primarySource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrimarySource() {
        return primarySource;
    }

    /**
     * Sets the value of the primarySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimarySource(Boolean value) {
        this.primarySource = value;
    }

    /**
     * Gets the value of the informationSourceCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getInformationSourceCodeableConcept() {
        return informationSourceCodeableConcept;
    }

    /**
     * Sets the value of the informationSourceCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setInformationSourceCodeableConcept(CodeableConcept value) {
        this.informationSourceCodeableConcept = value;
    }

    /**
     * Gets the value of the informationSourceReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInformationSourceReference() {
        return informationSourceReference;
    }

    /**
     * Sets the value of the informationSourceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInformationSourceReference(Reference value) {
        this.informationSourceReference = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
        this.location = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDoseQuantity(Quantity value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationPerformer }
     * 
     * 
     */
    public List<ImmunizationPerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<ImmunizationPerformer>();
        }
        return this.performer;
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
     * Gets the value of the isSubpotent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsSubpotent() {
        return isSubpotent;
    }

    /**
     * Sets the value of the isSubpotent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubpotent(Boolean value) {
        this.isSubpotent = value;
    }

    /**
     * Gets the value of the subpotentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subpotentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubpotentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSubpotentReason() {
        if (subpotentReason == null) {
            subpotentReason = new ArrayList<CodeableConcept>();
        }
        return this.subpotentReason;
    }

    /**
     * Gets the value of the education property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the education property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationEducation }
     * 
     * 
     */
    public List<ImmunizationEducation> getEducation() {
        if (education == null) {
            education = new ArrayList<ImmunizationEducation>();
        }
        return this.education;
    }

    /**
     * Gets the value of the programEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getProgramEligibility() {
        if (programEligibility == null) {
            programEligibility = new ArrayList<CodeableConcept>();
        }
        return this.programEligibility;
    }

    /**
     * Gets the value of the fundingSource property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getFundingSource() {
        return fundingSource;
    }

    /**
     * Sets the value of the fundingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setFundingSource(CodeableConcept value) {
        this.fundingSource = value;
    }

    /**
     * Gets the value of the reaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationReaction }
     * 
     * 
     */
    public List<ImmunizationReaction> getReaction() {
        if (reaction == null) {
            reaction = new ArrayList<ImmunizationReaction>();
        }
        return this.reaction;
    }

    /**
     * Gets the value of the protocolApplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolApplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolApplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationProtocolApplied }
     * 
     * 
     */
    public List<ImmunizationProtocolApplied> getProtocolApplied() {
        if (protocolApplied == null) {
            protocolApplied = new ArrayList<ImmunizationProtocolApplied>();
        }
        return this.protocolApplied;
    }

}

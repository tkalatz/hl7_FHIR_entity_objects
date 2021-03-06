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
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clinicalStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="verificationStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="onsetDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="onsetAge" type="{http://hl7.org/fhir}Age" minOccurs="0"/>
 *         &lt;element name="onsetPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="onsetRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="onsetString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="abatementDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="abatementAge" type="{http://hl7.org/fhir}Age" minOccurs="0"/>
 *         &lt;element name="abatementPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="abatementRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="abatementString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="recordedDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="recorder" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://hl7.org/fhir}Condition.Stage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="evidence" type="{http://hl7.org/fhir}Condition.Evidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "identifier",
    "clinicalStatus",
    "verificationStatus",
    "category",
    "severity",
    "code",
    "bodySite",
    "subject",
    "encounter",
    "onsetDateTime",
    "onsetAge",
    "onsetPeriod",
    "onsetRange",
    "onsetString",
    "abatementDateTime",
    "abatementAge",
    "abatementPeriod",
    "abatementRange",
    "abatementString",
    "recordedDate",
    "recorder",
    "asserter",
    "stage",
    "evidence",
    "note"
})
public class Condition
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected CodeableConcept clinicalStatus;
    protected CodeableConcept verificationStatus;
    protected List<CodeableConcept> category;
    protected CodeableConcept severity;
    protected CodeableConcept code;
    protected List<CodeableConcept> bodySite;
    @XmlElement(required = true)
    protected Reference subject;
    protected Reference encounter;
    protected DateTime onsetDateTime;
    protected Age onsetAge;
    protected Period onsetPeriod;
    protected Range onsetRange;
    protected String onsetString;
    protected DateTime abatementDateTime;
    protected Age abatementAge;
    protected Period abatementPeriod;
    protected Range abatementRange;
    protected String abatementString;
    protected DateTime recordedDate;
    protected Reference recorder;
    protected Reference asserter;
    protected List<ConditionStage> stage;
    protected List<ConditionEvidence> evidence;
    protected List<Annotation> note;

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
     * Gets the value of the clinicalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getClinicalStatus() {
        return clinicalStatus;
    }

    /**
     * Sets the value of the clinicalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setClinicalStatus(CodeableConcept value) {
        this.clinicalStatus = value;
    }

    /**
     * Gets the value of the verificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the value of the verificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVerificationStatus(CodeableConcept value) {
        this.verificationStatus = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSeverity(CodeableConcept value) {
        this.severity = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySite() {
        if (bodySite == null) {
            bodySite = new ArrayList<CodeableConcept>();
        }
        return this.bodySite;
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
     * Gets the value of the onsetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOnsetDateTime() {
        return onsetDateTime;
    }

    /**
     * Sets the value of the onsetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOnsetDateTime(DateTime value) {
        this.onsetDateTime = value;
    }

    /**
     * Gets the value of the onsetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getOnsetAge() {
        return onsetAge;
    }

    /**
     * Sets the value of the onsetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setOnsetAge(Age value) {
        this.onsetAge = value;
    }

    /**
     * Gets the value of the onsetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getOnsetPeriod() {
        return onsetPeriod;
    }

    /**
     * Sets the value of the onsetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setOnsetPeriod(Period value) {
        this.onsetPeriod = value;
    }

    /**
     * Gets the value of the onsetRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getOnsetRange() {
        return onsetRange;
    }

    /**
     * Sets the value of the onsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setOnsetRange(Range value) {
        this.onsetRange = value;
    }

    /**
     * Gets the value of the onsetString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnsetString() {
        return onsetString;
    }

    /**
     * Sets the value of the onsetString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnsetString(String value) {
        this.onsetString = value;
    }

    /**
     * Gets the value of the abatementDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAbatementDateTime() {
        return abatementDateTime;
    }

    /**
     * Sets the value of the abatementDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAbatementDateTime(DateTime value) {
        this.abatementDateTime = value;
    }

    /**
     * Gets the value of the abatementAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getAbatementAge() {
        return abatementAge;
    }

    /**
     * Sets the value of the abatementAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setAbatementAge(Age value) {
        this.abatementAge = value;
    }

    /**
     * Gets the value of the abatementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getAbatementPeriod() {
        return abatementPeriod;
    }

    /**
     * Sets the value of the abatementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setAbatementPeriod(Period value) {
        this.abatementPeriod = value;
    }

    /**
     * Gets the value of the abatementRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getAbatementRange() {
        return abatementRange;
    }

    /**
     * Sets the value of the abatementRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setAbatementRange(Range value) {
        this.abatementRange = value;
    }

    /**
     * Gets the value of the abatementString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbatementString() {
        return abatementString;
    }

    /**
     * Sets the value of the abatementString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbatementString(String value) {
        this.abatementString = value;
    }

    /**
     * Gets the value of the recordedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRecordedDate() {
        return recordedDate;
    }

    /**
     * Sets the value of the recordedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRecordedDate(DateTime value) {
        this.recordedDate = value;
    }

    /**
     * Gets the value of the recorder property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRecorder() {
        return recorder;
    }

    /**
     * Sets the value of the recorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRecorder(Reference value) {
        this.recorder = value;
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
     * Gets the value of the stage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionStage }
     * 
     * 
     */
    public List<ConditionStage> getStage() {
        if (stage == null) {
            stage = new ArrayList<ConditionStage>();
        }
        return this.stage;
    }

    /**
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionEvidence }
     * 
     * 
     */
    public List<ConditionEvidence> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<ConditionEvidence>();
        }
        return this.evidence;
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

}

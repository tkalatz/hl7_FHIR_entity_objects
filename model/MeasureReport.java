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
 * <p>Java class for MeasureReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MeasureReportStatus"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}MeasureReportType"/>
 *         &lt;element name="measure" type="{http://hl7.org/fhir}canonical"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="reporter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period"/>
 *         &lt;element name="improvementNotation" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}MeasureReport.Group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="evaluatedResource" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureReport", propOrder = {
    "identifier",
    "status",
    "type",
    "measure",
    "subject",
    "date",
    "reporter",
    "period",
    "improvementNotation",
    "group",
    "evaluatedResource"
})
public class MeasureReport
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected MeasureReportStatus status;
    @XmlElement(required = true)
    protected MeasureReportType type;
    @XmlElement(required = true)
    protected Canonical measure;
    protected Reference subject;
    protected DateTime date;
    protected Reference reporter;
    @XmlElement(required = true)
    protected Period period;
    protected CodeableConcept improvementNotation;
    protected List<MeasureReportGroup> group;
    protected List<Reference> evaluatedResource;

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
     *     {@link MeasureReportStatus }
     *     
     */
    public MeasureReportStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureReportStatus }
     *     
     */
    public void setStatus(MeasureReportStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureReportType }
     *     
     */
    public MeasureReportType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureReportType }
     *     
     */
    public void setType(MeasureReportType value) {
        this.type = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setMeasure(Canonical value) {
        this.measure = value;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the reporter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReporter() {
        return reporter;
    }

    /**
     * Sets the value of the reporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReporter(Reference value) {
        this.reporter = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the improvementNotation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getImprovementNotation() {
        return improvementNotation;
    }

    /**
     * Sets the value of the improvementNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setImprovementNotation(CodeableConcept value) {
        this.improvementNotation = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureReportGroup }
     * 
     * 
     */
    public List<MeasureReportGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<MeasureReportGroup>();
        }
        return this.group;
    }

    /**
     * Gets the value of the evaluatedResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getEvaluatedResource() {
        if (evaluatedResource == null) {
            evaluatedResource = new ArrayList<Reference>();
        }
        return this.evaluatedResource;
    }

}
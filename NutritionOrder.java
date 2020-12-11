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
 * <p>Java class for NutritionOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesCanonical" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesUri" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiates" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}RequestStatus"/>
 *         &lt;element name="intent" type="{http://hl7.org/fhir}RequestIntent"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="orderer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="allergyIntolerance" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="foodPreferenceModifier" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludeFoodModifier" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oralDiet" type="{http://hl7.org/fhir}NutritionOrder.OralDiet" minOccurs="0"/>
 *         &lt;element name="supplement" type="{http://hl7.org/fhir}NutritionOrder.Supplement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enteralFormula" type="{http://hl7.org/fhir}NutritionOrder.EnteralFormula" minOccurs="0"/>
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
@XmlType(name = "NutritionOrder", propOrder = {
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "instantiates",
    "status",
    "intent",
    "patient",
    "encounter",
    "dateTime",
    "orderer",
    "allergyIntolerance",
    "foodPreferenceModifier",
    "excludeFoodModifier",
    "oralDiet",
    "supplement",
    "enteralFormula",
    "note"
})
public class NutritionOrder
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected List<Canonical> instantiatesCanonical;
    protected List<Uri> instantiatesUri;
    protected List<Uri> instantiates;
    @XmlElement(required = true)
    protected RequestStatus status;
    @XmlElement(required = true)
    protected RequestIntent intent;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference encounter;
    @XmlElement(required = true)
    protected DateTime dateTime;
    protected Reference orderer;
    protected List<Reference> allergyIntolerance;
    protected List<CodeableConcept> foodPreferenceModifier;
    protected List<CodeableConcept> excludeFoodModifier;
    protected NutritionOrderOralDiet oralDiet;
    protected List<NutritionOrderSupplement> supplement;
    protected NutritionOrderEnteralFormula enteralFormula;
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
     * Gets the value of the instantiates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getInstantiates() {
        if (instantiates == null) {
            instantiates = new ArrayList<Uri>();
        }
        return this.instantiates;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus }
     *     
     */
    public RequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus }
     *     
     */
    public void setStatus(RequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link RequestIntent }
     *     
     */
    public RequestIntent getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIntent }
     *     
     */
    public void setIntent(RequestIntent value) {
        this.intent = value;
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
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateTime(DateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the orderer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrderer() {
        return orderer;
    }

    /**
     * Sets the value of the orderer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrderer(Reference value) {
        this.orderer = value;
    }

    /**
     * Gets the value of the allergyIntolerance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergyIntolerance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergyIntolerance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAllergyIntolerance() {
        if (allergyIntolerance == null) {
            allergyIntolerance = new ArrayList<Reference>();
        }
        return this.allergyIntolerance;
    }

    /**
     * Gets the value of the foodPreferenceModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodPreferenceModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodPreferenceModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getFoodPreferenceModifier() {
        if (foodPreferenceModifier == null) {
            foodPreferenceModifier = new ArrayList<CodeableConcept>();
        }
        return this.foodPreferenceModifier;
    }

    /**
     * Gets the value of the excludeFoodModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeFoodModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeFoodModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getExcludeFoodModifier() {
        if (excludeFoodModifier == null) {
            excludeFoodModifier = new ArrayList<CodeableConcept>();
        }
        return this.excludeFoodModifier;
    }

    /**
     * Gets the value of the oralDiet property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionOrderOralDiet }
     *     
     */
    public NutritionOrderOralDiet getOralDiet() {
        return oralDiet;
    }

    /**
     * Sets the value of the oralDiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionOrderOralDiet }
     *     
     */
    public void setOralDiet(NutritionOrderOralDiet value) {
        this.oralDiet = value;
    }

    /**
     * Gets the value of the supplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderSupplement }
     * 
     * 
     */
    public List<NutritionOrderSupplement> getSupplement() {
        if (supplement == null) {
            supplement = new ArrayList<NutritionOrderSupplement>();
        }
        return this.supplement;
    }

    /**
     * Gets the value of the enteralFormula property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionOrderEnteralFormula }
     *     
     */
    public NutritionOrderEnteralFormula getEnteralFormula() {
        return enteralFormula;
    }

    /**
     * Sets the value of the enteralFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionOrderEnteralFormula }
     *     
     */
    public void setEnteralFormula(NutritionOrderEnteralFormula value) {
        this.enteralFormula = value;
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

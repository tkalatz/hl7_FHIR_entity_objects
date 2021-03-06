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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Statistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statistic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statisticType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="numberOfEvents" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="sampleSize" type="{http://hl7.org/fhir}Statistic.SampleSize" minOccurs="0"/>
 *         &lt;element name="attributeEstimate" type="{http://hl7.org/fhir}Statistic.AttributeEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelCharacteristic" type="{http://hl7.org/fhir}Statistic.ModelCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statistic", propOrder = {
    "description",
    "note",
    "statisticType",
    "quantity",
    "numberOfEvents",
    "sampleSize",
    "attributeEstimate",
    "modelCharacteristic"
})
public class Statistic
    extends BackboneType
{

    protected String description;
    protected List<Annotation> note;
    protected CodeableConcept statisticType;
    protected Quantity quantity;
    protected Integer numberOfEvents;
    protected StatisticSampleSize sampleSize;
    protected List<StatisticAttributeEstimate> attributeEstimate;
    protected List<StatisticModelCharacteristic> modelCharacteristic;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the statisticType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStatisticType() {
        return statisticType;
    }

    /**
     * Sets the value of the statisticType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStatisticType(CodeableConcept value) {
        this.statisticType = value;
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
     * Gets the value of the numberOfEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfEvents() {
        return numberOfEvents;
    }

    /**
     * Sets the value of the numberOfEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfEvents(Integer value) {
        this.numberOfEvents = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticSampleSize }
     *     
     */
    public StatisticSampleSize getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticSampleSize }
     *     
     */
    public void setSampleSize(StatisticSampleSize value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the attributeEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticAttributeEstimate }
     * 
     * 
     */
    public List<StatisticAttributeEstimate> getAttributeEstimate() {
        if (attributeEstimate == null) {
            attributeEstimate = new ArrayList<StatisticAttributeEstimate>();
        }
        return this.attributeEstimate;
    }

    /**
     * Gets the value of the modelCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticModelCharacteristic }
     * 
     * 
     */
    public List<StatisticModelCharacteristic> getModelCharacteristic() {
        if (modelCharacteristic == null) {
            modelCharacteristic = new ArrayList<StatisticModelCharacteristic>();
        }
        return this.modelCharacteristic;
    }

}

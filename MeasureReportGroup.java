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
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 * 
 * <p>Java class for MeasureReport.Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureReport.Group">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="population" type="{http://hl7.org/fhir}MeasureReport.Population" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measureScore" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="stratifier" type="{http://hl7.org/fhir}MeasureReport.Stratifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureReport.Group", propOrder = {
    "code",
    "population",
    "measureScore",
    "stratifier"
})
public class MeasureReportGroup
    extends BackboneElement
{

    protected CodeableConcept code;
    protected List<MeasureReportPopulation> population;
    protected Quantity measureScore;
    protected List<MeasureReportStratifier> stratifier;

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
     * Gets the value of the population property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the population property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureReportPopulation }
     * 
     * 
     */
    public List<MeasureReportPopulation> getPopulation() {
        if (population == null) {
            population = new ArrayList<MeasureReportPopulation>();
        }
        return this.population;
    }

    /**
     * Gets the value of the measureScore property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMeasureScore() {
        return measureScore;
    }

    /**
     * Sets the value of the measureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMeasureScore(Quantity value) {
        this.measureScore = value;
    }

    /**
     * Gets the value of the stratifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stratifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStratifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureReportStratifier }
     * 
     * 
     */
    public List<MeasureReportStratifier> getStratifier() {
        if (stratifier == null) {
            stratifier = new ArrayList<MeasureReportStratifier>();
        }
        return this.stratifier;
    }

}

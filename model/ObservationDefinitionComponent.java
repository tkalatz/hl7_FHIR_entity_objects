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
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * 
 * <p>Java class for ObservationDefinition.Component complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationDefinition.Component">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="permittedDataType" type="{http://hl7.org/fhir}ObservationDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantitativeDetails" type="{http://hl7.org/fhir}ObservationDefinition.QuantitativeDetails" minOccurs="0"/>
 *         &lt;element name="qualifiedInterval" type="{http://hl7.org/fhir}ObservationDefinition.QualifiedInterval" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationDefinition.Component", propOrder = {
    "code",
    "permittedDataType",
    "quantitativeDetails",
    "qualifiedInterval"
})
public class ObservationDefinitionComponent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept code;
    protected List<ObservationDataType> permittedDataType;
    protected ObservationDefinitionQuantitativeDetails quantitativeDetails;
    protected List<ObservationDefinitionQualifiedInterval> qualifiedInterval;

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
     * Gets the value of the permittedDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permittedDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationDataType }
     * 
     * 
     */
    public List<ObservationDataType> getPermittedDataType() {
        if (permittedDataType == null) {
            permittedDataType = new ArrayList<ObservationDataType>();
        }
        return this.permittedDataType;
    }

    /**
     * Gets the value of the quantitativeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationDefinitionQuantitativeDetails }
     *     
     */
    public ObservationDefinitionQuantitativeDetails getQuantitativeDetails() {
        return quantitativeDetails;
    }

    /**
     * Sets the value of the quantitativeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationDefinitionQuantitativeDetails }
     *     
     */
    public void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails value) {
        this.quantitativeDetails = value;
    }

    /**
     * Gets the value of the qualifiedInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationDefinitionQualifiedInterval }
     * 
     * 
     */
    public List<ObservationDefinitionQualifiedInterval> getQualifiedInterval() {
        if (qualifiedInterval == null) {
            qualifiedInterval = new ArrayList<ObservationDefinitionQualifiedInterval>();
        }
        return this.qualifiedInterval;
    }

}

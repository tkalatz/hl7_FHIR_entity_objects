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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Statistic.Variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statistic.Variable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="variableDefinition" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="handling" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="valueCategory" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valueRange" type="{http://hl7.org/fhir}Range" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statistic.Variable", propOrder = {
    "variableDefinition",
    "handling",
    "valueCategory",
    "valueQuantity",
    "valueRange"
})
public class StatisticVariable
    extends BackboneType
{

    @XmlElement(required = true)
    protected Reference variableDefinition;
    protected Code handling;
    protected List<CodeableConcept> valueCategory;
    protected List<Quantity> valueQuantity;
    protected List<Range> valueRange;

    /**
     * Gets the value of the variableDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getVariableDefinition() {
        return variableDefinition;
    }

    /**
     * Sets the value of the variableDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setVariableDefinition(Reference value) {
        this.variableDefinition = value;
    }

    /**
     * Gets the value of the handling property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getHandling() {
        return handling;
    }

    /**
     * Sets the value of the handling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setHandling(Code value) {
        this.handling = value;
    }

    /**
     * Gets the value of the valueCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getValueCategory() {
        if (valueCategory == null) {
            valueCategory = new ArrayList<CodeableConcept>();
        }
        return this.valueCategory;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quantity }
     * 
     * 
     */
    public List<Quantity> getValueQuantity() {
        if (valueQuantity == null) {
            valueQuantity = new ArrayList<Quantity>();
        }
        return this.valueQuantity;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Range }
     * 
     * 
     */
    public List<Range> getValueRange() {
        if (valueRange == null) {
            valueRange = new ArrayList<Range>();
        }
        return this.valueRange;
    }

}

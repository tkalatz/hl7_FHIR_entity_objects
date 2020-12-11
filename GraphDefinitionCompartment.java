//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 * 
 * <p>Java class for GraphDefinition.Compartment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphDefinition.Compartment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://hl7.org/fhir}GraphCompartmentUse"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CompartmentType"/>
 *         &lt;element name="rule" type="{http://hl7.org/fhir}GraphCompartmentRule"/>
 *         &lt;element name="expression" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphDefinition.Compartment", propOrder = {
    "use",
    "code",
    "rule",
    "expression",
    "description"
})
public class GraphDefinitionCompartment
    extends BackboneElement
{

    @XmlElement(required = true)
    protected GraphCompartmentUse use;
    @XmlElement(required = true)
    protected CompartmentType code;
    @XmlElement(required = true)
    protected GraphCompartmentRule rule;
    protected String expression;
    protected String description;

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link GraphCompartmentUse }
     *     
     */
    public GraphCompartmentUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphCompartmentUse }
     *     
     */
    public void setUse(GraphCompartmentUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CompartmentType }
     *     
     */
    public CompartmentType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentType }
     *     
     */
    public void setCode(CompartmentType value) {
        this.code = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link GraphCompartmentRule }
     *     
     */
    public GraphCompartmentRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphCompartmentRule }
     *     
     */
    public void setRule(GraphCompartmentRule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

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

}

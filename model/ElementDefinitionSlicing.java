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
 * <p>Java class for ElementDefinition.Slicing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Slicing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="discriminator" type="{http://hl7.org/fhir}ElementDefinition.Discriminator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ordered" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="rules" type="{http://hl7.org/fhir}SlicingRules"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Slicing", propOrder = {
    "discriminator",
    "description",
    "ordered",
    "rules"
})
public class ElementDefinitionSlicing
    extends BackboneType
{

    protected List<ElementDefinitionDiscriminator> discriminator;
    protected String description;
    protected Boolean ordered;
    @XmlElement(required = true)
    protected SlicingRules rules;

    /**
     * Gets the value of the discriminator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discriminator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscriminator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDefinitionDiscriminator }
     * 
     * 
     */
    public List<ElementDefinitionDiscriminator> getDiscriminator() {
        if (discriminator == null) {
            discriminator = new ArrayList<ElementDefinitionDiscriminator>();
        }
        return this.discriminator;
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

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrdered(Boolean value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link SlicingRules }
     *     
     */
    public SlicingRules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlicingRules }
     *     
     */
    public void setRules(SlicingRules value) {
        this.rules = value;
    }

}
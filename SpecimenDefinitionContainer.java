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
 * A kind of specimen with associated set of requirements.
 * 
 * <p>Java class for SpecimenDefinition.Container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecimenDefinition.Container">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="cap" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="minimumVolumeQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="minimumVolumeString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="additive" type="{http://hl7.org/fhir}SpecimenDefinition.Additive" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preparation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecimenDefinition.Container", propOrder = {
    "material",
    "type",
    "cap",
    "description",
    "capacity",
    "minimumVolumeQuantity",
    "minimumVolumeString",
    "additive",
    "preparation"
})
public class SpecimenDefinitionContainer
    extends BackboneElement
{

    protected CodeableConcept material;
    protected CodeableConcept type;
    protected CodeableConcept cap;
    protected String description;
    protected Quantity capacity;
    protected Quantity minimumVolumeQuantity;
    protected String minimumVolumeString;
    protected List<SpecimenDefinitionAdditive> additive;
    protected String preparation;

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMaterial(CodeableConcept value) {
        this.material = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the cap property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCap() {
        return cap;
    }

    /**
     * Sets the value of the cap property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCap(CodeableConcept value) {
        this.cap = value;
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
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setCapacity(Quantity value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the minimumVolumeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMinimumVolumeQuantity() {
        return minimumVolumeQuantity;
    }

    /**
     * Sets the value of the minimumVolumeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMinimumVolumeQuantity(Quantity value) {
        this.minimumVolumeQuantity = value;
    }

    /**
     * Gets the value of the minimumVolumeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumVolumeString() {
        return minimumVolumeString;
    }

    /**
     * Sets the value of the minimumVolumeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumVolumeString(String value) {
        this.minimumVolumeString = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenDefinitionAdditive }
     * 
     * 
     */
    public List<SpecimenDefinitionAdditive> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<SpecimenDefinitionAdditive>();
        }
        return this.additive;
    }

    /**
     * Gets the value of the preparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparation() {
        return preparation;
    }

    /**
     * Sets the value of the preparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparation(String value) {
        this.preparation = value;
    }

}

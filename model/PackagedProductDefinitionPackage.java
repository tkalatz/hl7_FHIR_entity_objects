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
 * A medically related item or items, in a container or package.
 * 
 * <p>Java class for PackagedProductDefinition.Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagedProductDefinition.Package">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="material" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alternateMaterial" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shelfLifeStorage" type="{http://hl7.org/fhir}ProductShelfLife" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="property" type="{http://hl7.org/fhir}PackagedProductDefinition.Property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="containedItem" type="{http://hl7.org/fhir}PackagedProductDefinition.ContainedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="package" type="{http://hl7.org/fhir}PackagedProductDefinition.Package" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagedProductDefinition.Package", propOrder = {
    "identifier",
    "type",
    "quantity",
    "material",
    "alternateMaterial",
    "shelfLifeStorage",
    "manufacturer",
    "property",
    "containedItem",
    "_package"
})
public class PackagedProductDefinitionPackage
    extends BackboneElement
{

    protected List<Identifier> identifier;
    protected CodeableConcept type;
    protected Integer quantity;
    protected List<CodeableConcept> material;
    protected List<CodeableConcept> alternateMaterial;
    protected List<ProductShelfLife> shelfLifeStorage;
    protected List<Reference> manufacturer;
    protected List<PackagedProductDefinitionProperty> property;
    protected List<PackagedProductDefinitionContainedItem> containedItem;
    @XmlElement(name = "package")
    protected List<PackagedProductDefinitionPackage> _package;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getMaterial() {
        if (material == null) {
            material = new ArrayList<CodeableConcept>();
        }
        return this.material;
    }

    /**
     * Gets the value of the alternateMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getAlternateMaterial() {
        if (alternateMaterial == null) {
            alternateMaterial = new ArrayList<CodeableConcept>();
        }
        return this.alternateMaterial;
    }

    /**
     * Gets the value of the shelfLifeStorage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelfLifeStorage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelfLifeStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductShelfLife }
     * 
     * 
     */
    public List<ProductShelfLife> getShelfLifeStorage() {
        if (shelfLifeStorage == null) {
            shelfLifeStorage = new ArrayList<ProductShelfLife>();
        }
        return this.shelfLifeStorage;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new ArrayList<Reference>();
        }
        return this.manufacturer;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagedProductDefinitionProperty }
     * 
     * 
     */
    public List<PackagedProductDefinitionProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<PackagedProductDefinitionProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the containedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagedProductDefinitionContainedItem }
     * 
     * 
     */
    public List<PackagedProductDefinitionContainedItem> getContainedItem() {
        if (containedItem == null) {
            containedItem = new ArrayList<PackagedProductDefinitionContainedItem>();
        }
        return this.containedItem;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagedProductDefinitionPackage }
     * 
     * 
     */
    public List<PackagedProductDefinitionPackage> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackagedProductDefinitionPackage>();
        }
        return this._package;
    }

}

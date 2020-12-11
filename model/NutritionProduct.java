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
 * <p>Java class for NutritionProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://hl7.org/fhir}NutritionProductStatus"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutrient" type="{http://hl7.org/fhir}NutritionProduct.Nutrient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ingredient" type="{http://hl7.org/fhir}NutritionProduct.Ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="knownAllergen" type="{http://hl7.org/fhir}CodeableReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productCharacteristic" type="{http://hl7.org/fhir}NutritionProduct.ProductCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instance" type="{http://hl7.org/fhir}NutritionProduct.Instance" minOccurs="0"/>
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
@XmlType(name = "NutritionProduct", propOrder = {
    "status",
    "category",
    "code",
    "manufacturer",
    "nutrient",
    "ingredient",
    "knownAllergen",
    "productCharacteristic",
    "instance",
    "note"
})
public class NutritionProduct
    extends DomainResource
{

    @XmlElement(required = true)
    protected NutritionProductStatus status;
    protected List<CodeableConcept> category;
    protected CodeableConcept code;
    protected List<Reference> manufacturer;
    protected List<NutritionProductNutrient> nutrient;
    protected List<NutritionProductIngredient> ingredient;
    protected List<CodeableReference> knownAllergen;
    protected List<NutritionProductProductCharacteristic> productCharacteristic;
    protected NutritionProductInstance instance;
    protected List<Annotation> note;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionProductStatus }
     *     
     */
    public NutritionProductStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionProductStatus }
     *     
     */
    public void setStatus(NutritionProductStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCategory() {
        if (category == null) {
            category = new ArrayList<CodeableConcept>();
        }
        return this.category;
    }

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
     * Gets the value of the nutrient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionProductNutrient }
     * 
     * 
     */
    public List<NutritionProductNutrient> getNutrient() {
        if (nutrient == null) {
            nutrient = new ArrayList<NutritionProductNutrient>();
        }
        return this.nutrient;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionProductIngredient }
     * 
     * 
     */
    public List<NutritionProductIngredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<NutritionProductIngredient>();
        }
        return this.ingredient;
    }

    /**
     * Gets the value of the knownAllergen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownAllergen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownAllergen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableReference }
     * 
     * 
     */
    public List<CodeableReference> getKnownAllergen() {
        if (knownAllergen == null) {
            knownAllergen = new ArrayList<CodeableReference>();
        }
        return this.knownAllergen;
    }

    /**
     * Gets the value of the productCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionProductProductCharacteristic }
     * 
     * 
     */
    public List<NutritionProductProductCharacteristic> getProductCharacteristic() {
        if (productCharacteristic == null) {
            productCharacteristic = new ArrayList<NutritionProductProductCharacteristic>();
        }
        return this.productCharacteristic;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionProductInstance }
     *     
     */
    public NutritionProductInstance getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionProductInstance }
     *     
     */
    public void setInstance(NutritionProductInstance value) {
        this.instance = value;
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
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
 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
 * 
 * <p>Java class for NutritionIntake.IngredientLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionIntake.IngredientLabel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="nutrient" type="{http://hl7.org/fhir}CodeableReference"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}Quantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionIntake.IngredientLabel", propOrder = {
    "nutrient",
    "amount"
})
public class NutritionIntakeIngredientLabel
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableReference nutrient;
    @XmlElement(required = true)
    protected Quantity amount;

    /**
     * Gets the value of the nutrient property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableReference }
     *     
     */
    public CodeableReference getNutrient() {
        return nutrient;
    }

    /**
     * Sets the value of the nutrient property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableReference }
     *     
     */
    public void setNutrient(CodeableReference value) {
        this.nutrient = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setAmount(Quantity value) {
        this.amount = value;
    }

}

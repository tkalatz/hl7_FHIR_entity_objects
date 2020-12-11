//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for BiologicallyDerivedProductCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiologicallyDerivedProductCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}BiologicallyDerivedProductCategory-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiologicallyDerivedProductCategory")
public class BiologicallyDerivedProductCategory
    extends Element
{

    @XmlAttribute(name = "value")
    protected BiologicallyDerivedProductCategoryList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BiologicallyDerivedProductCategoryList }
     *     
     */
    public BiologicallyDerivedProductCategoryList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiologicallyDerivedProductCategoryList }
     *     
     */
    public void setValue(BiologicallyDerivedProductCategoryList value) {
        this.value = value;
    }

}

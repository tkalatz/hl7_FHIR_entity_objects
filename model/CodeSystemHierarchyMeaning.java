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
 * <p>Java class for CodeSystemHierarchyMeaning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeSystemHierarchyMeaning">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}CodeSystemHierarchyMeaning-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeSystemHierarchyMeaning")
public class CodeSystemHierarchyMeaning
    extends Element
{

    @XmlAttribute(name = "value")
    protected CodeSystemHierarchyMeaningList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSystemHierarchyMeaningList }
     *     
     */
    public CodeSystemHierarchyMeaningList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSystemHierarchyMeaningList }
     *     
     */
    public void setValue(CodeSystemHierarchyMeaningList value) {
        this.value = value;
    }

}

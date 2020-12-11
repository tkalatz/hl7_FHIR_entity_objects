//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraphCompartmentUse-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GraphCompartmentUse-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="condition"/>
 *     &lt;enumeration value="requirement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GraphCompartmentUse-list")
@XmlEnum
public enum GraphCompartmentUseList {


    /**
     * Condition
     * 
     */
    @XmlEnumValue("condition")
    CONDITION("condition"),

    /**
     * Requirement
     * 
     */
    @XmlEnumValue("requirement")
    REQUIREMENT("requirement");
    private final java.lang.String value;

    GraphCompartmentUseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GraphCompartmentUseList fromValue(java.lang.String v) {
        for (GraphCompartmentUseList c: GraphCompartmentUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
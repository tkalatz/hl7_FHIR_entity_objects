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
 * <p>Java class for AllergyIntoleranceCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceCategory-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="medication"/>
 *     &lt;enumeration value="environment"/>
 *     &lt;enumeration value="biologic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceCategory-list")
@XmlEnum
public enum AllergyIntoleranceCategoryList {


    /**
     * Food
     * 
     */
    @XmlEnumValue("food")
    FOOD("food"),

    /**
     * Medication
     * 
     */
    @XmlEnumValue("medication")
    MEDICATION("medication"),

    /**
     * Environment
     * 
     */
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),

    /**
     * Biologic
     * 
     */
    @XmlEnumValue("biologic")
    BIOLOGIC("biologic");
    private final java.lang.String value;

    AllergyIntoleranceCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AllergyIntoleranceCategoryList fromValue(java.lang.String v) {
        for (AllergyIntoleranceCategoryList c: AllergyIntoleranceCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
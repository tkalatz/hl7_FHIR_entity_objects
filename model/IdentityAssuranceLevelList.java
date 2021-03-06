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
 * <p>Java class for IdentityAssuranceLevel-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityAssuranceLevel-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="level1"/>
 *     &lt;enumeration value="level2"/>
 *     &lt;enumeration value="level3"/>
 *     &lt;enumeration value="level4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityAssuranceLevel-list")
@XmlEnum
public enum IdentityAssuranceLevelList {


    /**
     * Level 1
     * 
     */
    @XmlEnumValue("level1")
    LEVEL_1("level1"),

    /**
     * Level 2
     * 
     */
    @XmlEnumValue("level2")
    LEVEL_2("level2"),

    /**
     * Level 3
     * 
     */
    @XmlEnumValue("level3")
    LEVEL_3("level3"),

    /**
     * Level 4
     * 
     */
    @XmlEnumValue("level4")
    LEVEL_4("level4");
    private final java.lang.String value;

    IdentityAssuranceLevelList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IdentityAssuranceLevelList fromValue(java.lang.String v) {
        for (IdentityAssuranceLevelList c: IdentityAssuranceLevelList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

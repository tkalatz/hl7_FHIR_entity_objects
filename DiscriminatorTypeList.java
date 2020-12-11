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
 * <p>Java class for DiscriminatorType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscriminatorType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="value"/>
 *     &lt;enumeration value="exists"/>
 *     &lt;enumeration value="pattern"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="profile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscriminatorType-list")
@XmlEnum
public enum DiscriminatorTypeList {


    /**
     * Value
     * 
     */
    @XmlEnumValue("value")
    VALUE("value"),

    /**
     * Exists
     * 
     */
    @XmlEnumValue("exists")
    EXISTS("exists"),

    /**
     * Pattern
     * 
     */
    @XmlEnumValue("pattern")
    PATTERN("pattern"),

    /**
     * Type
     * 
     */
    @XmlEnumValue("type")
    TYPE("type"),

    /**
     * Profile
     * 
     */
    @XmlEnumValue("profile")
    PROFILE("profile");
    private final java.lang.String value;

    DiscriminatorTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiscriminatorTypeList fromValue(java.lang.String v) {
        for (DiscriminatorTypeList c: DiscriminatorTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

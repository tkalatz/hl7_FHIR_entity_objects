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
 * <p>Java class for StructureMapModelMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StructureMapModelMode-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="queried"/>
 *     &lt;enumeration value="target"/>
 *     &lt;enumeration value="produced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StructureMapModelMode-list")
@XmlEnum
public enum StructureMapModelModeList {


    /**
     * Source Structure Definition
     * 
     */
    @XmlEnumValue("source")
    SOURCE("source"),

    /**
     * Queried Structure Definition
     * 
     */
    @XmlEnumValue("queried")
    QUERIED("queried"),

    /**
     * Target Structure Definition
     * 
     */
    @XmlEnumValue("target")
    TARGET("target"),

    /**
     * Produced Structure Definition
     * 
     */
    @XmlEnumValue("produced")
    PRODUCED("produced");
    private final java.lang.String value;

    StructureMapModelModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StructureMapModelModeList fromValue(java.lang.String v) {
        for (StructureMapModelModeList c: StructureMapModelModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for ProvenanceEntityRole-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProvenanceEntityRole-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="derivation"/>
 *     &lt;enumeration value="revision"/>
 *     &lt;enumeration value="quotation"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="removal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProvenanceEntityRole-list")
@XmlEnum
public enum ProvenanceEntityRoleList {


    /**
     * Derivation
     * 
     */
    @XmlEnumValue("derivation")
    DERIVATION("derivation"),

    /**
     * Revision
     * 
     */
    @XmlEnumValue("revision")
    REVISION("revision"),

    /**
     * Quotation
     * 
     */
    @XmlEnumValue("quotation")
    QUOTATION("quotation"),

    /**
     * Source
     * 
     */
    @XmlEnumValue("source")
    SOURCE("source"),

    /**
     * Removal
     * 
     */
    @XmlEnumValue("removal")
    REMOVAL("removal");
    private final java.lang.String value;

    ProvenanceEntityRoleList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProvenanceEntityRoleList fromValue(java.lang.String v) {
        for (ProvenanceEntityRoleList c: ProvenanceEntityRoleList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

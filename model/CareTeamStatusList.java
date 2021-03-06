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
 * <p>Java class for CareTeamStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CareTeamStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="inactive"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CareTeamStatus-list")
@XmlEnum
public enum CareTeamStatusList {


    /**
     * Proposed
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * Active
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Suspended
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * Inactive
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),

    /**
     * Entered in Error
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    CareTeamStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CareTeamStatusList fromValue(java.lang.String v) {
        for (CareTeamStatusList c: CareTeamStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

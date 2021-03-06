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
 * <p>Java class for ActionParticipantType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionParticipantType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="patient"/>
 *     &lt;enumeration value="practitioner"/>
 *     &lt;enumeration value="related-person"/>
 *     &lt;enumeration value="device"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionParticipantType-list")
@XmlEnum
public enum ActionParticipantTypeList {


    /**
     * Patient
     * 
     */
    @XmlEnumValue("patient")
    PATIENT("patient"),

    /**
     * Practitioner
     * 
     */
    @XmlEnumValue("practitioner")
    PRACTITIONER("practitioner"),

    /**
     * Related Person
     * 
     */
    @XmlEnumValue("related-person")
    RELATED_PERSON("related-person"),

    /**
     * Device
     * 
     */
    @XmlEnumValue("device")
    DEVICE("device");
    private final java.lang.String value;

    ActionParticipantTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ActionParticipantTypeList fromValue(java.lang.String v) {
        for (ActionParticipantTypeList c: ActionParticipantTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

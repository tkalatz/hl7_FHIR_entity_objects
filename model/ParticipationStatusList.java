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
 * <p>Java class for ParticipationStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="tentative"/>
 *     &lt;enumeration value="needs-action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationStatus-list")
@XmlEnum
public enum ParticipationStatusList {


    /**
     * Accepted
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * Declined
     * 
     */
    @XmlEnumValue("declined")
    DECLINED("declined"),

    /**
     * Tentative
     * 
     */
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),

    /**
     * Needs Action
     * 
     */
    @XmlEnumValue("needs-action")
    NEEDS_ACTION("needs-action");
    private final java.lang.String value;

    ParticipationStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ParticipationStatusList fromValue(java.lang.String v) {
        for (ParticipationStatusList c: ParticipationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
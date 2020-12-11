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
 * <p>Java class for GuidanceResponseStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuidanceResponseStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="data-requested"/>
 *     &lt;enumeration value="data-required"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuidanceResponseStatus-list")
@XmlEnum
public enum GuidanceResponseStatusList {


    /**
     * Success
     * 
     */
    @XmlEnumValue("success")
    SUCCESS("success"),

    /**
     * Data Requested
     * 
     */
    @XmlEnumValue("data-requested")
    DATA_REQUESTED("data-requested"),

    /**
     * Data Required
     * 
     */
    @XmlEnumValue("data-required")
    DATA_REQUIRED("data-required"),

    /**
     * In Progress
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * Failure
     * 
     */
    @XmlEnumValue("failure")
    FAILURE("failure"),

    /**
     * Entered In Error
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    GuidanceResponseStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GuidanceResponseStatusList fromValue(java.lang.String v) {
        for (GuidanceResponseStatusList c: GuidanceResponseStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
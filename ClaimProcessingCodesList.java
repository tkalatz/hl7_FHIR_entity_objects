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
 * <p>Java class for ClaimProcessingCodes-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimProcessingCodes-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="queued"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimProcessingCodes-list")
@XmlEnum
public enum ClaimProcessingCodesList {


    /**
     * Queued
     * 
     */
    @XmlEnumValue("queued")
    QUEUED("queued"),

    /**
     * Processing Complete
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete"),

    /**
     * Error
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * Partial Processing
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial");
    private final java.lang.String value;

    ClaimProcessingCodesList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ClaimProcessingCodesList fromValue(java.lang.String v) {
        for (ClaimProcessingCodesList c: ClaimProcessingCodesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

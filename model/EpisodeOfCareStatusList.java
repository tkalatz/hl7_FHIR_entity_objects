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
 * <p>Java class for EpisodeOfCareStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EpisodeOfCareStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="waitlist"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="onhold"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EpisodeOfCareStatus-list")
@XmlEnum
public enum EpisodeOfCareStatusList {


    /**
     * Planned
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * Waitlist
     * 
     */
    @XmlEnumValue("waitlist")
    WAITLIST("waitlist"),

    /**
     * Active
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * On Hold
     * 
     */
    @XmlEnumValue("onhold")
    ONHOLD("onhold"),

    /**
     * Finished
     * 
     */
    @XmlEnumValue("finished")
    FINISHED("finished"),

    /**
     * Cancelled
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * Entered in Error
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    EpisodeOfCareStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EpisodeOfCareStatusList fromValue(java.lang.String v) {
        for (EpisodeOfCareStatusList c: EpisodeOfCareStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

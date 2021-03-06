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
 * <p>Java class for TriggerType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="named-event"/>
 *     &lt;enumeration value="periodic"/>
 *     &lt;enumeration value="data-changed"/>
 *     &lt;enumeration value="data-added"/>
 *     &lt;enumeration value="data-modified"/>
 *     &lt;enumeration value="data-removed"/>
 *     &lt;enumeration value="data-accessed"/>
 *     &lt;enumeration value="data-access-ended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerType-list")
@XmlEnum
public enum TriggerTypeList {


    /**
     * Named Event
     * 
     */
    @XmlEnumValue("named-event")
    NAMED_EVENT("named-event"),

    /**
     * Periodic
     * 
     */
    @XmlEnumValue("periodic")
    PERIODIC("periodic"),

    /**
     * Data Changed
     * 
     */
    @XmlEnumValue("data-changed")
    DATA_CHANGED("data-changed"),

    /**
     * Data Added
     * 
     */
    @XmlEnumValue("data-added")
    DATA_ADDED("data-added"),

    /**
     * Data Updated
     * 
     */
    @XmlEnumValue("data-modified")
    DATA_MODIFIED("data-modified"),

    /**
     * Data Removed
     * 
     */
    @XmlEnumValue("data-removed")
    DATA_REMOVED("data-removed"),

    /**
     * Data Accessed
     * 
     */
    @XmlEnumValue("data-accessed")
    DATA_ACCESSED("data-accessed"),

    /**
     * Data Access Ended
     * 
     */
    @XmlEnumValue("data-access-ended")
    DATA_ACCESS_ENDED("data-access-ended");
    private final java.lang.String value;

    TriggerTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TriggerTypeList fromValue(java.lang.String v) {
        for (TriggerTypeList c: TriggerTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

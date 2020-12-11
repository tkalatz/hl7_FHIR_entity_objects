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
 * <p>Java class for AggregationMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationMode-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="contained"/>
 *     &lt;enumeration value="referenced"/>
 *     &lt;enumeration value="bundled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationMode-list")
@XmlEnum
public enum AggregationModeList {


    /**
     * Contained
     * 
     */
    @XmlEnumValue("contained")
    CONTAINED("contained"),

    /**
     * Referenced
     * 
     */
    @XmlEnumValue("referenced")
    REFERENCED("referenced"),

    /**
     * Bundled
     * 
     */
    @XmlEnumValue("bundled")
    BUNDLED("bundled");
    private final java.lang.String value;

    AggregationModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AggregationModeList fromValue(java.lang.String v) {
        for (AggregationModeList c: AggregationModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

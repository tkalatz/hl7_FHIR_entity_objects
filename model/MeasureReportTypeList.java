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
 * <p>Java class for MeasureReportType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasureReportType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="individual"/>
 *     &lt;enumeration value="subject-list"/>
 *     &lt;enumeration value="summary"/>
 *     &lt;enumeration value="data-collection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasureReportType-list")
@XmlEnum
public enum MeasureReportTypeList {


    /**
     * Individual
     * 
     */
    @XmlEnumValue("individual")
    INDIVIDUAL("individual"),

    /**
     * Subject List
     * 
     */
    @XmlEnumValue("subject-list")
    SUBJECT_LIST("subject-list"),

    /**
     * Summary
     * 
     */
    @XmlEnumValue("summary")
    SUMMARY("summary"),

    /**
     * Data Collection
     * 
     */
    @XmlEnumValue("data-collection")
    DATA_COLLECTION("data-collection");
    private final java.lang.String value;

    MeasureReportTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MeasureReportTypeList fromValue(java.lang.String v) {
        for (MeasureReportTypeList c: MeasureReportTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

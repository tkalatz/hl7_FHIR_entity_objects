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
 * <p>Java class for TestReportStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestReportStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="waiting"/>
 *     &lt;enumeration value="stopped"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestReportStatus-list")
@XmlEnum
public enum TestReportStatusList {


    /**
     * Completed
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * In Progress
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * Waiting
     * 
     */
    @XmlEnumValue("waiting")
    WAITING("waiting"),

    /**
     * Stopped
     * 
     */
    @XmlEnumValue("stopped")
    STOPPED("stopped"),

    /**
     * Entered In Error
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    TestReportStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TestReportStatusList fromValue(java.lang.String v) {
        for (TestReportStatusList c: TestReportStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for ResearchStudyStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchStudyStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="administratively-completed"/>
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="closed-to-accrual"/>
 *     &lt;enumeration value="closed-to-accrual-and-intervention"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="disapproved"/>
 *     &lt;enumeration value="in-review"/>
 *     &lt;enumeration value="temporarily-closed-to-accrual"/>
 *     &lt;enumeration value="temporarily-closed-to-accrual-and-intervention"/>
 *     &lt;enumeration value="withdrawn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResearchStudyStatus-list")
@XmlEnum
public enum ResearchStudyStatusList {


    /**
     * Active
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Administratively Completed
     * 
     */
    @XmlEnumValue("administratively-completed")
    ADMINISTRATIVELY_COMPLETED("administratively-completed"),

    /**
     * Approved
     * 
     */
    @XmlEnumValue("approved")
    APPROVED("approved"),

    /**
     * Closed to Accrual
     * 
     */
    @XmlEnumValue("closed-to-accrual")
    CLOSED_TO_ACCRUAL("closed-to-accrual"),

    /**
     * Closed to Accrual and Intervention
     * 
     */
    @XmlEnumValue("closed-to-accrual-and-intervention")
    CLOSED_TO_ACCRUAL_AND_INTERVENTION("closed-to-accrual-and-intervention"),

    /**
     * Completed
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * Disapproved
     * 
     */
    @XmlEnumValue("disapproved")
    DISAPPROVED("disapproved"),

    /**
     * In Review
     * 
     */
    @XmlEnumValue("in-review")
    IN_REVIEW("in-review"),

    /**
     * Temporarily Closed to Accrual
     * 
     */
    @XmlEnumValue("temporarily-closed-to-accrual")
    TEMPORARILY_CLOSED_TO_ACCRUAL("temporarily-closed-to-accrual"),

    /**
     * Temporarily Closed to Accrual and Intervention
     * 
     */
    @XmlEnumValue("temporarily-closed-to-accrual-and-intervention")
    TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION("temporarily-closed-to-accrual-and-intervention"),

    /**
     * Withdrawn
     * 
     */
    @XmlEnumValue("withdrawn")
    WITHDRAWN("withdrawn");
    private final java.lang.String value;

    ResearchStudyStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResearchStudyStatusList fromValue(java.lang.String v) {
        for (ResearchStudyStatusList c: ResearchStudyStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
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
 * <p>Java class for ActionRequiredBehavior-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionRequiredBehavior-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="must"/>
 *     &lt;enumeration value="could"/>
 *     &lt;enumeration value="must-unless-documented"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionRequiredBehavior-list")
@XmlEnum
public enum ActionRequiredBehaviorList {


    /**
     * Must
     * 
     */
    @XmlEnumValue("must")
    MUST("must"),

    /**
     * Could
     * 
     */
    @XmlEnumValue("could")
    COULD("could"),

    /**
     * Must Unless Documented
     * 
     */
    @XmlEnumValue("must-unless-documented")
    MUST_UNLESS_DOCUMENTED("must-unless-documented");
    private final java.lang.String value;

    ActionRequiredBehaviorList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ActionRequiredBehaviorList fromValue(java.lang.String v) {
        for (ActionRequiredBehaviorList c: ActionRequiredBehaviorList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

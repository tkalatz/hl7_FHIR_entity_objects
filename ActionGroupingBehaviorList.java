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
 * <p>Java class for ActionGroupingBehavior-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionGroupingBehavior-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="visual-group"/>
 *     &lt;enumeration value="logical-group"/>
 *     &lt;enumeration value="sentence-group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionGroupingBehavior-list")
@XmlEnum
public enum ActionGroupingBehaviorList {


    /**
     * Visual Group
     * 
     */
    @XmlEnumValue("visual-group")
    VISUAL_GROUP("visual-group"),

    /**
     * Logical Group
     * 
     */
    @XmlEnumValue("logical-group")
    LOGICAL_GROUP("logical-group"),

    /**
     * Sentence Group
     * 
     */
    @XmlEnumValue("sentence-group")
    SENTENCE_GROUP("sentence-group");
    private final java.lang.String value;

    ActionGroupingBehaviorList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ActionGroupingBehaviorList fromValue(java.lang.String v) {
        for (ActionGroupingBehaviorList c: ActionGroupingBehaviorList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
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
 * <p>Java class for QuestionnaireItemType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionnaireItemType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="display"/>
 *     &lt;enumeration value="question"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="choice"/>
 *     &lt;enumeration value="open-choice"/>
 *     &lt;enumeration value="attachment"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="quantity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuestionnaireItemType-list")
@XmlEnum
public enum QuestionnaireItemTypeList {


    /**
     * Group
     * 
     */
    @XmlEnumValue("group")
    GROUP("group"),

    /**
     * Display
     * 
     */
    @XmlEnumValue("display")
    DISPLAY("display"),

    /**
     * Question
     * 
     */
    @XmlEnumValue("question")
    QUESTION("question"),

    /**
     * Boolean
     * 
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),

    /**
     * Decimal
     * 
     */
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),

    /**
     * Integer
     * 
     */
    @XmlEnumValue("integer")
    INTEGER("integer"),

    /**
     * Date
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * Date Time
     * 
     */
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),

    /**
     * Time
     * 
     */
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * String
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * Text
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * Url
     * 
     */
    @XmlEnumValue("url")
    URL("url"),

    /**
     * Choice
     * 
     */
    @XmlEnumValue("choice")
    CHOICE("choice"),

    /**
     * Open Choice
     * 
     */
    @XmlEnumValue("open-choice")
    OPEN_CHOICE("open-choice"),

    /**
     * Attachment
     * 
     */
    @XmlEnumValue("attachment")
    ATTACHMENT("attachment"),

    /**
     * Reference
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * Quantity
     * 
     */
    @XmlEnumValue("quantity")
    QUANTITY("quantity");
    private final java.lang.String value;

    QuestionnaireItemTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static QuestionnaireItemTypeList fromValue(java.lang.String v) {
        for (QuestionnaireItemTypeList c: QuestionnaireItemTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
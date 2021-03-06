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
 * <p>Java class for AssertionResponseTypes-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssertionResponseTypes-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="okay"/>
 *     &lt;enumeration value="created"/>
 *     &lt;enumeration value="noContent"/>
 *     &lt;enumeration value="notModified"/>
 *     &lt;enumeration value="bad"/>
 *     &lt;enumeration value="forbidden"/>
 *     &lt;enumeration value="notFound"/>
 *     &lt;enumeration value="methodNotAllowed"/>
 *     &lt;enumeration value="conflict"/>
 *     &lt;enumeration value="gone"/>
 *     &lt;enumeration value="preconditionFailed"/>
 *     &lt;enumeration value="unprocessable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssertionResponseTypes-list")
@XmlEnum
public enum AssertionResponseTypesList {


    /**
     * okay
     * 
     */
    @XmlEnumValue("okay")
    OKAY("okay"),

    /**
     * created
     * 
     */
    @XmlEnumValue("created")
    CREATED("created"),

    /**
     * noContent
     * 
     */
    @XmlEnumValue("noContent")
    NO_CONTENT("noContent"),

    /**
     * notModified
     * 
     */
    @XmlEnumValue("notModified")
    NOT_MODIFIED("notModified"),

    /**
     * bad
     * 
     */
    @XmlEnumValue("bad")
    BAD("bad"),

    /**
     * forbidden
     * 
     */
    @XmlEnumValue("forbidden")
    FORBIDDEN("forbidden"),

    /**
     * notFound
     * 
     */
    @XmlEnumValue("notFound")
    NOT_FOUND("notFound"),

    /**
     * methodNotAllowed
     * 
     */
    @XmlEnumValue("methodNotAllowed")
    METHOD_NOT_ALLOWED("methodNotAllowed"),

    /**
     * conflict
     * 
     */
    @XmlEnumValue("conflict")
    CONFLICT("conflict"),

    /**
     * gone
     * 
     */
    @XmlEnumValue("gone")
    GONE("gone"),

    /**
     * preconditionFailed
     * 
     */
    @XmlEnumValue("preconditionFailed")
    PRECONDITION_FAILED("preconditionFailed"),

    /**
     * unprocessable
     * 
     */
    @XmlEnumValue("unprocessable")
    UNPROCESSABLE("unprocessable");
    private final java.lang.String value;

    AssertionResponseTypesList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AssertionResponseTypesList fromValue(java.lang.String v) {
        for (AssertionResponseTypesList c: AssertionResponseTypesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

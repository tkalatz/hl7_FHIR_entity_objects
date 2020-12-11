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
 * <p>Java class for IssueType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="invalid"/>
 *     &lt;enumeration value="structure"/>
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="value"/>
 *     &lt;enumeration value="invariant"/>
 *     &lt;enumeration value="security"/>
 *     &lt;enumeration value="login"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="expired"/>
 *     &lt;enumeration value="forbidden"/>
 *     &lt;enumeration value="suppressed"/>
 *     &lt;enumeration value="processing"/>
 *     &lt;enumeration value="not-supported"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="multiple-matches"/>
 *     &lt;enumeration value="not-found"/>
 *     &lt;enumeration value="deleted"/>
 *     &lt;enumeration value="too-long"/>
 *     &lt;enumeration value="code-invalid"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="too-costly"/>
 *     &lt;enumeration value="business-rule"/>
 *     &lt;enumeration value="conflict"/>
 *     &lt;enumeration value="transient"/>
 *     &lt;enumeration value="lock-error"/>
 *     &lt;enumeration value="no-store"/>
 *     &lt;enumeration value="exception"/>
 *     &lt;enumeration value="timeout"/>
 *     &lt;enumeration value="incomplete"/>
 *     &lt;enumeration value="throttled"/>
 *     &lt;enumeration value="informational"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueType-list")
@XmlEnum
public enum IssueTypeList {


    /**
     * Invalid Content
     * 
     */
    @XmlEnumValue("invalid")
    INVALID("invalid"),

    /**
     * Structural Issue
     * 
     */
    @XmlEnumValue("structure")
    STRUCTURE("structure"),

    /**
     * Required element missing
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * Element value invalid
     * 
     */
    @XmlEnumValue("value")
    VALUE("value"),

    /**
     * Validation rule failed
     * 
     */
    @XmlEnumValue("invariant")
    INVARIANT("invariant"),

    /**
     * Security Problem
     * 
     */
    @XmlEnumValue("security")
    SECURITY("security"),

    /**
     * Login Required
     * 
     */
    @XmlEnumValue("login")
    LOGIN("login"),

    /**
     * Unknown User
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Session Expired
     * 
     */
    @XmlEnumValue("expired")
    EXPIRED("expired"),

    /**
     * Forbidden
     * 
     */
    @XmlEnumValue("forbidden")
    FORBIDDEN("forbidden"),

    /**
     * Information  Suppressed
     * 
     */
    @XmlEnumValue("suppressed")
    SUPPRESSED("suppressed"),

    /**
     * Processing Failure
     * 
     */
    @XmlEnumValue("processing")
    PROCESSING("processing"),

    /**
     * Content not supported
     * 
     */
    @XmlEnumValue("not-supported")
    NOT_SUPPORTED("not-supported"),

    /**
     * Duplicate
     * 
     */
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),

    /**
     * Multiple Matches
     * 
     */
    @XmlEnumValue("multiple-matches")
    MULTIPLE_MATCHES("multiple-matches"),

    /**
     * Not Found
     * 
     */
    @XmlEnumValue("not-found")
    NOT_FOUND("not-found"),

    /**
     * Deleted
     * 
     */
    @XmlEnumValue("deleted")
    DELETED("deleted"),

    /**
     * Content Too Long
     * 
     */
    @XmlEnumValue("too-long")
    TOO_LONG("too-long"),

    /**
     * Invalid Code
     * 
     */
    @XmlEnumValue("code-invalid")
    CODE_INVALID("code-invalid"),

    /**
     * Unacceptable Extension
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension"),

    /**
     * Operation Too Costly
     * 
     */
    @XmlEnumValue("too-costly")
    TOO_COSTLY("too-costly"),

    /**
     * Business Rule Violation
     * 
     */
    @XmlEnumValue("business-rule")
    BUSINESS_RULE("business-rule"),

    /**
     * Edit Version Conflict
     * 
     */
    @XmlEnumValue("conflict")
    CONFLICT("conflict"),

    /**
     * Transient Issue
     * 
     */
    @XmlEnumValue("transient")
    TRANSIENT("transient"),

    /**
     * Lock Error
     * 
     */
    @XmlEnumValue("lock-error")
    LOCK_ERROR("lock-error"),

    /**
     * No Store Available
     * 
     */
    @XmlEnumValue("no-store")
    NO_STORE("no-store"),

    /**
     * Exception
     * 
     */
    @XmlEnumValue("exception")
    EXCEPTION("exception"),

    /**
     * Timeout
     * 
     */
    @XmlEnumValue("timeout")
    TIMEOUT("timeout"),

    /**
     * Incomplete Results
     * 
     */
    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete"),

    /**
     * Throttled
     * 
     */
    @XmlEnumValue("throttled")
    THROTTLED("throttled"),

    /**
     * Informational Note
     * 
     */
    @XmlEnumValue("informational")
    INFORMATIONAL("informational");
    private final java.lang.String value;

    IssueTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IssueTypeList fromValue(java.lang.String v) {
        for (IssueTypeList c: IssueTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

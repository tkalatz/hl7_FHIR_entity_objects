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
 * <p>Java class for TestScriptRequestMethodCode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestScriptRequestMethodCode-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="get"/>
 *     &lt;enumeration value="options"/>
 *     &lt;enumeration value="patch"/>
 *     &lt;enumeration value="post"/>
 *     &lt;enumeration value="put"/>
 *     &lt;enumeration value="head"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestScriptRequestMethodCode-list")
@XmlEnum
public enum TestScriptRequestMethodCodeList {


    /**
     * DELETE
     * 
     */
    @XmlEnumValue("delete")
    DELETE("delete"),

    /**
     * GET
     * 
     */
    @XmlEnumValue("get")
    GET("get"),

    /**
     * OPTIONS
     * 
     */
    @XmlEnumValue("options")
    OPTIONS("options"),

    /**
     * PATCH
     * 
     */
    @XmlEnumValue("patch")
    PATCH("patch"),

    /**
     * POST
     * 
     */
    @XmlEnumValue("post")
    POST("post"),

    /**
     * PUT
     * 
     */
    @XmlEnumValue("put")
    PUT("put"),

    /**
     * HEAD
     * 
     */
    @XmlEnumValue("head")
    HEAD("head");
    private final java.lang.String value;

    TestScriptRequestMethodCodeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TestScriptRequestMethodCodeList fromValue(java.lang.String v) {
        for (TestScriptRequestMethodCodeList c: TestScriptRequestMethodCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
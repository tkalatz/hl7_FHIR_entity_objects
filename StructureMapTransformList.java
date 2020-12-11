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
 * <p>Java class for StructureMapTransform-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StructureMapTransform-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="copy"/>
 *     &lt;enumeration value="truncate"/>
 *     &lt;enumeration value="escape"/>
 *     &lt;enumeration value="cast"/>
 *     &lt;enumeration value="append"/>
 *     &lt;enumeration value="translate"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="dateOp"/>
 *     &lt;enumeration value="uuid"/>
 *     &lt;enumeration value="pointer"/>
 *     &lt;enumeration value="evaluate"/>
 *     &lt;enumeration value="cc"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="qty"/>
 *     &lt;enumeration value="id"/>
 *     &lt;enumeration value="cp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StructureMapTransform-list")
@XmlEnum
public enum StructureMapTransformList {


    /**
     * create
     * 
     */
    @XmlEnumValue("create")
    CREATE("create"),

    /**
     * copy
     * 
     */
    @XmlEnumValue("copy")
    COPY("copy"),

    /**
     * truncate
     * 
     */
    @XmlEnumValue("truncate")
    TRUNCATE("truncate"),

    /**
     * escape
     * 
     */
    @XmlEnumValue("escape")
    ESCAPE("escape"),

    /**
     * cast
     * 
     */
    @XmlEnumValue("cast")
    CAST("cast"),

    /**
     * append
     * 
     */
    @XmlEnumValue("append")
    APPEND("append"),

    /**
     * translate
     * 
     */
    @XmlEnumValue("translate")
    TRANSLATE("translate"),

    /**
     * reference
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * dateOp
     * 
     */
    @XmlEnumValue("dateOp")
    DATE_OP("dateOp"),

    /**
     * uuid
     * 
     */
    @XmlEnumValue("uuid")
    UUID("uuid"),

    /**
     * pointer
     * 
     */
    @XmlEnumValue("pointer")
    POINTER("pointer"),

    /**
     * evaluate
     * 
     */
    @XmlEnumValue("evaluate")
    EVALUATE("evaluate"),

    /**
     * cc
     * 
     */
    @XmlEnumValue("cc")
    CC("cc"),

    /**
     * c
     * 
     */
    @XmlEnumValue("c")
    C("c"),

    /**
     * qty
     * 
     */
    @XmlEnumValue("qty")
    QTY("qty"),

    /**
     * id
     * 
     */
    @XmlEnumValue("id")
    ID("id"),

    /**
     * cp
     * 
     */
    @XmlEnumValue("cp")
    CP("cp");
    private final java.lang.String value;

    StructureMapTransformList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StructureMapTransformList fromValue(java.lang.String v) {
        for (StructureMapTransformList c: StructureMapTransformList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

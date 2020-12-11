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
 * <p>Java class for RelatedArtifactType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedArtifactType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="documentation"/>
 *     &lt;enumeration value="justification"/>
 *     &lt;enumeration value="citation"/>
 *     &lt;enumeration value="predecessor"/>
 *     &lt;enumeration value="successor"/>
 *     &lt;enumeration value="derived-from"/>
 *     &lt;enumeration value="depends-on"/>
 *     &lt;enumeration value="composed-of"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelatedArtifactType-list")
@XmlEnum
public enum RelatedArtifactTypeList {


    /**
     * Documentation
     * 
     */
    @XmlEnumValue("documentation")
    DOCUMENTATION("documentation"),

    /**
     * Justification
     * 
     */
    @XmlEnumValue("justification")
    JUSTIFICATION("justification"),

    /**
     * Citation
     * 
     */
    @XmlEnumValue("citation")
    CITATION("citation"),

    /**
     * Predecessor
     * 
     */
    @XmlEnumValue("predecessor")
    PREDECESSOR("predecessor"),

    /**
     * Successor
     * 
     */
    @XmlEnumValue("successor")
    SUCCESSOR("successor"),

    /**
     * Derived From
     * 
     */
    @XmlEnumValue("derived-from")
    DERIVED_FROM("derived-from"),

    /**
     * Depends On
     * 
     */
    @XmlEnumValue("depends-on")
    DEPENDS_ON("depends-on"),

    /**
     * Composed Of
     * 
     */
    @XmlEnumValue("composed-of")
    COMPOSED_OF("composed-of");
    private final java.lang.String value;

    RelatedArtifactTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RelatedArtifactTypeList fromValue(java.lang.String v) {
        for (RelatedArtifactTypeList c: RelatedArtifactTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

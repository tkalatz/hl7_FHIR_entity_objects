//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Java class for TerminologyCapabilities.CodeSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminologyCapabilities.CodeSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="uri" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}TerminologyCapabilities.Version" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subsumption" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminologyCapabilities.CodeSystem", propOrder = {
    "uri",
    "version",
    "subsumption"
})
public class TerminologyCapabilitiesCodeSystem
    extends BackboneElement
{

    protected Canonical uri;
    protected List<TerminologyCapabilitiesVersion> version;
    protected Boolean subsumption;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setUri(Canonical value) {
        this.uri = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminologyCapabilitiesVersion }
     * 
     * 
     */
    public List<TerminologyCapabilitiesVersion> getVersion() {
        if (version == null) {
            version = new ArrayList<TerminologyCapabilitiesVersion>();
        }
        return this.version;
    }

    /**
     * Gets the value of the subsumption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSubsumption() {
        return subsumption;
    }

    /**
     * Sets the value of the subsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsumption(Boolean value) {
        this.subsumption = value;
    }

}

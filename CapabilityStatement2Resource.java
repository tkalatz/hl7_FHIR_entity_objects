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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Java class for CapabilityStatement2.Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityStatement2.Resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="supportedProfile" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://hl7.org/fhir}CapabilityStatement2.Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interaction" type="{http://hl7.org/fhir}CapabilityStatement2.Interaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}CapabilityStatement2.SearchParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}CapabilityStatement2.Operation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityStatement2.Resource", propOrder = {
    "type",
    "profile",
    "supportedProfile",
    "documentation",
    "feature",
    "interaction",
    "searchParam",
    "operation"
})
public class CapabilityStatement2Resource
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code type;
    protected Canonical profile;
    protected List<Canonical> supportedProfile;
    protected Markdown documentation;
    protected List<CapabilityStatement2Feature> feature;
    protected List<CapabilityStatement2Interaction> interaction;
    protected List<CapabilityStatement2SearchParam> searchParam;
    protected List<CapabilityStatement2Operation> operation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setProfile(Canonical value) {
        this.profile = value;
    }

    /**
     * Gets the value of the supportedProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getSupportedProfile() {
        if (supportedProfile == null) {
            supportedProfile = new ArrayList<Canonical>();
        }
        return this.supportedProfile;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDocumentation(Markdown value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatement2Feature }
     * 
     * 
     */
    public List<CapabilityStatement2Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<CapabilityStatement2Feature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatement2Interaction }
     * 
     * 
     */
    public List<CapabilityStatement2Interaction> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<CapabilityStatement2Interaction>();
        }
        return this.interaction;
    }

    /**
     * Gets the value of the searchParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatement2SearchParam }
     * 
     * 
     */
    public List<CapabilityStatement2SearchParam> getSearchParam() {
        if (searchParam == null) {
            searchParam = new ArrayList<CapabilityStatement2SearchParam>();
        }
        return this.searchParam;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatement2Operation }
     * 
     * 
     */
    public List<CapabilityStatement2Operation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<CapabilityStatement2Operation>();
        }
        return this.operation;
    }

}

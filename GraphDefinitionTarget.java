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
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 * 
 * <p>Java class for GraphDefinition.Target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphDefinition.Target">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="params" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="compartment" type="{http://hl7.org/fhir}GraphDefinition.Compartment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}GraphDefinition.Link" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphDefinition.Target", propOrder = {
    "type",
    "params",
    "profile",
    "compartment",
    "link"
})
public class GraphDefinitionTarget
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code type;
    protected String params;
    protected Canonical profile;
    protected List<GraphDefinitionCompartment> compartment;
    protected List<GraphDefinitionLink> link;

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
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
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
     * Gets the value of the compartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphDefinitionCompartment }
     * 
     * 
     */
    public List<GraphDefinitionCompartment> getCompartment() {
        if (compartment == null) {
            compartment = new ArrayList<GraphDefinitionCompartment>();
        }
        return this.compartment;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphDefinitionLink }
     * 
     * 
     */
    public List<GraphDefinitionLink> getLink() {
        if (link == null) {
            link = new ArrayList<GraphDefinitionLink>();
        }
        return this.link;
    }

}

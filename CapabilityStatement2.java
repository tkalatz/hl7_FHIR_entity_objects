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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for CapabilityStatement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityStatement2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}CanonicalResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}PublicationStatus"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}UsageContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}CapabilityStatementKind"/>
 *         &lt;element name="instantiates" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imports" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="software" type="{http://hl7.org/fhir}CapabilityStatement2.Software" minOccurs="0"/>
 *         &lt;element name="implementation" type="{http://hl7.org/fhir}CapabilityStatement2.Implementation" minOccurs="0"/>
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}FHIRVersion"/>
 *         &lt;element name="format" type="{http://hl7.org/fhir}code" maxOccurs="unbounded"/>
 *         &lt;element name="patchFormat" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="implementationGuide" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rest" type="{http://hl7.org/fhir}CapabilityStatement2.Rest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityStatement2", propOrder = {
    "url",
    "version",
    "name",
    "title",
    "status",
    "experimental",
    "date",
    "publisher",
    "contact",
    "description",
    "useContext",
    "jurisdiction",
    "purpose",
    "copyright",
    "kind",
    "instantiates",
    "imports",
    "software",
    "implementation",
    "fhirVersion",
    "format",
    "patchFormat",
    "implementationGuide",
    "rest"
})
public class CapabilityStatement2
    extends CanonicalResource
{

    protected Uri url;
    protected String version;
    protected String name;
    protected String title;
    @XmlElement(required = true)
    protected PublicationStatus status;
    protected Boolean experimental;
    @XmlElement(required = true)
    protected DateTime date;
    protected String publisher;
    protected List<ContactDetail> contact;
    protected Markdown description;
    protected List<UsageContext> useContext;
    protected List<CodeableConcept> jurisdiction;
    protected Markdown purpose;
    protected Markdown copyright;
    @XmlElement(required = true)
    protected CapabilityStatementKind kind;
    protected List<Canonical> instantiates;
    protected List<Canonical> imports;
    protected CapabilityStatement2Software software;
    protected CapabilityStatement2Implementation implementation;
    @XmlElement(required = true)
    protected FHIRVersion fhirVersion;
    @XmlElement(required = true)
    protected List<Code> format;
    protected List<Code> patchFormat;
    protected List<Canonical> implementationGuide;
    protected List<CapabilityStatement2Rest> rest;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStatus }
     *     
     */
    public PublicationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStatus }
     *     
     */
    public void setStatus(PublicationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactDetail>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDescription(Markdown value) {
        this.description = value;
    }

    /**
     * Gets the value of the useContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageContext }
     * 
     * 
     */
    public List<UsageContext> getUseContext() {
        if (useContext == null) {
            useContext = new ArrayList<UsageContext>();
        }
        return this.useContext;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<CodeableConcept>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setPurpose(Markdown value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setCopyright(Markdown value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityStatementKind }
     *     
     */
    public CapabilityStatementKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityStatementKind }
     *     
     */
    public void setKind(CapabilityStatementKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the instantiates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getInstantiates() {
        if (instantiates == null) {
            instantiates = new ArrayList<Canonical>();
        }
        return this.instantiates;
    }

    /**
     * Gets the value of the imports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getImports() {
        if (imports == null) {
            imports = new ArrayList<Canonical>();
        }
        return this.imports;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityStatement2Software }
     *     
     */
    public CapabilityStatement2Software getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityStatement2Software }
     *     
     */
    public void setSoftware(CapabilityStatement2Software value) {
        this.software = value;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityStatement2Implementation }
     *     
     */
    public CapabilityStatement2Implementation getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityStatement2Implementation }
     *     
     */
    public void setImplementation(CapabilityStatement2Implementation value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the fhirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link FHIRVersion }
     *     
     */
    public FHIRVersion getFhirVersion() {
        return fhirVersion;
    }

    /**
     * Sets the value of the fhirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHIRVersion }
     *     
     */
    public void setFhirVersion(FHIRVersion value) {
        this.fhirVersion = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getFormat() {
        if (format == null) {
            format = new ArrayList<Code>();
        }
        return this.format;
    }

    /**
     * Gets the value of the patchFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patchFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatchFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getPatchFormat() {
        if (patchFormat == null) {
            patchFormat = new ArrayList<Code>();
        }
        return this.patchFormat;
    }

    /**
     * Gets the value of the implementationGuide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implementationGuide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplementationGuide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getImplementationGuide() {
        if (implementationGuide == null) {
            implementationGuide = new ArrayList<Canonical>();
        }
        return this.implementationGuide;
    }

    /**
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityStatement2Rest }
     * 
     * 
     */
    public List<CapabilityStatement2Rest> getRest() {
        if (rest == null) {
            rest = new ArrayList<CapabilityStatement2Rest>();
        }
        return this.rest;
    }

}
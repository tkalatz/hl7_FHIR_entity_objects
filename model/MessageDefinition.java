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
 * <p>Java class for MessageDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}CanonicalResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="replaces" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="base" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventCoding" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="eventUri" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}MessageSignificanceCategory" minOccurs="0"/>
 *         &lt;element name="focus" type="{http://hl7.org/fhir}MessageDefinition.Focus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseRequired" type="{http://hl7.org/fhir}messageheaderResponseRequest" minOccurs="0"/>
 *         &lt;element name="allowedResponse" type="{http://hl7.org/fhir}MessageDefinition.AllowedResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="graph" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDefinition", propOrder = {
    "url",
    "identifier",
    "version",
    "name",
    "title",
    "replaces",
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
    "base",
    "parent",
    "eventCoding",
    "eventUri",
    "category",
    "focus",
    "responseRequired",
    "allowedResponse",
    "graph"
})
public class MessageDefinition
    extends CanonicalResource
{

    protected Uri url;
    protected List<Identifier> identifier;
    protected String version;
    protected String name;
    protected String title;
    protected List<Canonical> replaces;
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
    protected Canonical base;
    protected List<Canonical> parent;
    protected Coding eventCoding;
    protected Uri eventUri;
    protected MessageSignificanceCategory category;
    protected List<MessageDefinitionFocus> focus;
    protected MessageheaderResponseRequest responseRequired;
    protected List<MessageDefinitionAllowedResponse> allowedResponse;
    protected List<Canonical> graph;

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
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
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
     * Gets the value of the replaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList<Canonical>();
        }
        return this.replaces;
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
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setBase(Canonical value) {
        this.base = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getParent() {
        if (parent == null) {
            parent = new ArrayList<Canonical>();
        }
        return this.parent;
    }

    /**
     * Gets the value of the eventCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getEventCoding() {
        return eventCoding;
    }

    /**
     * Sets the value of the eventCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setEventCoding(Coding value) {
        this.eventCoding = value;
    }

    /**
     * Gets the value of the eventUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getEventUri() {
        return eventUri;
    }

    /**
     * Sets the value of the eventUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setEventUri(Uri value) {
        this.eventUri = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public MessageSignificanceCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public void setCategory(MessageSignificanceCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the focus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the focus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFocus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDefinitionFocus }
     * 
     * 
     */
    public List<MessageDefinitionFocus> getFocus() {
        if (focus == null) {
            focus = new ArrayList<MessageDefinitionFocus>();
        }
        return this.focus;
    }

    /**
     * Gets the value of the responseRequired property.
     * 
     * @return
     *     possible object is
     *     {@link MessageheaderResponseRequest }
     *     
     */
    public MessageheaderResponseRequest getResponseRequired() {
        return responseRequired;
    }

    /**
     * Sets the value of the responseRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageheaderResponseRequest }
     *     
     */
    public void setResponseRequired(MessageheaderResponseRequest value) {
        this.responseRequired = value;
    }

    /**
     * Gets the value of the allowedResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDefinitionAllowedResponse }
     * 
     * 
     */
    public List<MessageDefinitionAllowedResponse> getAllowedResponse() {
        if (allowedResponse == null) {
            allowedResponse = new ArrayList<MessageDefinitionAllowedResponse>();
        }
        return this.allowedResponse;
    }

    /**
     * Gets the value of the graph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getGraph() {
        if (graph == null) {
            graph = new ArrayList<Canonical>();
        }
        return this.graph;
    }

}

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
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 * 
 * <p>Java class for Questionnaire.Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire.Item">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="linkId" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="definition" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}QuestionnaireItemType"/>
 *         &lt;element name="enableWhen" type="{http://hl7.org/fhir}Questionnaire.EnableWhen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enableBehavior" type="{http://hl7.org/fhir}EnableWhenBehavior" minOccurs="0"/>
 *         &lt;element name="required" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="repeats" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="readOnly" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="answerValueSet" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="answerOption" type="{http://hl7.org/fhir}Questionnaire.AnswerOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initial" type="{http://hl7.org/fhir}Questionnaire.Initial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}Questionnaire.Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.Item", propOrder = {
    "linkId",
    "definition",
    "code",
    "prefix",
    "text",
    "type",
    "enableWhen",
    "enableBehavior",
    "required",
    "repeats",
    "readOnly",
    "maxLength",
    "answerValueSet",
    "answerOption",
    "initial",
    "item"
})
public class QuestionnaireItem
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String linkId;
    protected Uri definition;
    protected List<Coding> code;
    protected String prefix;
    protected String text;
    @XmlElement(required = true)
    protected QuestionnaireItemType type;
    protected List<QuestionnaireEnableWhen> enableWhen;
    protected EnableWhenBehavior enableBehavior;
    protected Boolean required;
    protected Boolean repeats;
    protected Boolean readOnly;
    protected Integer maxLength;
    protected Canonical answerValueSet;
    protected List<QuestionnaireAnswerOption> answerOption;
    protected List<QuestionnaireInitial> initial;
    protected List<QuestionnaireItem> item;

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setDefinition(Uri value) {
        this.definition = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCode() {
        if (code == null) {
            code = new ArrayList<Coding>();
        }
        return this.code;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireItemType }
     *     
     */
    public QuestionnaireItemType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireItemType }
     *     
     */
    public void setType(QuestionnaireItemType value) {
        this.type = value;
    }

    /**
     * Gets the value of the enableWhen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enableWhen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnableWhen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireEnableWhen }
     * 
     * 
     */
    public List<QuestionnaireEnableWhen> getEnableWhen() {
        if (enableWhen == null) {
            enableWhen = new ArrayList<QuestionnaireEnableWhen>();
        }
        return this.enableWhen;
    }

    /**
     * Gets the value of the enableBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link EnableWhenBehavior }
     *     
     */
    public EnableWhenBehavior getEnableBehavior() {
        return enableBehavior;
    }

    /**
     * Sets the value of the enableBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableWhenBehavior }
     *     
     */
    public void setEnableBehavior(EnableWhenBehavior value) {
        this.enableBehavior = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRepeats() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeats(Boolean value) {
        this.repeats = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the answerValueSet property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getAnswerValueSet() {
        return answerValueSet;
    }

    /**
     * Sets the value of the answerValueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setAnswerValueSet(Canonical value) {
        this.answerValueSet = value;
    }

    /**
     * Gets the value of the answerOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswerOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireAnswerOption }
     * 
     * 
     */
    public List<QuestionnaireAnswerOption> getAnswerOption() {
        if (answerOption == null) {
            answerOption = new ArrayList<QuestionnaireAnswerOption>();
        }
        return this.answerOption;
    }

    /**
     * Gets the value of the initial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireInitial }
     * 
     * 
     */
    public List<QuestionnaireInitial> getInitial() {
        if (initial == null) {
            initial = new ArrayList<QuestionnaireInitial>();
        }
        return this.initial;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireItem }
     * 
     * 
     */
    public List<QuestionnaireItem> getItem() {
        if (item == null) {
            item = new ArrayList<QuestionnaireItem>();
        }
        return this.item;
    }

}

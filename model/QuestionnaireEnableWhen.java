//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 * 
 * <p>Java class for Questionnaire.EnableWhen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire.EnableWhen">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="question" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="operator" type="{http://hl7.org/fhir}QuestionnaireItemOperator"/>
 *         &lt;element name="answerBoolean" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="answerDecimal" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="answerInteger" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="answerDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="answerDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="answerTime" type="{http://hl7.org/fhir}time" minOccurs="0"/>
 *         &lt;element name="answerString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="answerCoding" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="answerQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="answerReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.EnableWhen", propOrder = {
    "question",
    "operator",
    "answerBoolean",
    "answerDecimal",
    "answerInteger",
    "answerDate",
    "answerDateTime",
    "answerTime",
    "answerString",
    "answerCoding",
    "answerQuantity",
    "answerReference"
})
public class QuestionnaireEnableWhen
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String question;
    @XmlElement(required = true)
    protected QuestionnaireItemOperator operator;
    protected Boolean answerBoolean;
    protected Decimal answerDecimal;
    protected Integer answerInteger;
    protected Date answerDate;
    protected DateTime answerDateTime;
    protected Time answerTime;
    protected String answerString;
    protected Coding answerCoding;
    protected Quantity answerQuantity;
    protected Reference answerReference;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireItemOperator }
     *     
     */
    public QuestionnaireItemOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireItemOperator }
     *     
     */
    public void setOperator(QuestionnaireItemOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the answerBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnswerBoolean() {
        return answerBoolean;
    }

    /**
     * Sets the value of the answerBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerBoolean(Boolean value) {
        this.answerBoolean = value;
    }

    /**
     * Gets the value of the answerDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAnswerDecimal() {
        return answerDecimal;
    }

    /**
     * Sets the value of the answerDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAnswerDecimal(Decimal value) {
        this.answerDecimal = value;
    }

    /**
     * Gets the value of the answerInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnswerInteger() {
        return answerInteger;
    }

    /**
     * Sets the value of the answerInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnswerInteger(Integer value) {
        this.answerInteger = value;
    }

    /**
     * Gets the value of the answerDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAnswerDate() {
        return answerDate;
    }

    /**
     * Sets the value of the answerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAnswerDate(Date value) {
        this.answerDate = value;
    }

    /**
     * Gets the value of the answerDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAnswerDateTime() {
        return answerDateTime;
    }

    /**
     * Sets the value of the answerDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAnswerDateTime(DateTime value) {
        this.answerDateTime = value;
    }

    /**
     * Gets the value of the answerTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getAnswerTime() {
        return answerTime;
    }

    /**
     * Sets the value of the answerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setAnswerTime(Time value) {
        this.answerTime = value;
    }

    /**
     * Gets the value of the answerString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerString() {
        return answerString;
    }

    /**
     * Sets the value of the answerString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerString(String value) {
        this.answerString = value;
    }

    /**
     * Gets the value of the answerCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getAnswerCoding() {
        return answerCoding;
    }

    /**
     * Sets the value of the answerCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setAnswerCoding(Coding value) {
        this.answerCoding = value;
    }

    /**
     * Gets the value of the answerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getAnswerQuantity() {
        return answerQuantity;
    }

    /**
     * Sets the value of the answerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setAnswerQuantity(Quantity value) {
        this.answerQuantity = value;
    }

    /**
     * Gets the value of the answerReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAnswerReference() {
        return answerReference;
    }

    /**
     * Sets the value of the answerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAnswerReference(Reference value) {
        this.answerReference = value;
    }

}

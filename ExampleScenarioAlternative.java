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
 * Example of workflow instance.
 * 
 * <p>Java class for ExampleScenario.Alternative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExampleScenario.Alternative">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="step" type="{http://hl7.org/fhir}ExampleScenario.Step" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExampleScenario.Alternative", propOrder = {
    "title",
    "description",
    "step"
})
public class ExampleScenarioAlternative
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String title;
    protected Markdown description;
    protected List<ExampleScenarioStep> step;

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
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExampleScenarioStep }
     * 
     * 
     */
    public List<ExampleScenarioStep> getStep() {
        if (step == null) {
            step = new ArrayList<ExampleScenarioStep>();
        }
        return this.step;
    }

}

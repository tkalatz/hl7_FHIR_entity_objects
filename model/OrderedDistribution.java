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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for OrderedDistribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderedDistribution">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfIntervals" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="bottomOfFirstInterval" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://hl7.org/fhir}OrderedDistribution.Interval" maxOccurs="unbounded"/>
 *         &lt;element name="topOfInterval" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderedDistribution", propOrder = {
    "description",
    "note",
    "numberOfIntervals",
    "bottomOfFirstInterval",
    "interval",
    "topOfInterval"
})
public class OrderedDistribution
    extends BackboneType
{

    protected String description;
    protected List<Annotation> note;
    @XmlElement(required = true)
    protected Integer numberOfIntervals;
    protected Quantity bottomOfFirstInterval;
    @XmlElement(required = true)
    protected List<OrderedDistributionInterval> interval;
    protected Quantity topOfInterval;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNote() {
        if (note == null) {
            note = new ArrayList<Annotation>();
        }
        return this.note;
    }

    /**
     * Gets the value of the numberOfIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfIntervals() {
        return numberOfIntervals;
    }

    /**
     * Sets the value of the numberOfIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfIntervals(Integer value) {
        this.numberOfIntervals = value;
    }

    /**
     * Gets the value of the bottomOfFirstInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getBottomOfFirstInterval() {
        return bottomOfFirstInterval;
    }

    /**
     * Sets the value of the bottomOfFirstInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setBottomOfFirstInterval(Quantity value) {
        this.bottomOfFirstInterval = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderedDistributionInterval }
     * 
     * 
     */
    public List<OrderedDistributionInterval> getInterval() {
        if (interval == null) {
            interval = new ArrayList<OrderedDistributionInterval>();
        }
        return this.interval;
    }

    /**
     * Gets the value of the topOfInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getTopOfInterval() {
        return topOfInterval;
    }

    /**
     * Sets the value of the topOfInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setTopOfInterval(Quantity value) {
        this.topOfInterval = value;
    }

}

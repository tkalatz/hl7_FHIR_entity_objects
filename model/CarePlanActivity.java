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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="performedActivity" type="{http://hl7.org/fhir}CodeableReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="progress" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plannedActivityReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="plannedActivityDetail" type="{http://hl7.org/fhir}CarePlan.PlannedActivityDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Activity", propOrder = {
    "performedActivity",
    "progress",
    "plannedActivityReference",
    "plannedActivityDetail"
})
public class CarePlanActivity
    extends BackboneElement
{

    protected List<CodeableReference> performedActivity;
    protected List<Annotation> progress;
    protected Reference plannedActivityReference;
    protected CarePlanPlannedActivityDetail plannedActivityDetail;

    /**
     * Gets the value of the performedActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performedActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformedActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableReference }
     * 
     * 
     */
    public List<CodeableReference> getPerformedActivity() {
        if (performedActivity == null) {
            performedActivity = new ArrayList<CodeableReference>();
        }
        return this.performedActivity;
    }

    /**
     * Gets the value of the progress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getProgress() {
        if (progress == null) {
            progress = new ArrayList<Annotation>();
        }
        return this.progress;
    }

    /**
     * Gets the value of the plannedActivityReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPlannedActivityReference() {
        return plannedActivityReference;
    }

    /**
     * Sets the value of the plannedActivityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPlannedActivityReference(Reference value) {
        this.plannedActivityReference = value;
    }

    /**
     * Gets the value of the plannedActivityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanPlannedActivityDetail }
     *     
     */
    public CarePlanPlannedActivityDetail getPlannedActivityDetail() {
        return plannedActivityDetail;
    }

    /**
     * Sets the value of the plannedActivityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanPlannedActivityDetail }
     *     
     */
    public void setPlannedActivityDetail(CarePlanPlannedActivityDetail value) {
        this.plannedActivityDetail = value;
    }

}
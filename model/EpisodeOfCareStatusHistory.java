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
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * 
 * <p>Java class for EpisodeOfCare.StatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpisodeOfCare.StatusHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://hl7.org/fhir}EpisodeOfCareStatus"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpisodeOfCare.StatusHistory", propOrder = {
    "status",
    "period"
})
public class EpisodeOfCareStatusHistory
    extends BackboneElement
{

    @XmlElement(required = true)
    protected EpisodeOfCareStatus status;
    @XmlElement(required = true)
    protected Period period;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EpisodeOfCareStatus }
     *     
     */
    public EpisodeOfCareStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpisodeOfCareStatus }
     *     
     */
    public void setStatus(EpisodeOfCareStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}

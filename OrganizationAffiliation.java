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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for OrganizationAffiliation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationAffiliation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="participatingOrganization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="network" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialty" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="healthcareService" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAffiliation", propOrder = {
    "identifier",
    "active",
    "period",
    "organization",
    "participatingOrganization",
    "network",
    "code",
    "specialty",
    "location",
    "healthcareService",
    "telecom",
    "endpoint"
})
public class OrganizationAffiliation
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected Boolean active;
    protected Period period;
    protected Reference organization;
    protected Reference participatingOrganization;
    protected List<Reference> network;
    protected List<CodeableConcept> code;
    protected List<CodeableConcept> specialty;
    protected List<Reference> location;
    protected List<Reference> healthcareService;
    protected List<ContactPoint> telecom;
    protected List<Reference> endpoint;

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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
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

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * Gets the value of the participatingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParticipatingOrganization() {
        return participatingOrganization;
    }

    /**
     * Sets the value of the participatingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParticipatingOrganization(Reference value) {
        this.participatingOrganization = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getNetwork() {
        if (network == null) {
            network = new ArrayList<Reference>();
        }
        return this.network;
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
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCode() {
        if (code == null) {
            code = new ArrayList<CodeableConcept>();
        }
        return this.code;
    }

    /**
     * Gets the value of the specialty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialty() {
        if (specialty == null) {
            specialty = new ArrayList<CodeableConcept>();
        }
        return this.specialty;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getLocation() {
        if (location == null) {
            location = new ArrayList<Reference>();
        }
        return this.location;
    }

    /**
     * Gets the value of the healthcareService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthcareService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthcareService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getHealthcareService() {
        if (healthcareService == null) {
            healthcareService = new ArrayList<Reference>();
        }
        return this.healthcareService;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<ContactPoint>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getEndpoint() {
        if (endpoint == null) {
            endpoint = new ArrayList<Reference>();
        }
        return this.endpoint;
    }

}

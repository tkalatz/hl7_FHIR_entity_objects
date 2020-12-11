//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.11 at 03:47:56 PM EET 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestResourceTypeTkalatz-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestResourceTypeTkalatz-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="AppointmentResponse"/>
 *     &lt;enumeration value="CarePlan"/>
 *     &lt;enumeration value="Claim"/>
 *     &lt;enumeration value="CommunicationRequest"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="DeviceRequest"/>
 *     &lt;enumeration value="EnrollmentRequest"/>
 *     &lt;enumeration value="ImmunizationRecommendation"/>
 *     &lt;enumeration value="MedicationRequest"/>
 *     &lt;enumeration value="NutritionOrder"/>
 *     &lt;enumeration value="ServiceRequest"/>
 *     &lt;enumeration value="SupplyRequest"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="VisionPrescription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestResourceTypeTkalatz-list")
@XmlEnum
public enum RequestResourceTypeTkalatzList {


    /**
     * Appointment
     * 
     */
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),

    /**
     * AppointmentResponse
     * 
     */
    @XmlEnumValue("AppointmentResponse")
    APPOINTMENT_RESPONSE("AppointmentResponse"),

    /**
     * CarePlan
     * 
     */
    @XmlEnumValue("CarePlan")
    CARE_PLAN("CarePlan"),

    /**
     * Claim
     * 
     */
    @XmlEnumValue("Claim")
    CLAIM("Claim"),

    /**
     * CommunicationRequest
     * 
     */
    @XmlEnumValue("CommunicationRequest")
    COMMUNICATION_REQUEST("CommunicationRequest"),

    /**
     * Contract
     * 
     */
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),

    /**
     * DeviceRequest
     * 
     */
    @XmlEnumValue("DeviceRequest")
    DEVICE_REQUEST("DeviceRequest"),

    /**
     * EnrollmentRequest
     * 
     */
    @XmlEnumValue("EnrollmentRequest")
    ENROLLMENT_REQUEST("EnrollmentRequest"),

    /**
     * ImmunizationRecommendation
     * 
     */
    @XmlEnumValue("ImmunizationRecommendation")
    IMMUNIZATION_RECOMMENDATION("ImmunizationRecommendation"),

    /**
     * MedicationRequest
     * 
     */
    @XmlEnumValue("MedicationRequest")
    MEDICATION_REQUEST("MedicationRequest"),

    /**
     * NutritionOrder
     * 
     */
    @XmlEnumValue("NutritionOrder")
    NUTRITION_ORDER("NutritionOrder"),

    /**
     * ServiceRequest
     * 
     */
    @XmlEnumValue("ServiceRequest")
    SERVICE_REQUEST("ServiceRequest"),

    /**
     * SupplyRequest
     * 
     */
    @XmlEnumValue("SupplyRequest")
    SUPPLY_REQUEST("SupplyRequest"),

    /**
     * Task
     * 
     */
    @XmlEnumValue("Task")
    TASK("Task"),

    /**
     * VisionPrescription
     * 
     */
    @XmlEnumValue("VisionPrescription")
    VISION_PRESCRIPTION("VisionPrescription");
    private final java.lang.String value;

    RequestResourceTypeTkalatzList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RequestResourceTypeTkalatzList fromValue(java.lang.String v) {
        for (RequestResourceTypeTkalatzList c: RequestResourceTypeTkalatzList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

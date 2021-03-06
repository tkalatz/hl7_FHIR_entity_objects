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
 * <p>Java class for ResourceType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="ActivityDefinition"/>
 *     &lt;enumeration value="AdministrableProductDefinition"/>
 *     &lt;enumeration value="AdverseEvent"/>
 *     &lt;enumeration value="AllergyIntolerance"/>
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="AppointmentResponse"/>
 *     &lt;enumeration value="AuditEvent"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Binary"/>
 *     &lt;enumeration value="BiologicallyDerivedProduct"/>
 *     &lt;enumeration value="BodyStructure"/>
 *     &lt;enumeration value="Bundle"/>
 *     &lt;enumeration value="CapabilityStatement"/>
 *     &lt;enumeration value="CapabilityStatement2"/>
 *     &lt;enumeration value="CarePlan"/>
 *     &lt;enumeration value="CareTeam"/>
 *     &lt;enumeration value="CatalogEntry"/>
 *     &lt;enumeration value="ChargeItem"/>
 *     &lt;enumeration value="ChargeItemDefinition"/>
 *     &lt;enumeration value="Citation"/>
 *     &lt;enumeration value="Claim"/>
 *     &lt;enumeration value="ClaimResponse"/>
 *     &lt;enumeration value="ClinicalImpression"/>
 *     &lt;enumeration value="ClinicalUseIssue"/>
 *     &lt;enumeration value="CodeSystem"/>
 *     &lt;enumeration value="Communication"/>
 *     &lt;enumeration value="CommunicationRequest"/>
 *     &lt;enumeration value="CompartmentDefinition"/>
 *     &lt;enumeration value="Composition"/>
 *     &lt;enumeration value="ConceptMap"/>
 *     &lt;enumeration value="Condition"/>
 *     &lt;enumeration value="ConditionDefinition"/>
 *     &lt;enumeration value="Consent"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Coverage"/>
 *     &lt;enumeration value="CoverageEligibilityRequest"/>
 *     &lt;enumeration value="CoverageEligibilityResponse"/>
 *     &lt;enumeration value="DetectedIssue"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="DeviceDefinition"/>
 *     &lt;enumeration value="DeviceMetric"/>
 *     &lt;enumeration value="DeviceRequest"/>
 *     &lt;enumeration value="DeviceUseStatement"/>
 *     &lt;enumeration value="DiagnosticReport"/>
 *     &lt;enumeration value="DocumentManifest"/>
 *     &lt;enumeration value="DocumentReference"/>
 *     &lt;enumeration value="DomainResource"/>
 *     &lt;enumeration value="Encounter"/>
 *     &lt;enumeration value="Endpoint"/>
 *     &lt;enumeration value="EnrollmentRequest"/>
 *     &lt;enumeration value="EnrollmentResponse"/>
 *     &lt;enumeration value="EpisodeOfCare"/>
 *     &lt;enumeration value="EventDefinition"/>
 *     &lt;enumeration value="Evidence"/>
 *     &lt;enumeration value="EvidenceReport"/>
 *     &lt;enumeration value="EvidenceVariable"/>
 *     &lt;enumeration value="ExampleScenario"/>
 *     &lt;enumeration value="ExplanationOfBenefit"/>
 *     &lt;enumeration value="FamilyMemberHistory"/>
 *     &lt;enumeration value="Flag"/>
 *     &lt;enumeration value="Goal"/>
 *     &lt;enumeration value="GraphDefinition"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="GuidanceResponse"/>
 *     &lt;enumeration value="HealthcareService"/>
 *     &lt;enumeration value="ImagingStudy"/>
 *     &lt;enumeration value="Immunization"/>
 *     &lt;enumeration value="ImmunizationEvaluation"/>
 *     &lt;enumeration value="ImmunizationRecommendation"/>
 *     &lt;enumeration value="ImplementationGuide"/>
 *     &lt;enumeration value="Ingredient"/>
 *     &lt;enumeration value="InsurancePlan"/>
 *     &lt;enumeration value="InventoryReport"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Library"/>
 *     &lt;enumeration value="Linkage"/>
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="ManufacturedItemDefinition"/>
 *     &lt;enumeration value="Measure"/>
 *     &lt;enumeration value="MeasureReport"/>
 *     &lt;enumeration value="Medication"/>
 *     &lt;enumeration value="MedicationAdministration"/>
 *     &lt;enumeration value="MedicationDispense"/>
 *     &lt;enumeration value="MedicationKnowledge"/>
 *     &lt;enumeration value="MedicationRequest"/>
 *     &lt;enumeration value="MedicationUsage"/>
 *     &lt;enumeration value="MedicinalProductDefinition"/>
 *     &lt;enumeration value="MessageDefinition"/>
 *     &lt;enumeration value="MessageHeader"/>
 *     &lt;enumeration value="MolecularSequence"/>
 *     &lt;enumeration value="NamingSystem"/>
 *     &lt;enumeration value="NutritionIntake"/>
 *     &lt;enumeration value="NutritionOrder"/>
 *     &lt;enumeration value="NutritionProduct"/>
 *     &lt;enumeration value="Observation"/>
 *     &lt;enumeration value="ObservationDefinition"/>
 *     &lt;enumeration value="OperationDefinition"/>
 *     &lt;enumeration value="OperationOutcome"/>
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="OrganizationAffiliation"/>
 *     &lt;enumeration value="PackagedProductDefinition"/>
 *     &lt;enumeration value="Parameters"/>
 *     &lt;enumeration value="Patient"/>
 *     &lt;enumeration value="PaymentNotice"/>
 *     &lt;enumeration value="PaymentReconciliation"/>
 *     &lt;enumeration value="Permission"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="PlanDefinition"/>
 *     &lt;enumeration value="Practitioner"/>
 *     &lt;enumeration value="PractitionerRole"/>
 *     &lt;enumeration value="Procedure"/>
 *     &lt;enumeration value="Provenance"/>
 *     &lt;enumeration value="Questionnaire"/>
 *     &lt;enumeration value="QuestionnaireResponse"/>
 *     &lt;enumeration value="RegulatedAuthorization"/>
 *     &lt;enumeration value="RelatedPerson"/>
 *     &lt;enumeration value="RequestGroup"/>
 *     &lt;enumeration value="ResearchStudy"/>
 *     &lt;enumeration value="ResearchSubject"/>
 *     &lt;enumeration value="Resource"/>
 *     &lt;enumeration value="RiskAssessment"/>
 *     &lt;enumeration value="Schedule"/>
 *     &lt;enumeration value="SearchParameter"/>
 *     &lt;enumeration value="ServiceRequest"/>
 *     &lt;enumeration value="Slot"/>
 *     &lt;enumeration value="Specimen"/>
 *     &lt;enumeration value="SpecimenDefinition"/>
 *     &lt;enumeration value="StructureDefinition"/>
 *     &lt;enumeration value="StructureMap"/>
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="SubscriptionStatus"/>
 *     &lt;enumeration value="SubscriptionTopic"/>
 *     &lt;enumeration value="Substance"/>
 *     &lt;enumeration value="SubstanceDefinition"/>
 *     &lt;enumeration value="SubstanceNucleicAcid"/>
 *     &lt;enumeration value="SubstancePolymer"/>
 *     &lt;enumeration value="SubstanceProtein"/>
 *     &lt;enumeration value="SubstanceReferenceInformation"/>
 *     &lt;enumeration value="SubstanceSourceMaterial"/>
 *     &lt;enumeration value="SupplyDelivery"/>
 *     &lt;enumeration value="SupplyRequest"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="TerminologyCapabilities"/>
 *     &lt;enumeration value="TestReport"/>
 *     &lt;enumeration value="TestScript"/>
 *     &lt;enumeration value="ValueSet"/>
 *     &lt;enumeration value="VerificationResult"/>
 *     &lt;enumeration value="VisionPrescription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceType-list")
@XmlEnum
public enum ResourceTypeList {


    /**
     * \u8d26\u6237
     * 
     */
    @XmlEnumValue("Account")
    ACCOUNT("Account"),

    /**
     * \u6d3b\u52a8\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("ActivityDefinition")
    ACTIVITY_DEFINITION("ActivityDefinition"),

    /**
     * AdministrableProductDefinition
     * 
     */
    @XmlEnumValue("AdministrableProductDefinition")
    ADMINISTRABLE_PRODUCT_DEFINITION("AdministrableProductDefinition"),

    /**
     * \u4e0d\u826f\u4e8b\u4ef6
     * 
     */
    @XmlEnumValue("AdverseEvent")
    ADVERSE_EVENT("AdverseEvent"),

    /**
     * \u53d8\u6001\u53cd\u5e94\u4e0e\u4e0d\u8010\u6027
     * 
     */
    @XmlEnumValue("AllergyIntolerance")
    ALLERGY_INTOLERANCE("AllergyIntolerance"),

    /**
     * \u9884\u7ea6
     * 
     */
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),

    /**
     * \u9884\u7ea6\u54cd\u5e94
     * 
     */
    @XmlEnumValue("AppointmentResponse")
    APPOINTMENT_RESPONSE("AppointmentResponse"),

    /**
     * \u5ba1\u8ba1\u4e8b\u4ef6
     * 
     */
    @XmlEnumValue("AuditEvent")
    AUDIT_EVENT("AuditEvent"),

    /**
     * \u521d\u7ea7\u8d44\u6e90
     * 
     */
    @XmlEnumValue("Basic")
    BASIC("Basic"),

    /**
     * \u4e8c\u8fdb\u5236\u8d44\u6e90
     * 
     */
    @XmlEnumValue("Binary")
    BINARY("Binary"),

    /**
     * BiologicallyDerivedProduct
     * 
     */
    @XmlEnumValue("BiologicallyDerivedProduct")
    BIOLOGICALLY_DERIVED_PRODUCT("BiologicallyDerivedProduct"),

    /**
     * \u8eab\u4f53\u7ed3\u6784
     * 
     */
    @XmlEnumValue("BodyStructure")
    BODY_STRUCTURE("BodyStructure"),

    /**
     * \u6346\u675f
     * 
     */
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),

    /**
     * \u80fd\u529b\u58f0\u660e
     * 
     */
    @XmlEnumValue("CapabilityStatement")
    CAPABILITY_STATEMENT("CapabilityStatement"),

    /**
     * CapabilityStatement2
     * 
     */
    @XmlEnumValue("CapabilityStatement2")
    CAPABILITY_STATEMENT_2("CapabilityStatement2"),

    /**
     * \u7167\u62a4\u8ba1\u5212
     * 
     */
    @XmlEnumValue("CarePlan")
    CARE_PLAN("CarePlan"),

    /**
     * \u7167\u62a4\u56e2\u961f
     * 
     */
    @XmlEnumValue("CareTeam")
    CARE_TEAM("CareTeam"),

    /**
     * \u6761\u76ee\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("CatalogEntry")
    CATALOG_ENTRY("CatalogEntry"),

    /**
     * \u6536\u8d39\u9879\u76ee
     * 
     */
    @XmlEnumValue("ChargeItem")
    CHARGE_ITEM("ChargeItem"),

    /**
     * ChargeItemDefinition
     * 
     */
    @XmlEnumValue("ChargeItemDefinition")
    CHARGE_ITEM_DEFINITION("ChargeItemDefinition"),

    /**
     * Citation
     * 
     */
    @XmlEnumValue("Citation")
    CITATION("Citation"),

    /**
     * \u8d54\u5355
     * 
     */
    @XmlEnumValue("Claim")
    CLAIM("Claim"),

    /**
     * \u8d54\u5355\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("ClaimResponse")
    CLAIM_RESPONSE("ClaimResponse"),

    /**
     * \u4e34\u5e8a\u5370\u8c61
     * 
     */
    @XmlEnumValue("ClinicalImpression")
    CLINICAL_IMPRESSION("ClinicalImpression"),

    /**
     * ClinicalUseIssue
     * 
     */
    @XmlEnumValue("ClinicalUseIssue")
    CLINICAL_USE_ISSUE("ClinicalUseIssue"),

    /**
     * \u4ee3\u7801\u7cfb\u7edf
     * 
     */
    @XmlEnumValue("CodeSystem")
    CODE_SYSTEM("CodeSystem"),

    /**
     * \u901a\u8baf
     * 
     */
    @XmlEnumValue("Communication")
    COMMUNICATION("Communication"),

    /**
     * \u901a\u8baf\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("CommunicationRequest")
    COMMUNICATION_REQUEST("CommunicationRequest"),

    /**
     * \u903b\u8f91\u533a\u5757\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("CompartmentDefinition")
    COMPARTMENT_DEFINITION("CompartmentDefinition"),

    /**
     * \u7ec4\u5408\u5f0f\u6587\u4e66
     * 
     */
    @XmlEnumValue("Composition")
    COMPOSITION("Composition"),

    /**
     * \u6982\u5ff5\u6620\u5c04
     * 
     */
    @XmlEnumValue("ConceptMap")
    CONCEPT_MAP("ConceptMap"),

    /**
     * \u60c5\u51b5
     * 
     */
    @XmlEnumValue("Condition")
    CONDITION("Condition"),

    /**
     * ConditionDefinition
     * 
     */
    @XmlEnumValue("ConditionDefinition")
    CONDITION_DEFINITION("ConditionDefinition"),

    /**
     * \u540c\u610f\u4e66
     * 
     */
    @XmlEnumValue("Consent")
    CONSENT("Consent"),

    /**
     * \u5408\u540c
     * 
     */
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),

    /**
     * \u4fdd\u9669\u8d23\u4efb
     * 
     */
    @XmlEnumValue("Coverage")
    COVERAGE("Coverage"),

    /**
     * \u8d44\u683c\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("CoverageEligibilityRequest")
    COVERAGE_ELIGIBILITY_REQUEST("CoverageEligibilityRequest"),

    /**
     * \u8d44\u683c\u54cd\u5e94
     * 
     */
    @XmlEnumValue("CoverageEligibilityResponse")
    COVERAGE_ELIGIBILITY_RESPONSE("CoverageEligibilityResponse"),

    /**
     * \u5df2\u53d1\u73b0\u95ee\u9898
     * 
     */
    @XmlEnumValue("DetectedIssue")
    DETECTED_ISSUE("DetectedIssue"),

    /**
     * \u88c5\u7f6e
     * 
     */
    @XmlEnumValue("Device")
    DEVICE("Device"),

    /**
     * \u88c5\u7f6e\u7ec4\u4ef6
     * 
     */
    @XmlEnumValue("DeviceDefinition")
    DEVICE_DEFINITION("DeviceDefinition"),

    /**
     * \u88c5\u7f6e\u6307\u6807
     * 
     */
    @XmlEnumValue("DeviceMetric")
    DEVICE_METRIC("DeviceMetric"),

    /**
     * \u88c5\u7f6e\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("DeviceRequest")
    DEVICE_REQUEST("DeviceRequest"),

    /**
     * \u88c5\u7f6e\u4f7f\u7528\u58f0\u660e
     * 
     */
    @XmlEnumValue("DeviceUseStatement")
    DEVICE_USE_STATEMENT("DeviceUseStatement"),

    /**
     * InformeDiagnostico
     * 
     */
    @XmlEnumValue("DiagnosticReport")
    DIAGNOSTIC_REPORT("DiagnosticReport"),

    /**
     * ManifestoDocumento
     * 
     */
    @XmlEnumValue("DocumentManifest")
    DOCUMENT_MANIFEST("DocumentManifest"),

    /**
     * \u6587\u6863\u5f15\u7528
     * 
     */
    @XmlEnumValue("DocumentReference")
    DOCUMENT_REFERENCE("DocumentReference"),

    /**
     * \u9886\u57df\u8d44\u6e90
     * 
     */
    @XmlEnumValue("DomainResource")
    DOMAIN_RESOURCE("DomainResource"),

    /**
     * Encuentro
     * 
     */
    @XmlEnumValue("Encounter")
    ENCOUNTER("Encounter"),

    /**
     * \u7aef\u70b9
     * 
     */
    @XmlEnumValue("Endpoint")
    ENDPOINT("Endpoint"),

    /**
     * \u4fdd\u9669\u6ce8\u518c\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("EnrollmentRequest")
    ENROLLMENT_REQUEST("EnrollmentRequest"),

    /**
     * \u4fdd\u9669\u6ce8\u518c\u54cd\u5e94
     * 
     */
    @XmlEnumValue("EnrollmentResponse")
    ENROLLMENT_RESPONSE("EnrollmentResponse"),

    /**
     * \u7167\u62a4\u670d\u52a1\u8282\u6bb5
     * 
     */
    @XmlEnumValue("EpisodeOfCare")
    EPISODE_OF_CARE("EpisodeOfCare"),

    /**
     * \u4e8b\u4ef6\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("EventDefinition")
    EVENT_DEFINITION("EventDefinition"),

    /**
     * Evidence
     * 
     */
    @XmlEnumValue("Evidence")
    EVIDENCE("Evidence"),

    /**
     * EvidenceReport
     * 
     */
    @XmlEnumValue("EvidenceReport")
    EVIDENCE_REPORT("EvidenceReport"),

    /**
     * EvidenceVariable
     * 
     */
    @XmlEnumValue("EvidenceVariable")
    EVIDENCE_VARIABLE("EvidenceVariable"),

    /**
     * \u793a\u4f8b\u573a\u666f
     * 
     */
    @XmlEnumValue("ExampleScenario")
    EXAMPLE_SCENARIO("ExampleScenario"),

    /**
     * \u8d54\u4ed8\u8bf4\u660e
     * 
     */
    @XmlEnumValue("ExplanationOfBenefit")
    EXPLANATION_OF_BENEFIT("ExplanationOfBenefit"),

    /**
     * \u5bb6\u65cf\u53f2
     * 
     */
    @XmlEnumValue("FamilyMemberHistory")
    FAMILY_MEMBER_HISTORY("FamilyMemberHistory"),

    /**
     * \u6807\u8bb0
     * 
     */
    @XmlEnumValue("Flag")
    FLAG("Flag"),

    /**
     * \u76ee\u6807
     * 
     */
    @XmlEnumValue("Goal")
    GOAL("Goal"),

    /**
     * \u56fe\u5f62\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("GraphDefinition")
    GRAPH_DEFINITION("GraphDefinition"),

    /**
     * \u7fa4\u7ec4
     * 
     */
    @XmlEnumValue("Group")
    GROUP("Group"),

    /**
     * \u6307\u5bfc\u610f\u89c1\u54cd\u5e94
     * 
     */
    @XmlEnumValue("GuidanceResponse")
    GUIDANCE_RESPONSE("GuidanceResponse"),

    /**
     * \u533b\u7597\u4fdd\u5065\u670d\u52a1\u9879\u76ee
     * 
     */
    @XmlEnumValue("HealthcareService")
    HEALTHCARE_SERVICE("HealthcareService"),

    /**
     * \u6210\u50cf\u68c0\u67e5
     * 
     */
    @XmlEnumValue("ImagingStudy")
    IMAGING_STUDY("ImagingStudy"),

    /**
     * Inmunizaci\u00f3n
     * 
     */
    @XmlEnumValue("Immunization")
    IMMUNIZATION("Immunization"),

    /**
     * ImmunizationEvaluation
     * 
     */
    @XmlEnumValue("ImmunizationEvaluation")
    IMMUNIZATION_EVALUATION("ImmunizationEvaluation"),

    /**
     * Recomendaci\u00f3nInmunizaci\u00f3n /
     * 
     */
    @XmlEnumValue("ImmunizationRecommendation")
    IMMUNIZATION_RECOMMENDATION("ImmunizationRecommendation"),

    /**
     * \u5b9e\u65bd\u6307\u5357
     * 
     */
    @XmlEnumValue("ImplementationGuide")
    IMPLEMENTATION_GUIDE("ImplementationGuide"),

    /**
     * Ingredient
     * 
     */
    @XmlEnumValue("Ingredient")
    INGREDIENT("Ingredient"),

    /**
     * InsurancePlan
     * 
     */
    @XmlEnumValue("InsurancePlan")
    INSURANCE_PLAN("InsurancePlan"),

    /**
     * InventoryReport
     * 
     */
    @XmlEnumValue("InventoryReport")
    INVENTORY_REPORT("InventoryReport"),

    /**
     * Invoice
     * 
     */
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),

    /**
     * \u5e93
     * 
     */
    @XmlEnumValue("Library")
    LIBRARY("Library"),

    /**
     * \u94fe\u63a5\u5173\u7cfb
     * 
     */
    @XmlEnumValue("Linkage")
    LINKAGE("Linkage"),

    /**
     * Lista
     * 
     */
    @XmlEnumValue("List")
    LIST("List"),

    /**
     * Locacion
     * 
     */
    @XmlEnumValue("Location")
    LOCATION("Location"),

    /**
     * ManufacturedItemDefinition
     * 
     */
    @XmlEnumValue("ManufacturedItemDefinition")
    MANUFACTURED_ITEM_DEFINITION("ManufacturedItemDefinition"),

    /**
     * \u6307\u6807
     * 
     */
    @XmlEnumValue("Measure")
    MEASURE("Measure"),

    /**
     * \u6307\u6807\u62a5\u544a
     * 
     */
    @XmlEnumValue("MeasureReport")
    MEASURE_REPORT("MeasureReport"),

    /**
     * Medicaci\u00f3n /Medicamento
     * 
     */
    @XmlEnumValue("Medication")
    MEDICATION("Medication"),

    /**
     * Administraci\u00f3nMedicaci\u00f3n / AdministracionMedicamento
     * 
     */
    @XmlEnumValue("MedicationAdministration")
    MEDICATION_ADMINISTRATION("MedicationAdministration"),

    /**
     * Dispensaci\u00f3nMedicaci\u00f3n /DispensacionMedicamento
     * 
     */
    @XmlEnumValue("MedicationDispense")
    MEDICATION_DISPENSE("MedicationDispense"),

    /**
     * MedicationKnowledge
     * 
     */
    @XmlEnumValue("MedicationKnowledge")
    MEDICATION_KNOWLEDGE("MedicationKnowledge"),

    /**
     * Prescripci\u00f3nMedicaci\u00f3nTODO  /PrescripcionMedicamento
     * 
     */
    @XmlEnumValue("MedicationRequest")
    MEDICATION_REQUEST("MedicationRequest"),

    /**
     * MedicationUsage
     * 
     */
    @XmlEnumValue("MedicationUsage")
    MEDICATION_USAGE("MedicationUsage"),

    /**
     * MedicinalProductDefinition
     * 
     */
    @XmlEnumValue("MedicinalProductDefinition")
    MEDICINAL_PRODUCT_DEFINITION("MedicinalProductDefinition"),

    /**
     * \u6d88\u606f\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("MessageDefinition")
    MESSAGE_DEFINITION("MessageDefinition"),

    /**
     * CabeceraMensaje
     * 
     */
    @XmlEnumValue("MessageHeader")
    MESSAGE_HEADER("MessageHeader"),

    /**
     * \u5206\u5b50\u5e8f\u5217
     * 
     */
    @XmlEnumValue("MolecularSequence")
    MOLECULAR_SEQUENCE("MolecularSequence"),

    /**
     * \u547d\u540d\u7cfb\u7edf
     * 
     */
    @XmlEnumValue("NamingSystem")
    NAMING_SYSTEM("NamingSystem"),

    /**
     * NutritionIntake
     * 
     */
    @XmlEnumValue("NutritionIntake")
    NUTRITION_INTAKE("NutritionIntake"),

    /**
     * \u8425\u517b\u533b\u5631
     * 
     */
    @XmlEnumValue("NutritionOrder")
    NUTRITION_ORDER("NutritionOrder"),

    /**
     * ProductoNutricional
     * 
     */
    @XmlEnumValue("NutritionProduct")
    NUTRITION_PRODUCT("NutritionProduct"),

    /**
     * Observaci\u00f3n
     * 
     */
    @XmlEnumValue("Observation")
    OBSERVATION("Observation"),

    /**
     * \u89c2\u5bdf\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("ObservationDefinition")
    OBSERVATION_DEFINITION("ObservationDefinition"),

    /**
     * \u64cd\u4f5c\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("OperationDefinition")
    OPERATION_DEFINITION("OperationDefinition"),

    /**
     * ResultadoOperaci\u00f3n
     * 
     */
    @XmlEnumValue("OperationOutcome")
    OPERATION_OUTCOME("OperationOutcome"),

    /**
     * Organizaci\u00f3n
     * 
     */
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),

    /**
     * OrganizationAffiliation
     * 
     */
    @XmlEnumValue("OrganizationAffiliation")
    ORGANIZATION_AFFILIATION("OrganizationAffiliation"),

    /**
     * PackagedProductDefinition
     * 
     */
    @XmlEnumValue("PackagedProductDefinition")
    PACKAGED_PRODUCT_DEFINITION("PackagedProductDefinition"),

    /**
     * \u53c2\u6570
     * 
     */
    @XmlEnumValue("Parameters")
    PARAMETERS("Parameters"),

    /**
     * Paciente
     * 
     */
    @XmlEnumValue("Patient")
    PATIENT("Patient"),

    /**
     * \u4ed8\u6b3e\u901a\u77e5
     * 
     */
    @XmlEnumValue("PaymentNotice")
    PAYMENT_NOTICE("PaymentNotice"),

    /**
     * \u4ed8\u6b3e\u5bf9\u8d26
     * 
     */
    @XmlEnumValue("PaymentReconciliation")
    PAYMENT_RECONCILIATION("PaymentReconciliation"),

    /**
     * Permiso
     * 
     */
    @XmlEnumValue("Permission")
    PERMISSION("Permission"),

    /**
     * \u4eba\u5458
     * 
     */
    @XmlEnumValue("Person")
    PERSON("Person"),

    /**
     * \u8ba1\u5212\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("PlanDefinition")
    PLAN_DEFINITION("PlanDefinition"),

    /**
     * Practicante / Profesional
     * 
     */
    @XmlEnumValue("Practitioner")
    PRACTITIONER("Practitioner"),

    /**
     * \u6267\u4e1a\u4eba\u5458\u89d2\u8272
     * 
     */
    @XmlEnumValue("PractitionerRole")
    PRACTITIONER_ROLE("PractitionerRole"),

    /**
     * Procedimiento
     * 
     */
    @XmlEnumValue("Procedure")
    PROCEDURE("Procedure"),

    /**
     * Procedencia
     * 
     */
    @XmlEnumValue("Provenance")
    PROVENANCE("Provenance"),

    /**
     * Cuestionario
     * 
     */
    @XmlEnumValue("Questionnaire")
    QUESTIONNAIRE("Questionnaire"),

    /**
     * \u8c03\u67e5\u95ee\u5377\u7b54\u590d
     * 
     */
    @XmlEnumValue("QuestionnaireResponse")
    QUESTIONNAIRE_RESPONSE("QuestionnaireResponse"),

    /**
     * RegulatedAuthorization
     * 
     */
    @XmlEnumValue("RegulatedAuthorization")
    REGULATED_AUTHORIZATION("RegulatedAuthorization"),

    /**
     * \u76f8\u5173\u4eba\u5458
     * 
     */
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),

    /**
     * \u8bf7\u6c42\u5206\u7ec4
     * 
     */
    @XmlEnumValue("RequestGroup")
    REQUEST_GROUP("RequestGroup"),

    /**
     * \u8c03\u67e5\u7814\u7a76
     * 
     */
    @XmlEnumValue("ResearchStudy")
    RESEARCH_STUDY("ResearchStudy"),

    /**
     * \u7814\u7a76\u4e3b\u9898
     * 
     */
    @XmlEnumValue("ResearchSubject")
    RESEARCH_SUBJECT("ResearchSubject"),

    /**
     * \u8d44\u6e90
     * 
     */
    @XmlEnumValue("Resource")
    RESOURCE("Resource"),

    /**
     * \u98ce\u9669\u8bc4\u4f30
     * 
     */
    @XmlEnumValue("RiskAssessment")
    RISK_ASSESSMENT("RiskAssessment"),

    /**
     * \u65e5\u7a0b\u5b89\u6392
     * 
     */
    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),

    /**
     * \u641c\u7d22\u53c2\u6570
     * 
     */
    @XmlEnumValue("SearchParameter")
    SEARCH_PARAMETER("SearchParameter"),

    /**
     * \u670d\u52a1\u9879\u76ee\u8bf7\u6c42
     * 
     */
    @XmlEnumValue("ServiceRequest")
    SERVICE_REQUEST("ServiceRequest"),

    /**
     * Hueco / Zocalo / Espacio
     * 
     */
    @XmlEnumValue("Slot")
    SLOT("Slot"),

    /**
     * Especimen
     * 
     */
    @XmlEnumValue("Specimen")
    SPECIMEN("Specimen"),

    /**
     * \u6807\u672c\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("SpecimenDefinition")
    SPECIMEN_DEFINITION("SpecimenDefinition"),

    /**
     * \u7ed3\u6784\u5b9a\u4e49
     * 
     */
    @XmlEnumValue("StructureDefinition")
    STRUCTURE_DEFINITION("StructureDefinition"),

    /**
     * \u7ed3\u6784\u6620\u5c04
     * 
     */
    @XmlEnumValue("StructureMap")
    STRUCTURE_MAP("StructureMap"),

    /**
     * Suscripci\u00f3n
     * 
     */
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),

    /**
     * SubscriptionStatus
     * 
     */
    @XmlEnumValue("SubscriptionStatus")
    SUBSCRIPTION_STATUS("SubscriptionStatus"),

    /**
     * \u8bdd\u9898
     * 
     */
    @XmlEnumValue("SubscriptionTopic")
    SUBSCRIPTION_TOPIC("SubscriptionTopic"),

    /**
     * Sustancia
     * 
     */
    @XmlEnumValue("Substance")
    SUBSTANCE("Substance"),

    /**
     * SubstanceDefinition
     * 
     */
    @XmlEnumValue("SubstanceDefinition")
    SUBSTANCE_DEFINITION("SubstanceDefinition"),

    /**
     * SubstanceNucleicAcid
     * 
     */
    @XmlEnumValue("SubstanceNucleicAcid")
    SUBSTANCE_NUCLEIC_ACID("SubstanceNucleicAcid"),

    /**
     * SubstancePolymer
     * 
     */
    @XmlEnumValue("SubstancePolymer")
    SUBSTANCE_POLYMER("SubstancePolymer"),

    /**
     * SubstanceProtein
     * 
     */
    @XmlEnumValue("SubstanceProtein")
    SUBSTANCE_PROTEIN("SubstanceProtein"),

    /**
     * SubstanceReferenceInformation
     * 
     */
    @XmlEnumValue("SubstanceReferenceInformation")
    SUBSTANCE_REFERENCE_INFORMATION("SubstanceReferenceInformation"),

    /**
     * SubstanceSourceMaterial
     * 
     */
    @XmlEnumValue("SubstanceSourceMaterial")
    SUBSTANCE_SOURCE_MATERIAL("SubstanceSourceMaterial"),

    /**
     * Entrega de Suministro
     * 
     */
    @XmlEnumValue("SupplyDelivery")
    SUPPLY_DELIVERY("SupplyDelivery"),

    /**
     * Solicitud de Suministro
     * 
     */
    @XmlEnumValue("SupplyRequest")
    SUPPLY_REQUEST("SupplyRequest"),

    /**
     * \u4efb\u52a1
     * 
     */
    @XmlEnumValue("Task")
    TASK("Task"),

    /**
     * \u672f\u8bed\u670d\u52a1\u80fd\u529b
     * 
     */
    @XmlEnumValue("TerminologyCapabilities")
    TERMINOLOGY_CAPABILITIES("TerminologyCapabilities"),

    /**
     * \u6d4b\u8bd5\u62a5\u544a
     * 
     */
    @XmlEnumValue("TestReport")
    TEST_REPORT("TestReport"),

    /**
     * \u6d4b\u8bd5\u811a\u672c
     * 
     */
    @XmlEnumValue("TestScript")
    TEST_SCRIPT("TestScript"),

    /**
     * ConjuntoValores / ConjuntoDeValores
     * 
     */
    @XmlEnumValue("ValueSet")
    VALUE_SET("ValueSet"),

    /**
     * VerificationResult
     * 
     */
    @XmlEnumValue("VerificationResult")
    VERIFICATION_RESULT("VerificationResult"),

    /**
     * \u89c6\u529b\u5904\u65b9
     * 
     */
    @XmlEnumValue("VisionPrescription")
    VISION_PRESCRIPTION("VisionPrescription");
    private final java.lang.String value;

    ResourceTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResourceTypeList fromValue(java.lang.String v) {
        for (ResourceTypeList c: ResourceTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

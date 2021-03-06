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
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="udiCarrier" type="{http://hl7.org/fhir}Device.UdiCarrier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}FHIRDeviceStatus" minOccurs="0"/>
 *         &lt;element name="statusReason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distinctIdentifier" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="manufactureDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="deviceName" type="{http://hl7.org/fhir}Device.DeviceName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="partNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialization" type="{http://hl7.org/fhir}Device.Specialization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}Device.Version" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="property" type="{http://hl7.org/fhir}Device.Property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://hl7.org/fhir}Device.OperationalStatus" minOccurs="0"/>
 *         &lt;element name="associationStatus" type="{http://hl7.org/fhir}Device.AssociationStatus" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="safety" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "identifier",
    "displayName",
    "definition",
    "udiCarrier",
    "status",
    "statusReason",
    "distinctIdentifier",
    "manufacturer",
    "manufactureDate",
    "expirationDate",
    "lotNumber",
    "serialNumber",
    "deviceName",
    "modelNumber",
    "partNumber",
    "type",
    "specialization",
    "version",
    "property",
    "patient",
    "operationalStatus",
    "associationStatus",
    "owner",
    "contact",
    "location",
    "url",
    "note",
    "safety",
    "parent"
})
public class Device
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected String displayName;
    protected Reference definition;
    protected List<DeviceUdiCarrier> udiCarrier;
    protected FHIRDeviceStatus status;
    protected List<CodeableConcept> statusReason;
    protected String distinctIdentifier;
    protected String manufacturer;
    protected DateTime manufactureDate;
    protected DateTime expirationDate;
    protected String lotNumber;
    protected String serialNumber;
    protected List<DeviceDeviceName> deviceName;
    protected String modelNumber;
    protected String partNumber;
    protected List<CodeableConcept> type;
    protected List<DeviceSpecialization> specialization;
    protected List<DeviceVersion> version;
    protected List<DeviceProperty> property;
    protected Reference patient;
    protected DeviceOperationalStatus operationalStatus;
    protected DeviceAssociationStatus associationStatus;
    protected Reference owner;
    protected List<ContactPoint> contact;
    protected Reference location;
    protected Uri url;
    protected List<Annotation> note;
    protected List<CodeableConcept> safety;
    protected Reference parent;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDefinition(Reference value) {
        this.definition = value;
    }

    /**
     * Gets the value of the udiCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udiCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdiCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceUdiCarrier }
     * 
     * 
     */
    public List<DeviceUdiCarrier> getUdiCarrier() {
        if (udiCarrier == null) {
            udiCarrier = new ArrayList<DeviceUdiCarrier>();
        }
        return this.udiCarrier;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FHIRDeviceStatus }
     *     
     */
    public FHIRDeviceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHIRDeviceStatus }
     *     
     */
    public void setStatus(FHIRDeviceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getStatusReason() {
        if (statusReason == null) {
            statusReason = new ArrayList<CodeableConcept>();
        }
        return this.statusReason;
    }

    /**
     * Gets the value of the distinctIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinctIdentifier() {
        return distinctIdentifier;
    }

    /**
     * Sets the value of the distinctIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinctIdentifier(String value) {
        this.distinctIdentifier = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setManufactureDate(DateTime value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpirationDate(DateTime value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceDeviceName }
     * 
     * 
     */
    public List<DeviceDeviceName> getDeviceName() {
        if (deviceName == null) {
            deviceName = new ArrayList<DeviceDeviceName>();
        }
        return this.deviceName;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getType() {
        if (type == null) {
            type = new ArrayList<CodeableConcept>();
        }
        return this.type;
    }

    /**
     * Gets the value of the specialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceSpecialization }
     * 
     * 
     */
    public List<DeviceSpecialization> getSpecialization() {
        if (specialization == null) {
            specialization = new ArrayList<DeviceSpecialization>();
        }
        return this.specialization;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceVersion }
     * 
     * 
     */
    public List<DeviceVersion> getVersion() {
        if (version == null) {
            version = new ArrayList<DeviceVersion>();
        }
        return this.version;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceProperty }
     * 
     * 
     */
    public List<DeviceProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<DeviceProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperationalStatus }
     *     
     */
    public DeviceOperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperationalStatus }
     *     
     */
    public void setOperationalStatus(DeviceOperationalStatus value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the associationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAssociationStatus }
     *     
     */
    public DeviceAssociationStatus getAssociationStatus() {
        return associationStatus;
    }

    /**
     * Sets the value of the associationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAssociationStatus }
     *     
     */
    public void setAssociationStatus(DeviceAssociationStatus value) {
        this.associationStatus = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOwner(Reference value) {
        this.owner = value;
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
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPoint>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
        this.location = value;
    }

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
     * Gets the value of the safety property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safety property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafety().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSafety() {
        if (safety == null) {
            safety = new ArrayList<CodeableConcept>();
        }
        return this.safety;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParent(Reference value) {
        this.parent = value;
    }

}

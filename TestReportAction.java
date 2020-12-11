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
 * A summary of information based on the results of executing a TestScript.
 * 
 * <p>Java class for TestReport.Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestReport.Action">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}TestReport.Operation" minOccurs="0"/>
 *         &lt;element name="assert" type="{http://hl7.org/fhir}TestReport.Assert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestReport.Action", propOrder = {
    "operation",
    "_assert"
})
public class TestReportAction
    extends BackboneElement
{

    protected TestReportOperation operation;
    @XmlElement(name = "assert")
    protected TestReportAssert _assert;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportOperation }
     *     
     */
    public TestReportOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportOperation }
     *     
     */
    public void setOperation(TestReportOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the assert property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportAssert }
     *     
     */
    public TestReportAssert getAssert() {
        return _assert;
    }

    /**
     * Sets the value of the assert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportAssert }
     *     
     */
    public void setAssert(TestReportAssert value) {
        this._assert = value;
    }

}

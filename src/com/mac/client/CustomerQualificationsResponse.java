
package com.mac.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerQualificationsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerQualificationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qualification" type="{http://www.mac.com}qualification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerQualificationsResponse", propOrder = {
    "qualification"
})
public class CustomerQualificationsResponse {

    @XmlElement(name = "Qualification")
    protected Qualification qualification;

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link Qualification }
     *     
     */
    public Qualification getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualification }
     *     
     */
    public void setQualification(Qualification value) {
        this.qualification = value;
    }

}

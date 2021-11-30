//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Service Profile Information for group service.
 *         It is identical to the ServiceInstanceAddProfile, but without
 *         the password.
 *         Prior to release 17 this was called
 *         ServiceInstanceReadProfile.
 *       
 * 
 * <p>Java class for ServiceInstanceReadProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceReadProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://schema.broadsoft.com/xsi}ServiceInstanceProfileName"/&gt;
 *         &lt;element name="callingLineIdLastName" type="{http://schema.broadsoft.com/xsi}CallingLineIdLastName"/&gt;
 *         &lt;element name="callingLineIdFirstName" type="{http://schema.broadsoft.com/xsi}CallingLineIdFirstName"/&gt;
 *         &lt;element name="hiraganaLastName" type="{http://schema.broadsoft.com/xsi}HiraganaLastName" minOccurs="0"/&gt;
 *         &lt;element name="hiraganaFirstName" type="{http://schema.broadsoft.com/xsi}HiraganaFirstName" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{http://schema.broadsoft.com/xsi}DepartmentKey" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://schema.broadsoft.com/xsi}Language" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://schema.broadsoft.com/xsi}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="timeZoneDisplayName" type="{http://schema.broadsoft.com/xsi}TimeZoneDisplayName" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://schema.broadsoft.com/xsi}SIPURI" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="publicUserIdentity" type="{http://schema.broadsoft.com/xsi}SIPURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceReadProfile", propOrder = {
    "name",
    "callingLineIdLastName",
    "callingLineIdFirstName",
    "hiraganaLastName",
    "hiraganaFirstName",
    "phoneNumber",
    "extension",
    "department",
    "language",
    "timeZone",
    "timeZoneDisplayName",
    "alias",
    "publicUserIdentity"
})
public class ServiceInstanceReadProfile {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdLastName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdFirstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hiraganaLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hiraganaFirstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String phoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extension;
    protected DepartmentKey department;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String language;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZone;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneDisplayName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> alias;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String publicUserIdentity;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the callingLineIdLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdLastName() {
        return callingLineIdLastName;
    }

    /**
     * Sets the value of the callingLineIdLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdLastName(String value) {
        this.callingLineIdLastName = value;
    }

    /**
     * Gets the value of the callingLineIdFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdFirstName() {
        return callingLineIdFirstName;
    }

    /**
     * Sets the value of the callingLineIdFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdFirstName(String value) {
        this.callingLineIdFirstName = value;
    }

    /**
     * Gets the value of the hiraganaLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiraganaLastName() {
        return hiraganaLastName;
    }

    /**
     * Sets the value of the hiraganaLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiraganaLastName(String value) {
        this.hiraganaLastName = value;
    }

    /**
     * Gets the value of the hiraganaFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiraganaFirstName() {
        return hiraganaFirstName;
    }

    /**
     * Sets the value of the hiraganaFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiraganaFirstName(String value) {
        this.hiraganaFirstName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentKey }
     *     
     */
    public DepartmentKey getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentKey }
     *     
     */
    public void setDepartment(DepartmentKey value) {
        this.department = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDisplayName() {
        return timeZoneDisplayName;
    }

    /**
     * Sets the value of the timeZoneDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDisplayName(String value) {
        this.timeZoneDisplayName = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlias() {
        if (alias == null) {
            alias = new ArrayList<String>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the publicUserIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUserIdentity() {
        return publicUserIdentity;
    }

    /**
     * Sets the value of the publicUserIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUserIdentity(String value) {
        this.publicUserIdentity = value;
    }

}
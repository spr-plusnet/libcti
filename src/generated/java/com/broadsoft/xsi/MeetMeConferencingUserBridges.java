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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the list of bridges for a given user.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java class for MeetMeConferencingUserBridges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingUserBridges"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userBridge" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingUserBridge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingUserBridges", propOrder = {
    "userBridge"
})
public class MeetMeConferencingUserBridges {

    protected List<MeetMeConferencingUserBridge> userBridge;

    /**
     * Gets the value of the userBridge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userBridge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserBridge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetMeConferencingUserBridge }
     * 
     * 
     */
    public List<MeetMeConferencingUserBridge> getUserBridge() {
        if (userBridge == null) {
            userBridge = new ArrayList<MeetMeConferencingUserBridge>();
        }
        return this.userBridge;
    }

}
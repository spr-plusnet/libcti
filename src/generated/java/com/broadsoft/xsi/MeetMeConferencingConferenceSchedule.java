//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         MeetMe Conference Schedule types. There are 3 types possible
 *         1. Reservationless
 *         2. One time 
 *         3. Recurring
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java class for MeetMeConferencingConferenceSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingConferenceSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="scheduleReservationless"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="scheduleOneTime"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="scheduleRecurring"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
 *                     &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingConferenceSchedule", propOrder = {
    "scheduleReservationless",
    "scheduleOneTime",
    "scheduleRecurring"
})
public class MeetMeConferencingConferenceSchedule {

    protected MeetMeConferencingConferenceSchedule.ScheduleReservationless scheduleReservationless;
    protected MeetMeConferencingConferenceSchedule.ScheduleOneTime scheduleOneTime;
    protected MeetMeConferencingConferenceSchedule.ScheduleRecurring scheduleRecurring;

    /**
     * Gets the value of the scheduleReservationless property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleReservationless }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleReservationless getScheduleReservationless() {
        return scheduleReservationless;
    }

    /**
     * Sets the value of the scheduleReservationless property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleReservationless }
     *     
     */
    public void setScheduleReservationless(MeetMeConferencingConferenceSchedule.ScheduleReservationless value) {
        this.scheduleReservationless = value;
    }

    /**
     * Gets the value of the scheduleOneTime property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleOneTime }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleOneTime getScheduleOneTime() {
        return scheduleOneTime;
    }

    /**
     * Sets the value of the scheduleOneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleOneTime }
     *     
     */
    public void setScheduleOneTime(MeetMeConferencingConferenceSchedule.ScheduleOneTime value) {
        this.scheduleOneTime = value;
    }

    /**
     * Gets the value of the scheduleRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleRecurring }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleRecurring getScheduleRecurring() {
        return scheduleRecurring;
    }

    /**
     * Sets the value of the scheduleRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleRecurring }
     *     
     */
    public void setScheduleRecurring(MeetMeConferencingConferenceSchedule.ScheduleRecurring value) {
        this.scheduleRecurring = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "duration"
    })
    public static class ScheduleOneTime {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true)
        protected MeetMeConferencingConferenceDuration duration;

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public MeetMeConferencingConferenceDuration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public void setDuration(MeetMeConferencingConferenceDuration value) {
            this.duration = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
     *         &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "duration",
        "recurrence"
    })
    public static class ScheduleRecurring {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true)
        protected MeetMeConferencingConferenceDuration duration;
        @XmlElement(required = true)
        protected Recurrence recurrence;

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public MeetMeConferencingConferenceDuration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public void setDuration(MeetMeConferencingConferenceDuration value) {
            this.duration = value;
        }

        /**
         * Gets the value of the recurrence property.
         * 
         * @return
         *     possible object is
         *     {@link Recurrence }
         *     
         */
        public Recurrence getRecurrence() {
            return recurrence;
        }

        /**
         * Sets the value of the recurrence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Recurrence }
         *     
         */
        public void setRecurrence(Recurrence value) {
            this.recurrence = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "endTime"
    })
    public static class ScheduleReservationless {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endTime;

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
        }

    }

}

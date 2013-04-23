/**
 * ParticipantBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class ParticipantBean  implements java.io.Serializable {
    private java.util.Calendar endDate;

    private long eventId;

    private java.lang.String eventType;

    private long personId;

    private java.lang.String personType;

    private java.util.Calendar startDate;

    public ParticipantBean() {
    }

    public ParticipantBean(
           java.util.Calendar endDate,
           long eventId,
           java.lang.String eventType,
           long personId,
           java.lang.String personType,
           java.util.Calendar startDate) {
           this.endDate = endDate;
           this.eventId = eventId;
           this.eventType = eventType;
           this.personId = personId;
           this.personType = personType;
           this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ParticipantBean.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ParticipantBean.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the eventId value for this ParticipantBean.
     * 
     * @return eventId
     */
    public long getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this ParticipantBean.
     * 
     * @param eventId
     */
    public void setEventId(long eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventType value for this ParticipantBean.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this ParticipantBean.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the personId value for this ParticipantBean.
     * 
     * @return personId
     */
    public long getPersonId() {
        return personId;
    }


    /**
     * Sets the personId value for this ParticipantBean.
     * 
     * @param personId
     */
    public void setPersonId(long personId) {
        this.personId = personId;
    }


    /**
     * Gets the personType value for this ParticipantBean.
     * 
     * @return personType
     */
    public java.lang.String getPersonType() {
        return personType;
    }


    /**
     * Sets the personType value for this ParticipantBean.
     * 
     * @param personType
     */
    public void setPersonType(java.lang.String personType) {
        this.personType = personType;
    }


    /**
     * Gets the startDate value for this ParticipantBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ParticipantBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParticipantBean)) return false;
        ParticipantBean other = (ParticipantBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.eventId == other.getEventId() &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            this.personId == other.getPersonId() &&
            ((this.personType==null && other.getPersonType()==null) || 
             (this.personType!=null &&
              this.personType.equals(other.getPersonType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += new Long(getEventId()).hashCode();
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        _hashCode += new Long(getPersonId()).hashCode();
        if (getPersonType() != null) {
            _hashCode += getPersonType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParticipantBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "ParticipantBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * LocationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class LocationBean  extends com.geocent.taleo.webapi.AddressEntityBean  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private java.lang.String directions;

    private long locationId;

    private java.lang.String locationName;

    private long regionId;

    private java.lang.String timeZone;

    private java.lang.String[] interviewRooms;

    private long[] defaultApprovers;

    public LocationBean() {
    }

    public LocationBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           java.lang.String city,
           java.lang.String address,
           java.lang.String zipCode,
           java.lang.String state,
           java.lang.String country,
           java.lang.String phone,
           java.util.HashMap additionalProperties,
           java.lang.String directions,
           long locationId,
           java.lang.String locationName,
           long regionId,
           java.lang.String timeZone,
           java.lang.String[] interviewRooms,
           long[] defaultApprovers) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status,
            city,
            address,
            zipCode,
            state,
            country,
            phone);
        this.additionalProperties = additionalProperties;
        this.directions = directions;
        this.locationId = locationId;
        this.locationName = locationName;
        this.regionId = regionId;
        this.timeZone = timeZone;
        this.interviewRooms = interviewRooms;
        this.defaultApprovers = defaultApprovers;
    }


    /**
     * Gets the additionalProperties value for this LocationBean.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this LocationBean.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the directions value for this LocationBean.
     * 
     * @return directions
     */
    public java.lang.String getDirections() {
        return directions;
    }


    /**
     * Sets the directions value for this LocationBean.
     * 
     * @param directions
     */
    public void setDirections(java.lang.String directions) {
        this.directions = directions;
    }


    /**
     * Gets the locationId value for this LocationBean.
     * 
     * @return locationId
     */
    public long getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this LocationBean.
     * 
     * @param locationId
     */
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the locationName value for this LocationBean.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this LocationBean.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the regionId value for this LocationBean.
     * 
     * @return regionId
     */
    public long getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this LocationBean.
     * 
     * @param regionId
     */
    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the timeZone value for this LocationBean.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this LocationBean.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the interviewRooms value for this LocationBean.
     * 
     * @return interviewRooms
     */
    public java.lang.String[] getInterviewRooms() {
        return interviewRooms;
    }


    /**
     * Sets the interviewRooms value for this LocationBean.
     * 
     * @param interviewRooms
     */
    public void setInterviewRooms(java.lang.String[] interviewRooms) {
        this.interviewRooms = interviewRooms;
    }


    /**
     * Gets the defaultApprovers value for this LocationBean.
     * 
     * @return defaultApprovers
     */
    public long[] getDefaultApprovers() {
        return defaultApprovers;
    }


    /**
     * Sets the defaultApprovers value for this LocationBean.
     * 
     * @param defaultApprovers
     */
    public void setDefaultApprovers(long[] defaultApprovers) {
        this.defaultApprovers = defaultApprovers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationBean)) return false;
        LocationBean other = (LocationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalProperties==null && other.getAdditionalProperties()==null) || 
             (this.additionalProperties!=null &&
              this.additionalProperties.equals(other.getAdditionalProperties()))) &&
            ((this.directions==null && other.getDirections()==null) || 
             (this.directions!=null &&
              this.directions.equals(other.getDirections()))) &&
            this.locationId == other.getLocationId() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            this.regionId == other.getRegionId() &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.interviewRooms==null && other.getInterviewRooms()==null) || 
             (this.interviewRooms!=null &&
              java.util.Arrays.equals(this.interviewRooms, other.getInterviewRooms()))) &&
            ((this.defaultApprovers==null && other.getDefaultApprovers()==null) || 
             (this.defaultApprovers!=null &&
              java.util.Arrays.equals(this.defaultApprovers, other.getDefaultApprovers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdditionalProperties() != null) {
            _hashCode += getAdditionalProperties().hashCode();
        }
        if (getDirections() != null) {
            _hashCode += getDirections().hashCode();
        }
        _hashCode += new Long(getLocationId()).hashCode();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        _hashCode += new Long(getRegionId()).hashCode();
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getInterviewRooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterviewRooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterviewRooms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultApprovers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultApprovers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultApprovers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "LocationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interviewRooms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interviewRooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultApprovers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultApprovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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

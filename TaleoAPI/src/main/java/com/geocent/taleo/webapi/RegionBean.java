/**
 * RegionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class RegionBean  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private java.util.Calendar creationDate;

    private java.util.Calendar lastUpdated;

    private long regionId;

    private java.lang.String regionName;

    private java.lang.String[] associatedLocations;

    private long[] associatedUsers;

    private long[] defaultApprovers;

    public RegionBean() {
    }

    public RegionBean(
           java.util.HashMap additionalProperties,
           java.util.Calendar creationDate,
           java.util.Calendar lastUpdated,
           long regionId,
           java.lang.String regionName,
           java.lang.String[] associatedLocations,
           long[] associatedUsers,
           long[] defaultApprovers) {
           this.additionalProperties = additionalProperties;
           this.creationDate = creationDate;
           this.lastUpdated = lastUpdated;
           this.regionId = regionId;
           this.regionName = regionName;
           this.associatedLocations = associatedLocations;
           this.associatedUsers = associatedUsers;
           this.defaultApprovers = defaultApprovers;
    }


    /**
     * Gets the additionalProperties value for this RegionBean.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this RegionBean.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the creationDate value for this RegionBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RegionBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastUpdated value for this RegionBean.
     * 
     * @return lastUpdated
     */
    public java.util.Calendar getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this RegionBean.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.util.Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the regionId value for this RegionBean.
     * 
     * @return regionId
     */
    public long getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this RegionBean.
     * 
     * @param regionId
     */
    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the regionName value for this RegionBean.
     * 
     * @return regionName
     */
    public java.lang.String getRegionName() {
        return regionName;
    }


    /**
     * Sets the regionName value for this RegionBean.
     * 
     * @param regionName
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }


    /**
     * Gets the associatedLocations value for this RegionBean.
     * 
     * @return associatedLocations
     */
    public java.lang.String[] getAssociatedLocations() {
        return associatedLocations;
    }


    /**
     * Sets the associatedLocations value for this RegionBean.
     * 
     * @param associatedLocations
     */
    public void setAssociatedLocations(java.lang.String[] associatedLocations) {
        this.associatedLocations = associatedLocations;
    }


    /**
     * Gets the associatedUsers value for this RegionBean.
     * 
     * @return associatedUsers
     */
    public long[] getAssociatedUsers() {
        return associatedUsers;
    }


    /**
     * Sets the associatedUsers value for this RegionBean.
     * 
     * @param associatedUsers
     */
    public void setAssociatedUsers(long[] associatedUsers) {
        this.associatedUsers = associatedUsers;
    }


    /**
     * Gets the defaultApprovers value for this RegionBean.
     * 
     * @return defaultApprovers
     */
    public long[] getDefaultApprovers() {
        return defaultApprovers;
    }


    /**
     * Sets the defaultApprovers value for this RegionBean.
     * 
     * @param defaultApprovers
     */
    public void setDefaultApprovers(long[] defaultApprovers) {
        this.defaultApprovers = defaultApprovers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionBean)) return false;
        RegionBean other = (RegionBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalProperties==null && other.getAdditionalProperties()==null) || 
             (this.additionalProperties!=null &&
              this.additionalProperties.equals(other.getAdditionalProperties()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            this.regionId == other.getRegionId() &&
            ((this.regionName==null && other.getRegionName()==null) || 
             (this.regionName!=null &&
              this.regionName.equals(other.getRegionName()))) &&
            ((this.associatedLocations==null && other.getAssociatedLocations()==null) || 
             (this.associatedLocations!=null &&
              java.util.Arrays.equals(this.associatedLocations, other.getAssociatedLocations()))) &&
            ((this.associatedUsers==null && other.getAssociatedUsers()==null) || 
             (this.associatedUsers!=null &&
              java.util.Arrays.equals(this.associatedUsers, other.getAssociatedUsers()))) &&
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
        int _hashCode = 1;
        if (getAdditionalProperties() != null) {
            _hashCode += getAdditionalProperties().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        _hashCode += new Long(getRegionId()).hashCode();
        if (getRegionName() != null) {
            _hashCode += getRegionName().hashCode();
        }
        if (getAssociatedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociatedUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedUsers(), i);
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
        new org.apache.axis.description.TypeDesc(RegionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "RegionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associatedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associatedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

/**
 * DepartmentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class DepartmentBean  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private java.util.Calendar creationDate;

    private long departmentId;

    private java.lang.String departmentName;

    private java.util.Calendar lastUpdated;

    private long[] associatedUsers;

    private long[] defaultApprovers;

    public DepartmentBean() {
    }

    public DepartmentBean(
           java.util.HashMap additionalProperties,
           java.util.Calendar creationDate,
           long departmentId,
           java.lang.String departmentName,
           java.util.Calendar lastUpdated,
           long[] associatedUsers,
           long[] defaultApprovers) {
           this.additionalProperties = additionalProperties;
           this.creationDate = creationDate;
           this.departmentId = departmentId;
           this.departmentName = departmentName;
           this.lastUpdated = lastUpdated;
           this.associatedUsers = associatedUsers;
           this.defaultApprovers = defaultApprovers;
    }


    /**
     * Gets the additionalProperties value for this DepartmentBean.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this DepartmentBean.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the creationDate value for this DepartmentBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this DepartmentBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the departmentId value for this DepartmentBean.
     * 
     * @return departmentId
     */
    public long getDepartmentId() {
        return departmentId;
    }


    /**
     * Sets the departmentId value for this DepartmentBean.
     * 
     * @param departmentId
     */
    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }


    /**
     * Gets the departmentName value for this DepartmentBean.
     * 
     * @return departmentName
     */
    public java.lang.String getDepartmentName() {
        return departmentName;
    }


    /**
     * Sets the departmentName value for this DepartmentBean.
     * 
     * @param departmentName
     */
    public void setDepartmentName(java.lang.String departmentName) {
        this.departmentName = departmentName;
    }


    /**
     * Gets the lastUpdated value for this DepartmentBean.
     * 
     * @return lastUpdated
     */
    public java.util.Calendar getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this DepartmentBean.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.util.Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the associatedUsers value for this DepartmentBean.
     * 
     * @return associatedUsers
     */
    public long[] getAssociatedUsers() {
        return associatedUsers;
    }


    /**
     * Sets the associatedUsers value for this DepartmentBean.
     * 
     * @param associatedUsers
     */
    public void setAssociatedUsers(long[] associatedUsers) {
        this.associatedUsers = associatedUsers;
    }


    /**
     * Gets the defaultApprovers value for this DepartmentBean.
     * 
     * @return defaultApprovers
     */
    public long[] getDefaultApprovers() {
        return defaultApprovers;
    }


    /**
     * Sets the defaultApprovers value for this DepartmentBean.
     * 
     * @param defaultApprovers
     */
    public void setDefaultApprovers(long[] defaultApprovers) {
        this.defaultApprovers = defaultApprovers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepartmentBean)) return false;
        DepartmentBean other = (DepartmentBean) obj;
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
            this.departmentId == other.getDepartmentId() &&
            ((this.departmentName==null && other.getDepartmentName()==null) || 
             (this.departmentName!=null &&
              this.departmentName.equals(other.getDepartmentName()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
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
        _hashCode += new Long(getDepartmentId()).hashCode();
        if (getDepartmentName() != null) {
            _hashCode += getDepartmentName().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
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
        new org.apache.axis.description.TypeDesc(DepartmentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "DepartmentBean"));
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
        elemField.setFieldName("departmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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

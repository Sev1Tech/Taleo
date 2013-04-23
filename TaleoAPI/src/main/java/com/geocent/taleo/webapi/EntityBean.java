/**
 * EntityBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class EntityBean  implements java.io.Serializable {
    private java.util.Calendar creationDate;

    private com.geocent.taleo.webapi.FlexFieldBean[] flexValues;

    private long id;

    private java.util.Calendar lastUpdated;

    private java.lang.String status;

    public EntityBean() {
    }

    public EntityBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status) {
           this.creationDate = creationDate;
           this.flexValues = flexValues;
           this.id = id;
           this.lastUpdated = lastUpdated;
           this.status = status;
    }


    /**
     * Gets the creationDate value for this EntityBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this EntityBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the flexValues value for this EntityBean.
     * 
     * @return flexValues
     */
    public com.geocent.taleo.webapi.FlexFieldBean[] getFlexValues() {
        return flexValues;
    }


    /**
     * Sets the flexValues value for this EntityBean.
     * 
     * @param flexValues
     */
    public void setFlexValues(com.geocent.taleo.webapi.FlexFieldBean[] flexValues) {
        this.flexValues = flexValues;
    }


    /**
     * Gets the id value for this EntityBean.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this EntityBean.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the lastUpdated value for this EntityBean.
     * 
     * @return lastUpdated
     */
    public java.util.Calendar getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this EntityBean.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.util.Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the status value for this EntityBean.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EntityBean.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityBean)) return false;
        EntityBean other = (EntityBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.flexValues==null && other.getFlexValues()==null) || 
             (this.flexValues!=null &&
              java.util.Arrays.equals(this.flexValues, other.getFlexValues()))) &&
            this.id == other.getId() &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getFlexValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlexValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlexValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getId()).hashCode();
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "EntityBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flexValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "FlexFieldBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

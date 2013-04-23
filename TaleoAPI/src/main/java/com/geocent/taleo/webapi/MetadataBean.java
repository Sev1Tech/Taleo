/**
 * MetadataBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class MetadataBean  implements java.io.Serializable {
    private java.lang.String displayName;

    private java.lang.String integrationName;

    private boolean isCustom;

    private boolean isReadOnly;

    private boolean isRequired;

    private java.lang.String type;

    public MetadataBean() {
    }

    public MetadataBean(
           java.lang.String displayName,
           java.lang.String integrationName,
           boolean isCustom,
           boolean isReadOnly,
           boolean isRequired,
           java.lang.String type) {
           this.displayName = displayName;
           this.integrationName = integrationName;
           this.isCustom = isCustom;
           this.isReadOnly = isReadOnly;
           this.isRequired = isRequired;
           this.type = type;
    }


    /**
     * Gets the displayName value for this MetadataBean.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this MetadataBean.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the integrationName value for this MetadataBean.
     * 
     * @return integrationName
     */
    public java.lang.String getIntegrationName() {
        return integrationName;
    }


    /**
     * Sets the integrationName value for this MetadataBean.
     * 
     * @param integrationName
     */
    public void setIntegrationName(java.lang.String integrationName) {
        this.integrationName = integrationName;
    }


    /**
     * Gets the isCustom value for this MetadataBean.
     * 
     * @return isCustom
     */
    public boolean isIsCustom() {
        return isCustom;
    }


    /**
     * Sets the isCustom value for this MetadataBean.
     * 
     * @param isCustom
     */
    public void setIsCustom(boolean isCustom) {
        this.isCustom = isCustom;
    }


    /**
     * Gets the isReadOnly value for this MetadataBean.
     * 
     * @return isReadOnly
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }


    /**
     * Sets the isReadOnly value for this MetadataBean.
     * 
     * @param isReadOnly
     */
    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }


    /**
     * Gets the isRequired value for this MetadataBean.
     * 
     * @return isRequired
     */
    public boolean isIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this MetadataBean.
     * 
     * @param isRequired
     */
    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the type value for this MetadataBean.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MetadataBean.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetadataBean)) return false;
        MetadataBean other = (MetadataBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.integrationName==null && other.getIntegrationName()==null) || 
             (this.integrationName!=null &&
              this.integrationName.equals(other.getIntegrationName()))) &&
            this.isCustom == other.isIsCustom() &&
            this.isReadOnly == other.isIsReadOnly() &&
            this.isRequired == other.isIsRequired() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getIntegrationName() != null) {
            _hashCode += getIntegrationName().hashCode();
        }
        _hashCode += (isIsCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetadataBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "MetadataBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "integrationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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

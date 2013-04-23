/**
 * FlexFieldBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class FlexFieldBean  implements java.io.Serializable {
    private java.lang.String fieldName;

    private java.lang.Boolean valueBool;

    private java.util.Calendar valueDate;

    private java.lang.Double valueDbl;

    private java.lang.Integer valueInt;

    private java.lang.Long valueLong;

    private java.lang.String valueStr;

    public FlexFieldBean() {
    }

    public FlexFieldBean(
           java.lang.String fieldName,
           java.lang.Boolean valueBool,
           java.util.Calendar valueDate,
           java.lang.Double valueDbl,
           java.lang.Integer valueInt,
           java.lang.Long valueLong,
           java.lang.String valueStr) {
           this.fieldName = fieldName;
           this.valueBool = valueBool;
           this.valueDate = valueDate;
           this.valueDbl = valueDbl;
           this.valueInt = valueInt;
           this.valueLong = valueLong;
           this.valueStr = valueStr;
    }


    /**
     * Gets the fieldName value for this FlexFieldBean.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this FlexFieldBean.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the valueBool value for this FlexFieldBean.
     * 
     * @return valueBool
     */
    public java.lang.Boolean getValueBool() {
        return valueBool;
    }


    /**
     * Sets the valueBool value for this FlexFieldBean.
     * 
     * @param valueBool
     */
    public void setValueBool(java.lang.Boolean valueBool) {
        this.valueBool = valueBool;
    }


    /**
     * Gets the valueDate value for this FlexFieldBean.
     * 
     * @return valueDate
     */
    public java.util.Calendar getValueDate() {
        return valueDate;
    }


    /**
     * Sets the valueDate value for this FlexFieldBean.
     * 
     * @param valueDate
     */
    public void setValueDate(java.util.Calendar valueDate) {
        this.valueDate = valueDate;
    }


    /**
     * Gets the valueDbl value for this FlexFieldBean.
     * 
     * @return valueDbl
     */
    public java.lang.Double getValueDbl() {
        return valueDbl;
    }


    /**
     * Sets the valueDbl value for this FlexFieldBean.
     * 
     * @param valueDbl
     */
    public void setValueDbl(java.lang.Double valueDbl) {
        this.valueDbl = valueDbl;
    }


    /**
     * Gets the valueInt value for this FlexFieldBean.
     * 
     * @return valueInt
     */
    public java.lang.Integer getValueInt() {
        return valueInt;
    }


    /**
     * Sets the valueInt value for this FlexFieldBean.
     * 
     * @param valueInt
     */
    public void setValueInt(java.lang.Integer valueInt) {
        this.valueInt = valueInt;
    }


    /**
     * Gets the valueLong value for this FlexFieldBean.
     * 
     * @return valueLong
     */
    public java.lang.Long getValueLong() {
        return valueLong;
    }


    /**
     * Sets the valueLong value for this FlexFieldBean.
     * 
     * @param valueLong
     */
    public void setValueLong(java.lang.Long valueLong) {
        this.valueLong = valueLong;
    }


    /**
     * Gets the valueStr value for this FlexFieldBean.
     * 
     * @return valueStr
     */
    public java.lang.String getValueStr() {
        return valueStr;
    }


    /**
     * Sets the valueStr value for this FlexFieldBean.
     * 
     * @param valueStr
     */
    public void setValueStr(java.lang.String valueStr) {
        this.valueStr = valueStr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexFieldBean)) return false;
        FlexFieldBean other = (FlexFieldBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.valueBool==null && other.getValueBool()==null) || 
             (this.valueBool!=null &&
              this.valueBool.equals(other.getValueBool()))) &&
            ((this.valueDate==null && other.getValueDate()==null) || 
             (this.valueDate!=null &&
              this.valueDate.equals(other.getValueDate()))) &&
            ((this.valueDbl==null && other.getValueDbl()==null) || 
             (this.valueDbl!=null &&
              this.valueDbl.equals(other.getValueDbl()))) &&
            ((this.valueInt==null && other.getValueInt()==null) || 
             (this.valueInt!=null &&
              this.valueInt.equals(other.getValueInt()))) &&
            ((this.valueLong==null && other.getValueLong()==null) || 
             (this.valueLong!=null &&
              this.valueLong.equals(other.getValueLong()))) &&
            ((this.valueStr==null && other.getValueStr()==null) || 
             (this.valueStr!=null &&
              this.valueStr.equals(other.getValueStr())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getValueBool() != null) {
            _hashCode += getValueBool().hashCode();
        }
        if (getValueDate() != null) {
            _hashCode += getValueDate().hashCode();
        }
        if (getValueDbl() != null) {
            _hashCode += getValueDbl().hashCode();
        }
        if (getValueInt() != null) {
            _hashCode += getValueInt().hashCode();
        }
        if (getValueLong() != null) {
            _hashCode += getValueLong().hashCode();
        }
        if (getValueStr() != null) {
            _hashCode += getValueStr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexFieldBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "FlexFieldBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueBool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueBool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDbl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDbl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueLong");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueStr"));
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

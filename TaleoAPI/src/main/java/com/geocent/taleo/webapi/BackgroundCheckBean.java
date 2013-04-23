/**
 * BackgroundCheckBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class BackgroundCheckBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private long candidateId;

    private java.lang.String checkerEmail;

    private java.lang.String checkerName;

    private java.lang.String checkerPhone;

    private java.lang.String comments;

    private java.lang.String creator;

    public BackgroundCheckBean() {
    }

    public BackgroundCheckBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           long candidateId,
           java.lang.String checkerEmail,
           java.lang.String checkerName,
           java.lang.String checkerPhone,
           java.lang.String comments,
           java.lang.String creator) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.candidateId = candidateId;
        this.checkerEmail = checkerEmail;
        this.checkerName = checkerName;
        this.checkerPhone = checkerPhone;
        this.comments = comments;
        this.creator = creator;
    }


    /**
     * Gets the candidateId value for this BackgroundCheckBean.
     * 
     * @return candidateId
     */
    public long getCandidateId() {
        return candidateId;
    }


    /**
     * Sets the candidateId value for this BackgroundCheckBean.
     * 
     * @param candidateId
     */
    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }


    /**
     * Gets the checkerEmail value for this BackgroundCheckBean.
     * 
     * @return checkerEmail
     */
    public java.lang.String getCheckerEmail() {
        return checkerEmail;
    }


    /**
     * Sets the checkerEmail value for this BackgroundCheckBean.
     * 
     * @param checkerEmail
     */
    public void setCheckerEmail(java.lang.String checkerEmail) {
        this.checkerEmail = checkerEmail;
    }


    /**
     * Gets the checkerName value for this BackgroundCheckBean.
     * 
     * @return checkerName
     */
    public java.lang.String getCheckerName() {
        return checkerName;
    }


    /**
     * Sets the checkerName value for this BackgroundCheckBean.
     * 
     * @param checkerName
     */
    public void setCheckerName(java.lang.String checkerName) {
        this.checkerName = checkerName;
    }


    /**
     * Gets the checkerPhone value for this BackgroundCheckBean.
     * 
     * @return checkerPhone
     */
    public java.lang.String getCheckerPhone() {
        return checkerPhone;
    }


    /**
     * Sets the checkerPhone value for this BackgroundCheckBean.
     * 
     * @param checkerPhone
     */
    public void setCheckerPhone(java.lang.String checkerPhone) {
        this.checkerPhone = checkerPhone;
    }


    /**
     * Gets the comments value for this BackgroundCheckBean.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this BackgroundCheckBean.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the creator value for this BackgroundCheckBean.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this BackgroundCheckBean.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BackgroundCheckBean)) return false;
        BackgroundCheckBean other = (BackgroundCheckBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.candidateId == other.getCandidateId() &&
            ((this.checkerEmail==null && other.getCheckerEmail()==null) || 
             (this.checkerEmail!=null &&
              this.checkerEmail.equals(other.getCheckerEmail()))) &&
            ((this.checkerName==null && other.getCheckerName()==null) || 
             (this.checkerName!=null &&
              this.checkerName.equals(other.getCheckerName()))) &&
            ((this.checkerPhone==null && other.getCheckerPhone()==null) || 
             (this.checkerPhone!=null &&
              this.checkerPhone.equals(other.getCheckerPhone()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator())));
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
        _hashCode += new Long(getCandidateId()).hashCode();
        if (getCheckerEmail() != null) {
            _hashCode += getCheckerEmail().hashCode();
        }
        if (getCheckerName() != null) {
            _hashCode += getCheckerName().hashCode();
        }
        if (getCheckerPhone() != null) {
            _hashCode += getCheckerPhone().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BackgroundCheckBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "BackgroundCheckBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
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

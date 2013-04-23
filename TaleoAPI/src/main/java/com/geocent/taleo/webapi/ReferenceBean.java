/**
 * ReferenceBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class ReferenceBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private long candidateId;

    private java.lang.String comments;

    private java.lang.String creator;

    private java.lang.String employer;

    private java.lang.String refEmail;

    private java.lang.String refName;

    private java.lang.String refPhone;

    private java.lang.String refTitle;

    private java.lang.String relToCandidate;

    public ReferenceBean() {
    }

    public ReferenceBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           long candidateId,
           java.lang.String comments,
           java.lang.String creator,
           java.lang.String employer,
           java.lang.String refEmail,
           java.lang.String refName,
           java.lang.String refPhone,
           java.lang.String refTitle,
           java.lang.String relToCandidate) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.candidateId = candidateId;
        this.comments = comments;
        this.creator = creator;
        this.employer = employer;
        this.refEmail = refEmail;
        this.refName = refName;
        this.refPhone = refPhone;
        this.refTitle = refTitle;
        this.relToCandidate = relToCandidate;
    }


    /**
     * Gets the candidateId value for this ReferenceBean.
     * 
     * @return candidateId
     */
    public long getCandidateId() {
        return candidateId;
    }


    /**
     * Sets the candidateId value for this ReferenceBean.
     * 
     * @param candidateId
     */
    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }


    /**
     * Gets the comments value for this ReferenceBean.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ReferenceBean.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the creator value for this ReferenceBean.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this ReferenceBean.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the employer value for this ReferenceBean.
     * 
     * @return employer
     */
    public java.lang.String getEmployer() {
        return employer;
    }


    /**
     * Sets the employer value for this ReferenceBean.
     * 
     * @param employer
     */
    public void setEmployer(java.lang.String employer) {
        this.employer = employer;
    }


    /**
     * Gets the refEmail value for this ReferenceBean.
     * 
     * @return refEmail
     */
    public java.lang.String getRefEmail() {
        return refEmail;
    }


    /**
     * Sets the refEmail value for this ReferenceBean.
     * 
     * @param refEmail
     */
    public void setRefEmail(java.lang.String refEmail) {
        this.refEmail = refEmail;
    }


    /**
     * Gets the refName value for this ReferenceBean.
     * 
     * @return refName
     */
    public java.lang.String getRefName() {
        return refName;
    }


    /**
     * Sets the refName value for this ReferenceBean.
     * 
     * @param refName
     */
    public void setRefName(java.lang.String refName) {
        this.refName = refName;
    }


    /**
     * Gets the refPhone value for this ReferenceBean.
     * 
     * @return refPhone
     */
    public java.lang.String getRefPhone() {
        return refPhone;
    }


    /**
     * Sets the refPhone value for this ReferenceBean.
     * 
     * @param refPhone
     */
    public void setRefPhone(java.lang.String refPhone) {
        this.refPhone = refPhone;
    }


    /**
     * Gets the refTitle value for this ReferenceBean.
     * 
     * @return refTitle
     */
    public java.lang.String getRefTitle() {
        return refTitle;
    }


    /**
     * Sets the refTitle value for this ReferenceBean.
     * 
     * @param refTitle
     */
    public void setRefTitle(java.lang.String refTitle) {
        this.refTitle = refTitle;
    }


    /**
     * Gets the relToCandidate value for this ReferenceBean.
     * 
     * @return relToCandidate
     */
    public java.lang.String getRelToCandidate() {
        return relToCandidate;
    }


    /**
     * Sets the relToCandidate value for this ReferenceBean.
     * 
     * @param relToCandidate
     */
    public void setRelToCandidate(java.lang.String relToCandidate) {
        this.relToCandidate = relToCandidate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceBean)) return false;
        ReferenceBean other = (ReferenceBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.candidateId == other.getCandidateId() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.employer==null && other.getEmployer()==null) || 
             (this.employer!=null &&
              this.employer.equals(other.getEmployer()))) &&
            ((this.refEmail==null && other.getRefEmail()==null) || 
             (this.refEmail!=null &&
              this.refEmail.equals(other.getRefEmail()))) &&
            ((this.refName==null && other.getRefName()==null) || 
             (this.refName!=null &&
              this.refName.equals(other.getRefName()))) &&
            ((this.refPhone==null && other.getRefPhone()==null) || 
             (this.refPhone!=null &&
              this.refPhone.equals(other.getRefPhone()))) &&
            ((this.refTitle==null && other.getRefTitle()==null) || 
             (this.refTitle!=null &&
              this.refTitle.equals(other.getRefTitle()))) &&
            ((this.relToCandidate==null && other.getRelToCandidate()==null) || 
             (this.relToCandidate!=null &&
              this.relToCandidate.equals(other.getRelToCandidate())));
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
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getEmployer() != null) {
            _hashCode += getEmployer().hashCode();
        }
        if (getRefEmail() != null) {
            _hashCode += getRefEmail().hashCode();
        }
        if (getRefName() != null) {
            _hashCode += getRefName().hashCode();
        }
        if (getRefPhone() != null) {
            _hashCode += getRefPhone().hashCode();
        }
        if (getRefTitle() != null) {
            _hashCode += getRefTitle().hashCode();
        }
        if (getRelToCandidate() != null) {
            _hashCode += getRelToCandidate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "ReferenceBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relToCandidate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relToCandidate"));
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

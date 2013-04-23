/**
 * WorkHistoryBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class WorkHistoryBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private long entityId;

    private int seqNo;

    private java.lang.String jobTitle;

    private java.lang.String companyName;

    private java.util.Calendar dateFrom;

    private java.util.Calendar dateTo;

    private java.lang.String jobDescription;

    private java.lang.String companyStreetAddress;

    private java.lang.String companyCityState;

    private java.lang.String phone;

    private java.lang.String directSupervisor;

    private java.lang.String supervisorTitle;

    private java.lang.String explanation;

    private java.lang.String finalRateOfPay;

    private boolean okToContact;

    private java.lang.String reasonForLeaving;

    public WorkHistoryBean() {
    }

    public WorkHistoryBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           long entityId,
           int seqNo,
           java.lang.String jobTitle,
           java.lang.String companyName,
           java.util.Calendar dateFrom,
           java.util.Calendar dateTo,
           java.lang.String jobDescription,
           java.lang.String companyStreetAddress,
           java.lang.String companyCityState,
           java.lang.String phone,
           java.lang.String directSupervisor,
           java.lang.String supervisorTitle,
           java.lang.String explanation,
           java.lang.String finalRateOfPay,
           boolean okToContact,
           java.lang.String reasonForLeaving) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.entityId = entityId;
        this.seqNo = seqNo;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.jobDescription = jobDescription;
        this.companyStreetAddress = companyStreetAddress;
        this.companyCityState = companyCityState;
        this.phone = phone;
        this.directSupervisor = directSupervisor;
        this.supervisorTitle = supervisorTitle;
        this.explanation = explanation;
        this.finalRateOfPay = finalRateOfPay;
        this.okToContact = okToContact;
        this.reasonForLeaving = reasonForLeaving;
    }


    /**
     * Gets the entityId value for this WorkHistoryBean.
     * 
     * @return entityId
     */
    public long getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this WorkHistoryBean.
     * 
     * @param entityId
     */
    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the seqNo value for this WorkHistoryBean.
     * 
     * @return seqNo
     */
    public int getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this WorkHistoryBean.
     * 
     * @param seqNo
     */
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the jobTitle value for this WorkHistoryBean.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this WorkHistoryBean.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the companyName value for this WorkHistoryBean.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this WorkHistoryBean.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the dateFrom value for this WorkHistoryBean.
     * 
     * @return dateFrom
     */
    public java.util.Calendar getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this WorkHistoryBean.
     * 
     * @param dateFrom
     */
    public void setDateFrom(java.util.Calendar dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this WorkHistoryBean.
     * 
     * @return dateTo
     */
    public java.util.Calendar getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this WorkHistoryBean.
     * 
     * @param dateTo
     */
    public void setDateTo(java.util.Calendar dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the jobDescription value for this WorkHistoryBean.
     * 
     * @return jobDescription
     */
    public java.lang.String getJobDescription() {
        return jobDescription;
    }


    /**
     * Sets the jobDescription value for this WorkHistoryBean.
     * 
     * @param jobDescription
     */
    public void setJobDescription(java.lang.String jobDescription) {
        this.jobDescription = jobDescription;
    }


    /**
     * Gets the companyStreetAddress value for this WorkHistoryBean.
     * 
     * @return companyStreetAddress
     */
    public java.lang.String getCompanyStreetAddress() {
        return companyStreetAddress;
    }


    /**
     * Sets the companyStreetAddress value for this WorkHistoryBean.
     * 
     * @param companyStreetAddress
     */
    public void setCompanyStreetAddress(java.lang.String companyStreetAddress) {
        this.companyStreetAddress = companyStreetAddress;
    }


    /**
     * Gets the companyCityState value for this WorkHistoryBean.
     * 
     * @return companyCityState
     */
    public java.lang.String getCompanyCityState() {
        return companyCityState;
    }


    /**
     * Sets the companyCityState value for this WorkHistoryBean.
     * 
     * @param companyCityState
     */
    public void setCompanyCityState(java.lang.String companyCityState) {
        this.companyCityState = companyCityState;
    }


    /**
     * Gets the phone value for this WorkHistoryBean.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this WorkHistoryBean.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the directSupervisor value for this WorkHistoryBean.
     * 
     * @return directSupervisor
     */
    public java.lang.String getDirectSupervisor() {
        return directSupervisor;
    }


    /**
     * Sets the directSupervisor value for this WorkHistoryBean.
     * 
     * @param directSupervisor
     */
    public void setDirectSupervisor(java.lang.String directSupervisor) {
        this.directSupervisor = directSupervisor;
    }


    /**
     * Gets the supervisorTitle value for this WorkHistoryBean.
     * 
     * @return supervisorTitle
     */
    public java.lang.String getSupervisorTitle() {
        return supervisorTitle;
    }


    /**
     * Sets the supervisorTitle value for this WorkHistoryBean.
     * 
     * @param supervisorTitle
     */
    public void setSupervisorTitle(java.lang.String supervisorTitle) {
        this.supervisorTitle = supervisorTitle;
    }


    /**
     * Gets the explanation value for this WorkHistoryBean.
     * 
     * @return explanation
     */
    public java.lang.String getExplanation() {
        return explanation;
    }


    /**
     * Sets the explanation value for this WorkHistoryBean.
     * 
     * @param explanation
     */
    public void setExplanation(java.lang.String explanation) {
        this.explanation = explanation;
    }


    /**
     * Gets the finalRateOfPay value for this WorkHistoryBean.
     * 
     * @return finalRateOfPay
     */
    public java.lang.String getFinalRateOfPay() {
        return finalRateOfPay;
    }


    /**
     * Sets the finalRateOfPay value for this WorkHistoryBean.
     * 
     * @param finalRateOfPay
     */
    public void setFinalRateOfPay(java.lang.String finalRateOfPay) {
        this.finalRateOfPay = finalRateOfPay;
    }


    /**
     * Gets the okToContact value for this WorkHistoryBean.
     * 
     * @return okToContact
     */
    public boolean isOkToContact() {
        return okToContact;
    }


    /**
     * Sets the okToContact value for this WorkHistoryBean.
     * 
     * @param okToContact
     */
    public void setOkToContact(boolean okToContact) {
        this.okToContact = okToContact;
    }


    /**
     * Gets the reasonForLeaving value for this WorkHistoryBean.
     * 
     * @return reasonForLeaving
     */
    public java.lang.String getReasonForLeaving() {
        return reasonForLeaving;
    }


    /**
     * Sets the reasonForLeaving value for this WorkHistoryBean.
     * 
     * @param reasonForLeaving
     */
    public void setReasonForLeaving(java.lang.String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkHistoryBean)) return false;
        WorkHistoryBean other = (WorkHistoryBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.entityId == other.getEntityId() &&
            this.seqNo == other.getSeqNo() &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.jobDescription==null && other.getJobDescription()==null) || 
             (this.jobDescription!=null &&
              this.jobDescription.equals(other.getJobDescription()))) &&
            ((this.companyStreetAddress==null && other.getCompanyStreetAddress()==null) || 
             (this.companyStreetAddress!=null &&
              this.companyStreetAddress.equals(other.getCompanyStreetAddress()))) &&
            ((this.companyCityState==null && other.getCompanyCityState()==null) || 
             (this.companyCityState!=null &&
              this.companyCityState.equals(other.getCompanyCityState()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.directSupervisor==null && other.getDirectSupervisor()==null) || 
             (this.directSupervisor!=null &&
              this.directSupervisor.equals(other.getDirectSupervisor()))) &&
            ((this.supervisorTitle==null && other.getSupervisorTitle()==null) || 
             (this.supervisorTitle!=null &&
              this.supervisorTitle.equals(other.getSupervisorTitle()))) &&
            ((this.explanation==null && other.getExplanation()==null) || 
             (this.explanation!=null &&
              this.explanation.equals(other.getExplanation()))) &&
            ((this.finalRateOfPay==null && other.getFinalRateOfPay()==null) || 
             (this.finalRateOfPay!=null &&
              this.finalRateOfPay.equals(other.getFinalRateOfPay()))) &&
            this.okToContact == other.isOkToContact() &&
            ((this.reasonForLeaving==null && other.getReasonForLeaving()==null) || 
             (this.reasonForLeaving!=null &&
              this.reasonForLeaving.equals(other.getReasonForLeaving())));
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
        _hashCode += new Long(getEntityId()).hashCode();
        _hashCode += getSeqNo();
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getJobDescription() != null) {
            _hashCode += getJobDescription().hashCode();
        }
        if (getCompanyStreetAddress() != null) {
            _hashCode += getCompanyStreetAddress().hashCode();
        }
        if (getCompanyCityState() != null) {
            _hashCode += getCompanyCityState().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getDirectSupervisor() != null) {
            _hashCode += getDirectSupervisor().hashCode();
        }
        if (getSupervisorTitle() != null) {
            _hashCode += getSupervisorTitle().hashCode();
        }
        if (getExplanation() != null) {
            _hashCode += getExplanation().hashCode();
        }
        if (getFinalRateOfPay() != null) {
            _hashCode += getFinalRateOfPay().hashCode();
        }
        _hashCode += (isOkToContact() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReasonForLeaving() != null) {
            _hashCode += getReasonForLeaving().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkHistoryBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "WorkHistoryBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyStreetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyStreetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCityState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyCityState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directSupervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directSupervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supervisorTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "explanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalRateOfPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalRateOfPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okToContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "okToContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonForLeaving");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonForLeaving"));
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

/**
 * OfferBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class OfferBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private long candidateId;

    private java.lang.String creator;

    private java.lang.String employmentType;

    private java.util.Calendar expirationDate;

    private java.lang.String manager;

    private java.lang.String offerFileName;

    private java.lang.String payRate;

    private long requisitionId;

    private java.util.Calendar startDate;

    private java.lang.String stockOptions;

    private java.lang.String title;

    public OfferBean() {
    }

    public OfferBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           long candidateId,
           java.lang.String creator,
           java.lang.String employmentType,
           java.util.Calendar expirationDate,
           java.lang.String manager,
           java.lang.String offerFileName,
           java.lang.String payRate,
           long requisitionId,
           java.util.Calendar startDate,
           java.lang.String stockOptions,
           java.lang.String title) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.candidateId = candidateId;
        this.creator = creator;
        this.employmentType = employmentType;
        this.expirationDate = expirationDate;
        this.manager = manager;
        this.offerFileName = offerFileName;
        this.payRate = payRate;
        this.requisitionId = requisitionId;
        this.startDate = startDate;
        this.stockOptions = stockOptions;
        this.title = title;
    }


    /**
     * Gets the candidateId value for this OfferBean.
     * 
     * @return candidateId
     */
    public long getCandidateId() {
        return candidateId;
    }


    /**
     * Sets the candidateId value for this OfferBean.
     * 
     * @param candidateId
     */
    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }


    /**
     * Gets the creator value for this OfferBean.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this OfferBean.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the employmentType value for this OfferBean.
     * 
     * @return employmentType
     */
    public java.lang.String getEmploymentType() {
        return employmentType;
    }


    /**
     * Sets the employmentType value for this OfferBean.
     * 
     * @param employmentType
     */
    public void setEmploymentType(java.lang.String employmentType) {
        this.employmentType = employmentType;
    }


    /**
     * Gets the expirationDate value for this OfferBean.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this OfferBean.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the manager value for this OfferBean.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this OfferBean.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the offerFileName value for this OfferBean.
     * 
     * @return offerFileName
     */
    public java.lang.String getOfferFileName() {
        return offerFileName;
    }


    /**
     * Sets the offerFileName value for this OfferBean.
     * 
     * @param offerFileName
     */
    public void setOfferFileName(java.lang.String offerFileName) {
        this.offerFileName = offerFileName;
    }


    /**
     * Gets the payRate value for this OfferBean.
     * 
     * @return payRate
     */
    public java.lang.String getPayRate() {
        return payRate;
    }


    /**
     * Sets the payRate value for this OfferBean.
     * 
     * @param payRate
     */
    public void setPayRate(java.lang.String payRate) {
        this.payRate = payRate;
    }


    /**
     * Gets the requisitionId value for this OfferBean.
     * 
     * @return requisitionId
     */
    public long getRequisitionId() {
        return requisitionId;
    }


    /**
     * Sets the requisitionId value for this OfferBean.
     * 
     * @param requisitionId
     */
    public void setRequisitionId(long requisitionId) {
        this.requisitionId = requisitionId;
    }


    /**
     * Gets the startDate value for this OfferBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OfferBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the stockOptions value for this OfferBean.
     * 
     * @return stockOptions
     */
    public java.lang.String getStockOptions() {
        return stockOptions;
    }


    /**
     * Sets the stockOptions value for this OfferBean.
     * 
     * @param stockOptions
     */
    public void setStockOptions(java.lang.String stockOptions) {
        this.stockOptions = stockOptions;
    }


    /**
     * Gets the title value for this OfferBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OfferBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferBean)) return false;
        OfferBean other = (OfferBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.candidateId == other.getCandidateId() &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.employmentType==null && other.getEmploymentType()==null) || 
             (this.employmentType!=null &&
              this.employmentType.equals(other.getEmploymentType()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.offerFileName==null && other.getOfferFileName()==null) || 
             (this.offerFileName!=null &&
              this.offerFileName.equals(other.getOfferFileName()))) &&
            ((this.payRate==null && other.getPayRate()==null) || 
             (this.payRate!=null &&
              this.payRate.equals(other.getPayRate()))) &&
            this.requisitionId == other.getRequisitionId() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.stockOptions==null && other.getStockOptions()==null) || 
             (this.stockOptions!=null &&
              this.stockOptions.equals(other.getStockOptions()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getEmploymentType() != null) {
            _hashCode += getEmploymentType().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getOfferFileName() != null) {
            _hashCode += getOfferFileName().hashCode();
        }
        if (getPayRate() != null) {
            _hashCode += getPayRate().hashCode();
        }
        _hashCode += new Long(getRequisitionId()).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStockOptions() != null) {
            _hashCode += getStockOptions().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "OfferBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requisitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stockOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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

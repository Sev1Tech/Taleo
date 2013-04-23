/**
 * RequisitionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class RequisitionBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String description;

    private java.lang.String duration;

    private java.util.Calendar filledDate;

    private java.lang.String jobCategory;

    private java.lang.String jobCode;

    private java.lang.String location;

    private int numOpen;

    private java.util.Calendar openedDate;

    private java.lang.String payRange;

    private java.lang.String state;

    private java.lang.String title;

    public RequisitionBean() {
    }

    public RequisitionBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           java.lang.String city,
           java.lang.String description,
           java.lang.String duration,
           java.util.Calendar filledDate,
           java.lang.String jobCategory,
           java.lang.String jobCode,
           java.lang.String location,
           int numOpen,
           java.util.Calendar openedDate,
           java.lang.String payRange,
           java.lang.String state,
           java.lang.String title) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.city = city;
        this.description = description;
        this.duration = duration;
        this.filledDate = filledDate;
        this.jobCategory = jobCategory;
        this.jobCode = jobCode;
        this.location = location;
        this.numOpen = numOpen;
        this.openedDate = openedDate;
        this.payRange = payRange;
        this.state = state;
        this.title = title;
    }


    /**
     * Gets the city value for this RequisitionBean.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this RequisitionBean.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the description value for this RequisitionBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RequisitionBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the duration value for this RequisitionBean.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RequisitionBean.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the filledDate value for this RequisitionBean.
     * 
     * @return filledDate
     */
    public java.util.Calendar getFilledDate() {
        return filledDate;
    }


    /**
     * Sets the filledDate value for this RequisitionBean.
     * 
     * @param filledDate
     */
    public void setFilledDate(java.util.Calendar filledDate) {
        this.filledDate = filledDate;
    }


    /**
     * Gets the jobCategory value for this RequisitionBean.
     * 
     * @return jobCategory
     */
    public java.lang.String getJobCategory() {
        return jobCategory;
    }


    /**
     * Sets the jobCategory value for this RequisitionBean.
     * 
     * @param jobCategory
     */
    public void setJobCategory(java.lang.String jobCategory) {
        this.jobCategory = jobCategory;
    }


    /**
     * Gets the jobCode value for this RequisitionBean.
     * 
     * @return jobCode
     */
    public java.lang.String getJobCode() {
        return jobCode;
    }


    /**
     * Sets the jobCode value for this RequisitionBean.
     * 
     * @param jobCode
     */
    public void setJobCode(java.lang.String jobCode) {
        this.jobCode = jobCode;
    }


    /**
     * Gets the location value for this RequisitionBean.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this RequisitionBean.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the numOpen value for this RequisitionBean.
     * 
     * @return numOpen
     */
    public int getNumOpen() {
        return numOpen;
    }


    /**
     * Sets the numOpen value for this RequisitionBean.
     * 
     * @param numOpen
     */
    public void setNumOpen(int numOpen) {
        this.numOpen = numOpen;
    }


    /**
     * Gets the openedDate value for this RequisitionBean.
     * 
     * @return openedDate
     */
    public java.util.Calendar getOpenedDate() {
        return openedDate;
    }


    /**
     * Sets the openedDate value for this RequisitionBean.
     * 
     * @param openedDate
     */
    public void setOpenedDate(java.util.Calendar openedDate) {
        this.openedDate = openedDate;
    }


    /**
     * Gets the payRange value for this RequisitionBean.
     * 
     * @return payRange
     */
    public java.lang.String getPayRange() {
        return payRange;
    }


    /**
     * Sets the payRange value for this RequisitionBean.
     * 
     * @param payRange
     */
    public void setPayRange(java.lang.String payRange) {
        this.payRange = payRange;
    }


    /**
     * Gets the state value for this RequisitionBean.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this RequisitionBean.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the title value for this RequisitionBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RequisitionBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequisitionBean)) return false;
        RequisitionBean other = (RequisitionBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.filledDate==null && other.getFilledDate()==null) || 
             (this.filledDate!=null &&
              this.filledDate.equals(other.getFilledDate()))) &&
            ((this.jobCategory==null && other.getJobCategory()==null) || 
             (this.jobCategory!=null &&
              this.jobCategory.equals(other.getJobCategory()))) &&
            ((this.jobCode==null && other.getJobCode()==null) || 
             (this.jobCode!=null &&
              this.jobCode.equals(other.getJobCode()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            this.numOpen == other.getNumOpen() &&
            ((this.openedDate==null && other.getOpenedDate()==null) || 
             (this.openedDate!=null &&
              this.openedDate.equals(other.getOpenedDate()))) &&
            ((this.payRange==null && other.getPayRange()==null) || 
             (this.payRange!=null &&
              this.payRange.equals(other.getPayRange()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getFilledDate() != null) {
            _hashCode += getFilledDate().hashCode();
        }
        if (getJobCategory() != null) {
            _hashCode += getJobCategory().hashCode();
        }
        if (getJobCode() != null) {
            _hashCode += getJobCode().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        _hashCode += getNumOpen();
        if (getOpenedDate() != null) {
            _hashCode += getOpenedDate().hashCode();
        }
        if (getPayRange() != null) {
            _hashCode += getPayRange().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequisitionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "RequisitionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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

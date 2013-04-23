/**
 * CandidateBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class CandidateBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String cellPhone;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String gender;

    private java.util.Calendar hiredDate;

    private java.lang.String lastName;

    private java.lang.String legalStatus;

    private java.lang.String middleInitial;

    private java.lang.String password;

    private java.lang.String phone;

    private java.lang.String race;

    private int rank;

    private java.lang.String reasonRejected;

    private java.lang.String referredBy;

    private java.lang.String resumeFileName;

    private java.lang.String source;

    private java.util.Calendar startDate;

    private java.lang.String state;

    private java.lang.String submittedBy;

    private java.lang.String textResume;

    private java.lang.String veteran;

    private java.lang.String zipCode;

    public CandidateBean() {
    }

    public CandidateBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           java.lang.String address,
           java.lang.String cellPhone,
           java.lang.String city,
           java.lang.String country,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String gender,
           java.util.Calendar hiredDate,
           java.lang.String lastName,
           java.lang.String legalStatus,
           java.lang.String middleInitial,
           java.lang.String password,
           java.lang.String phone,
           java.lang.String race,
           int rank,
           java.lang.String reasonRejected,
           java.lang.String referredBy,
           java.lang.String resumeFileName,
           java.lang.String source,
           java.util.Calendar startDate,
           java.lang.String state,
           java.lang.String submittedBy,
           java.lang.String textResume,
           java.lang.String veteran,
           java.lang.String zipCode) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.address = address;
        this.cellPhone = cellPhone;
        this.city = city;
        this.country = country;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.hiredDate = hiredDate;
        this.lastName = lastName;
        this.legalStatus = legalStatus;
        this.middleInitial = middleInitial;
        this.password = password;
        this.phone = phone;
        this.race = race;
        this.rank = rank;
        this.reasonRejected = reasonRejected;
        this.referredBy = referredBy;
        this.resumeFileName = resumeFileName;
        this.source = source;
        this.startDate = startDate;
        this.state = state;
        this.submittedBy = submittedBy;
        this.textResume = textResume;
        this.veteran = veteran;
        this.zipCode = zipCode;
    }


    /**
     * Gets the address value for this CandidateBean.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CandidateBean.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the cellPhone value for this CandidateBean.
     * 
     * @return cellPhone
     */
    public java.lang.String getCellPhone() {
        return cellPhone;
    }


    /**
     * Sets the cellPhone value for this CandidateBean.
     * 
     * @param cellPhone
     */
    public void setCellPhone(java.lang.String cellPhone) {
        this.cellPhone = cellPhone;
    }


    /**
     * Gets the city value for this CandidateBean.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CandidateBean.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this CandidateBean.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CandidateBean.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the email value for this CandidateBean.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CandidateBean.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this CandidateBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CandidateBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this CandidateBean.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CandidateBean.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the hiredDate value for this CandidateBean.
     * 
     * @return hiredDate
     */
    public java.util.Calendar getHiredDate() {
        return hiredDate;
    }


    /**
     * Sets the hiredDate value for this CandidateBean.
     * 
     * @param hiredDate
     */
    public void setHiredDate(java.util.Calendar hiredDate) {
        this.hiredDate = hiredDate;
    }


    /**
     * Gets the lastName value for this CandidateBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CandidateBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the legalStatus value for this CandidateBean.
     * 
     * @return legalStatus
     */
    public java.lang.String getLegalStatus() {
        return legalStatus;
    }


    /**
     * Sets the legalStatus value for this CandidateBean.
     * 
     * @param legalStatus
     */
    public void setLegalStatus(java.lang.String legalStatus) {
        this.legalStatus = legalStatus;
    }


    /**
     * Gets the middleInitial value for this CandidateBean.
     * 
     * @return middleInitial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this CandidateBean.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the password value for this CandidateBean.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CandidateBean.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the phone value for this CandidateBean.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this CandidateBean.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the race value for this CandidateBean.
     * 
     * @return race
     */
    public java.lang.String getRace() {
        return race;
    }


    /**
     * Sets the race value for this CandidateBean.
     * 
     * @param race
     */
    public void setRace(java.lang.String race) {
        this.race = race;
    }


    /**
     * Gets the rank value for this CandidateBean.
     * 
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this CandidateBean.
     * 
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }


    /**
     * Gets the reasonRejected value for this CandidateBean.
     * 
     * @return reasonRejected
     */
    public java.lang.String getReasonRejected() {
        return reasonRejected;
    }


    /**
     * Sets the reasonRejected value for this CandidateBean.
     * 
     * @param reasonRejected
     */
    public void setReasonRejected(java.lang.String reasonRejected) {
        this.reasonRejected = reasonRejected;
    }


    /**
     * Gets the referredBy value for this CandidateBean.
     * 
     * @return referredBy
     */
    public java.lang.String getReferredBy() {
        return referredBy;
    }


    /**
     * Sets the referredBy value for this CandidateBean.
     * 
     * @param referredBy
     */
    public void setReferredBy(java.lang.String referredBy) {
        this.referredBy = referredBy;
    }


    /**
     * Gets the resumeFileName value for this CandidateBean.
     * 
     * @return resumeFileName
     */
    public java.lang.String getResumeFileName() {
        return resumeFileName;
    }


    /**
     * Sets the resumeFileName value for this CandidateBean.
     * 
     * @param resumeFileName
     */
    public void setResumeFileName(java.lang.String resumeFileName) {
        this.resumeFileName = resumeFileName;
    }


    /**
     * Gets the source value for this CandidateBean.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CandidateBean.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the startDate value for this CandidateBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CandidateBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the state value for this CandidateBean.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CandidateBean.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the submittedBy value for this CandidateBean.
     * 
     * @return submittedBy
     */
    public java.lang.String getSubmittedBy() {
        return submittedBy;
    }


    /**
     * Sets the submittedBy value for this CandidateBean.
     * 
     * @param submittedBy
     */
    public void setSubmittedBy(java.lang.String submittedBy) {
        this.submittedBy = submittedBy;
    }


    /**
     * Gets the textResume value for this CandidateBean.
     * 
     * @return textResume
     */
    public java.lang.String getTextResume() {
        return textResume;
    }


    /**
     * Sets the textResume value for this CandidateBean.
     * 
     * @param textResume
     */
    public void setTextResume(java.lang.String textResume) {
        this.textResume = textResume;
    }


    /**
     * Gets the veteran value for this CandidateBean.
     * 
     * @return veteran
     */
    public java.lang.String getVeteran() {
        return veteran;
    }


    /**
     * Sets the veteran value for this CandidateBean.
     * 
     * @param veteran
     */
    public void setVeteran(java.lang.String veteran) {
        this.veteran = veteran;
    }


    /**
     * Gets the zipCode value for this CandidateBean.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this CandidateBean.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CandidateBean)) return false;
        CandidateBean other = (CandidateBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.cellPhone==null && other.getCellPhone()==null) || 
             (this.cellPhone!=null &&
              this.cellPhone.equals(other.getCellPhone()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.hiredDate==null && other.getHiredDate()==null) || 
             (this.hiredDate!=null &&
              this.hiredDate.equals(other.getHiredDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.legalStatus==null && other.getLegalStatus()==null) || 
             (this.legalStatus!=null &&
              this.legalStatus.equals(other.getLegalStatus()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              this.race.equals(other.getRace()))) &&
            this.rank == other.getRank() &&
            ((this.reasonRejected==null && other.getReasonRejected()==null) || 
             (this.reasonRejected!=null &&
              this.reasonRejected.equals(other.getReasonRejected()))) &&
            ((this.referredBy==null && other.getReferredBy()==null) || 
             (this.referredBy!=null &&
              this.referredBy.equals(other.getReferredBy()))) &&
            ((this.resumeFileName==null && other.getResumeFileName()==null) || 
             (this.resumeFileName!=null &&
              this.resumeFileName.equals(other.getResumeFileName()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.submittedBy==null && other.getSubmittedBy()==null) || 
             (this.submittedBy!=null &&
              this.submittedBy.equals(other.getSubmittedBy()))) &&
            ((this.textResume==null && other.getTextResume()==null) || 
             (this.textResume!=null &&
              this.textResume.equals(other.getTextResume()))) &&
            ((this.veteran==null && other.getVeteran()==null) || 
             (this.veteran!=null &&
              this.veteran.equals(other.getVeteran()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCellPhone() != null) {
            _hashCode += getCellPhone().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHiredDate() != null) {
            _hashCode += getHiredDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLegalStatus() != null) {
            _hashCode += getLegalStatus().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getRace() != null) {
            _hashCode += getRace().hashCode();
        }
        _hashCode += getRank();
        if (getReasonRejected() != null) {
            _hashCode += getReasonRejected().hashCode();
        }
        if (getReferredBy() != null) {
            _hashCode += getReferredBy().hashCode();
        }
        if (getResumeFileName() != null) {
            _hashCode += getResumeFileName().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubmittedBy() != null) {
            _hashCode += getSubmittedBy().hashCode();
        }
        if (getTextResume() != null) {
            _hashCode += getTextResume().hashCode();
        }
        if (getVeteran() != null) {
            _hashCode += getVeteran().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CandidateBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "CandidateBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hiredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hiredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("", "race"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonRejected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonRejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referredBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referredBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resumeFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resumeFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submittedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textResume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textResume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veteran");
        elemField.setXmlName(new javax.xml.namespace.QName("", "veteran"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zipCode"));
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

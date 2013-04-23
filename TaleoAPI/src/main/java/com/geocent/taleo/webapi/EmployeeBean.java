/**
 * EmployeeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class EmployeeBean  extends com.geocent.taleo.webapi.AddressEntityBean  implements java.io.Serializable {
    private java.lang.String employeeNumber;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String middleInitial;

    private java.lang.String lastName;

    private java.lang.String cellPhone;

    private java.lang.String title;

    private java.util.Calendar hiredDate;

    private java.util.Calendar startDate;

    private java.lang.String race;

    private java.lang.String gender;

    private boolean lockedFromEws;

    private long reviewManagerId;

    private long departmentId;

    private java.lang.String hierarchyPath;

    private long managerId;

    private long locationId;

    private java.lang.String ewsLogin;

    private java.lang.String ewsPassword;

    private java.lang.String jobTitle;

    private java.lang.String jobCode;

    private java.lang.String salaryGrade;

    private double salary;

    private java.lang.String payFrequency;

    private boolean changePswdOnEwsLogin;

    private java.util.HashMap additionalEntities;

    public EmployeeBean() {
    }

    public EmployeeBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           java.lang.String city,
           java.lang.String address,
           java.lang.String zipCode,
           java.lang.String state,
           java.lang.String country,
           java.lang.String phone,
           java.lang.String employeeNumber,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String middleInitial,
           java.lang.String lastName,
           java.lang.String cellPhone,
           java.lang.String title,
           java.util.Calendar hiredDate,
           java.util.Calendar startDate,
           java.lang.String race,
           java.lang.String gender,
           boolean lockedFromEws,
           long reviewManagerId,
           long departmentId,
           java.lang.String hierarchyPath,
           long managerId,
           long locationId,
           java.lang.String ewsLogin,
           java.lang.String ewsPassword,
           java.lang.String jobTitle,
           java.lang.String jobCode,
           java.lang.String salaryGrade,
           double salary,
           java.lang.String payFrequency,
           boolean changePswdOnEwsLogin,
           java.util.HashMap additionalEntities) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status,
            city,
            address,
            zipCode,
            state,
            country,
            phone);
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
        this.title = title;
        this.hiredDate = hiredDate;
        this.startDate = startDate;
        this.race = race;
        this.gender = gender;
        this.lockedFromEws = lockedFromEws;
        this.reviewManagerId = reviewManagerId;
        this.departmentId = departmentId;
        this.hierarchyPath = hierarchyPath;
        this.managerId = managerId;
        this.locationId = locationId;
        this.ewsLogin = ewsLogin;
        this.ewsPassword = ewsPassword;
        this.jobTitle = jobTitle;
        this.jobCode = jobCode;
        this.salaryGrade = salaryGrade;
        this.salary = salary;
        this.payFrequency = payFrequency;
        this.changePswdOnEwsLogin = changePswdOnEwsLogin;
        this.additionalEntities = additionalEntities;
    }


    /**
     * Gets the employeeNumber value for this EmployeeBean.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this EmployeeBean.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the email value for this EmployeeBean.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EmployeeBean.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this EmployeeBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EmployeeBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleInitial value for this EmployeeBean.
     * 
     * @return middleInitial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this EmployeeBean.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the lastName value for this EmployeeBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EmployeeBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the cellPhone value for this EmployeeBean.
     * 
     * @return cellPhone
     */
    public java.lang.String getCellPhone() {
        return cellPhone;
    }


    /**
     * Sets the cellPhone value for this EmployeeBean.
     * 
     * @param cellPhone
     */
    public void setCellPhone(java.lang.String cellPhone) {
        this.cellPhone = cellPhone;
    }


    /**
     * Gets the title value for this EmployeeBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EmployeeBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the hiredDate value for this EmployeeBean.
     * 
     * @return hiredDate
     */
    public java.util.Calendar getHiredDate() {
        return hiredDate;
    }


    /**
     * Sets the hiredDate value for this EmployeeBean.
     * 
     * @param hiredDate
     */
    public void setHiredDate(java.util.Calendar hiredDate) {
        this.hiredDate = hiredDate;
    }


    /**
     * Gets the startDate value for this EmployeeBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this EmployeeBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the race value for this EmployeeBean.
     * 
     * @return race
     */
    public java.lang.String getRace() {
        return race;
    }


    /**
     * Sets the race value for this EmployeeBean.
     * 
     * @param race
     */
    public void setRace(java.lang.String race) {
        this.race = race;
    }


    /**
     * Gets the gender value for this EmployeeBean.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this EmployeeBean.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the lockedFromEws value for this EmployeeBean.
     * 
     * @return lockedFromEws
     */
    public boolean isLockedFromEws() {
        return lockedFromEws;
    }


    /**
     * Sets the lockedFromEws value for this EmployeeBean.
     * 
     * @param lockedFromEws
     */
    public void setLockedFromEws(boolean lockedFromEws) {
        this.lockedFromEws = lockedFromEws;
    }


    /**
     * Gets the reviewManagerId value for this EmployeeBean.
     * 
     * @return reviewManagerId
     */
    public long getReviewManagerId() {
        return reviewManagerId;
    }


    /**
     * Sets the reviewManagerId value for this EmployeeBean.
     * 
     * @param reviewManagerId
     */
    public void setReviewManagerId(long reviewManagerId) {
        this.reviewManagerId = reviewManagerId;
    }


    /**
     * Gets the departmentId value for this EmployeeBean.
     * 
     * @return departmentId
     */
    public long getDepartmentId() {
        return departmentId;
    }


    /**
     * Sets the departmentId value for this EmployeeBean.
     * 
     * @param departmentId
     */
    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }


    /**
     * Gets the hierarchyPath value for this EmployeeBean.
     * 
     * @return hierarchyPath
     */
    public java.lang.String getHierarchyPath() {
        return hierarchyPath;
    }


    /**
     * Sets the hierarchyPath value for this EmployeeBean.
     * 
     * @param hierarchyPath
     */
    public void setHierarchyPath(java.lang.String hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
    }


    /**
     * Gets the managerId value for this EmployeeBean.
     * 
     * @return managerId
     */
    public long getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this EmployeeBean.
     * 
     * @param managerId
     */
    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the locationId value for this EmployeeBean.
     * 
     * @return locationId
     */
    public long getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this EmployeeBean.
     * 
     * @param locationId
     */
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the ewsLogin value for this EmployeeBean.
     * 
     * @return ewsLogin
     */
    public java.lang.String getEwsLogin() {
        return ewsLogin;
    }


    /**
     * Sets the ewsLogin value for this EmployeeBean.
     * 
     * @param ewsLogin
     */
    public void setEwsLogin(java.lang.String ewsLogin) {
        this.ewsLogin = ewsLogin;
    }


    /**
     * Gets the ewsPassword value for this EmployeeBean.
     * 
     * @return ewsPassword
     */
    public java.lang.String getEwsPassword() {
        return ewsPassword;
    }


    /**
     * Sets the ewsPassword value for this EmployeeBean.
     * 
     * @param ewsPassword
     */
    public void setEwsPassword(java.lang.String ewsPassword) {
        this.ewsPassword = ewsPassword;
    }


    /**
     * Gets the jobTitle value for this EmployeeBean.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this EmployeeBean.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the jobCode value for this EmployeeBean.
     * 
     * @return jobCode
     */
    public java.lang.String getJobCode() {
        return jobCode;
    }


    /**
     * Sets the jobCode value for this EmployeeBean.
     * 
     * @param jobCode
     */
    public void setJobCode(java.lang.String jobCode) {
        this.jobCode = jobCode;
    }


    /**
     * Gets the salaryGrade value for this EmployeeBean.
     * 
     * @return salaryGrade
     */
    public java.lang.String getSalaryGrade() {
        return salaryGrade;
    }


    /**
     * Sets the salaryGrade value for this EmployeeBean.
     * 
     * @param salaryGrade
     */
    public void setSalaryGrade(java.lang.String salaryGrade) {
        this.salaryGrade = salaryGrade;
    }


    /**
     * Gets the salary value for this EmployeeBean.
     * 
     * @return salary
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this EmployeeBean.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Gets the payFrequency value for this EmployeeBean.
     * 
     * @return payFrequency
     */
    public java.lang.String getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this EmployeeBean.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(java.lang.String payFrequency) {
        this.payFrequency = payFrequency;
    }


    /**
     * Gets the changePswdOnEwsLogin value for this EmployeeBean.
     * 
     * @return changePswdOnEwsLogin
     */
    public boolean isChangePswdOnEwsLogin() {
        return changePswdOnEwsLogin;
    }


    /**
     * Sets the changePswdOnEwsLogin value for this EmployeeBean.
     * 
     * @param changePswdOnEwsLogin
     */
    public void setChangePswdOnEwsLogin(boolean changePswdOnEwsLogin) {
        this.changePswdOnEwsLogin = changePswdOnEwsLogin;
    }


    /**
     * Gets the additionalEntities value for this EmployeeBean.
     * 
     * @return additionalEntities
     */
    public java.util.HashMap getAdditionalEntities() {
        return additionalEntities;
    }


    /**
     * Sets the additionalEntities value for this EmployeeBean.
     * 
     * @param additionalEntities
     */
    public void setAdditionalEntities(java.util.HashMap additionalEntities) {
        this.additionalEntities = additionalEntities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeBean)) return false;
        EmployeeBean other = (EmployeeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.cellPhone==null && other.getCellPhone()==null) || 
             (this.cellPhone!=null &&
              this.cellPhone.equals(other.getCellPhone()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.hiredDate==null && other.getHiredDate()==null) || 
             (this.hiredDate!=null &&
              this.hiredDate.equals(other.getHiredDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              this.race.equals(other.getRace()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            this.lockedFromEws == other.isLockedFromEws() &&
            this.reviewManagerId == other.getReviewManagerId() &&
            this.departmentId == other.getDepartmentId() &&
            ((this.hierarchyPath==null && other.getHierarchyPath()==null) || 
             (this.hierarchyPath!=null &&
              this.hierarchyPath.equals(other.getHierarchyPath()))) &&
            this.managerId == other.getManagerId() &&
            this.locationId == other.getLocationId() &&
            ((this.ewsLogin==null && other.getEwsLogin()==null) || 
             (this.ewsLogin!=null &&
              this.ewsLogin.equals(other.getEwsLogin()))) &&
            ((this.ewsPassword==null && other.getEwsPassword()==null) || 
             (this.ewsPassword!=null &&
              this.ewsPassword.equals(other.getEwsPassword()))) &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.jobCode==null && other.getJobCode()==null) || 
             (this.jobCode!=null &&
              this.jobCode.equals(other.getJobCode()))) &&
            ((this.salaryGrade==null && other.getSalaryGrade()==null) || 
             (this.salaryGrade!=null &&
              this.salaryGrade.equals(other.getSalaryGrade()))) &&
            this.salary == other.getSalary() &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              this.payFrequency.equals(other.getPayFrequency()))) &&
            this.changePswdOnEwsLogin == other.isChangePswdOnEwsLogin() &&
            ((this.additionalEntities==null && other.getAdditionalEntities()==null) || 
             (this.additionalEntities!=null &&
              this.additionalEntities.equals(other.getAdditionalEntities())));
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
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getCellPhone() != null) {
            _hashCode += getCellPhone().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getHiredDate() != null) {
            _hashCode += getHiredDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getRace() != null) {
            _hashCode += getRace().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        _hashCode += (isLockedFromEws() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getReviewManagerId()).hashCode();
        _hashCode += new Long(getDepartmentId()).hashCode();
        if (getHierarchyPath() != null) {
            _hashCode += getHierarchyPath().hashCode();
        }
        _hashCode += new Long(getManagerId()).hashCode();
        _hashCode += new Long(getLocationId()).hashCode();
        if (getEwsLogin() != null) {
            _hashCode += getEwsLogin().hashCode();
        }
        if (getEwsPassword() != null) {
            _hashCode += getEwsPassword().hashCode();
        }
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getJobCode() != null) {
            _hashCode += getJobCode().hashCode();
        }
        if (getSalaryGrade() != null) {
            _hashCode += getSalaryGrade().hashCode();
        }
        _hashCode += new Double(getSalary()).hashCode();
        if (getPayFrequency() != null) {
            _hashCode += getPayFrequency().hashCode();
        }
        _hashCode += (isChangePswdOnEwsLogin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAdditionalEntities() != null) {
            _hashCode += getAdditionalEntities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "EmployeeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeNumber"));
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
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("", "race"));
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
        elemField.setFieldName("lockedFromEws");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockedFromEws"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewManagerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchyPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ewsLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ewsLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ewsPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ewsPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobTitle"));
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
        elemField.setFieldName("salaryGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salaryGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePswdOnEwsLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changePswdOnEwsLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalEntities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalEntities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
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

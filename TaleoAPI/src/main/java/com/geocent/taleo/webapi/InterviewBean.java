/**
 * InterviewBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class InterviewBean  extends com.geocent.taleo.webapi.EntityBean  implements java.io.Serializable {
    private long candidateId;

    private java.lang.String comments;

    private java.lang.String creator;

    private java.lang.String interviewRoom;

    private java.lang.String interviewType;

    private com.geocent.taleo.webapi.ParticipantBean[] participants;

    private long requisitionId;

    private java.util.Calendar startDate;

    public InterviewBean() {
    }

    public InterviewBean(
           java.util.Calendar creationDate,
           com.geocent.taleo.webapi.FlexFieldBean[] flexValues,
           long id,
           java.util.Calendar lastUpdated,
           java.lang.String status,
           long candidateId,
           java.lang.String comments,
           java.lang.String creator,
           java.lang.String interviewRoom,
           java.lang.String interviewType,
           com.geocent.taleo.webapi.ParticipantBean[] participants,
           long requisitionId,
           java.util.Calendar startDate) {
        super(
            creationDate,
            flexValues,
            id,
            lastUpdated,
            status);
        this.candidateId = candidateId;
        this.comments = comments;
        this.creator = creator;
        this.interviewRoom = interviewRoom;
        this.interviewType = interviewType;
        this.participants = participants;
        this.requisitionId = requisitionId;
        this.startDate = startDate;
    }


    /**
     * Gets the candidateId value for this InterviewBean.
     * 
     * @return candidateId
     */
    public long getCandidateId() {
        return candidateId;
    }


    /**
     * Sets the candidateId value for this InterviewBean.
     * 
     * @param candidateId
     */
    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }


    /**
     * Gets the comments value for this InterviewBean.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this InterviewBean.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the creator value for this InterviewBean.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this InterviewBean.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the interviewRoom value for this InterviewBean.
     * 
     * @return interviewRoom
     */
    public java.lang.String getInterviewRoom() {
        return interviewRoom;
    }


    /**
     * Sets the interviewRoom value for this InterviewBean.
     * 
     * @param interviewRoom
     */
    public void setInterviewRoom(java.lang.String interviewRoom) {
        this.interviewRoom = interviewRoom;
    }


    /**
     * Gets the interviewType value for this InterviewBean.
     * 
     * @return interviewType
     */
    public java.lang.String getInterviewType() {
        return interviewType;
    }


    /**
     * Sets the interviewType value for this InterviewBean.
     * 
     * @param interviewType
     */
    public void setInterviewType(java.lang.String interviewType) {
        this.interviewType = interviewType;
    }


    /**
     * Gets the participants value for this InterviewBean.
     * 
     * @return participants
     */
    public com.geocent.taleo.webapi.ParticipantBean[] getParticipants() {
        return participants;
    }


    /**
     * Sets the participants value for this InterviewBean.
     * 
     * @param participants
     */
    public void setParticipants(com.geocent.taleo.webapi.ParticipantBean[] participants) {
        this.participants = participants;
    }


    /**
     * Gets the requisitionId value for this InterviewBean.
     * 
     * @return requisitionId
     */
    public long getRequisitionId() {
        return requisitionId;
    }


    /**
     * Sets the requisitionId value for this InterviewBean.
     * 
     * @param requisitionId
     */
    public void setRequisitionId(long requisitionId) {
        this.requisitionId = requisitionId;
    }


    /**
     * Gets the startDate value for this InterviewBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this InterviewBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterviewBean)) return false;
        InterviewBean other = (InterviewBean) obj;
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
            ((this.interviewRoom==null && other.getInterviewRoom()==null) || 
             (this.interviewRoom!=null &&
              this.interviewRoom.equals(other.getInterviewRoom()))) &&
            ((this.interviewType==null && other.getInterviewType()==null) || 
             (this.interviewType!=null &&
              this.interviewType.equals(other.getInterviewType()))) &&
            ((this.participants==null && other.getParticipants()==null) || 
             (this.participants!=null &&
              java.util.Arrays.equals(this.participants, other.getParticipants()))) &&
            this.requisitionId == other.getRequisitionId() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getInterviewRoom() != null) {
            _hashCode += getInterviewRoom().hashCode();
        }
        if (getInterviewType() != null) {
            _hashCode += getInterviewType().hashCode();
        }
        if (getParticipants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParticipants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParticipants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getRequisitionId()).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterviewBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "InterviewBean"));
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
        elemField.setFieldName("interviewRoom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interviewRoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interviewType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interviewType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "participants"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "ParticipantBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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

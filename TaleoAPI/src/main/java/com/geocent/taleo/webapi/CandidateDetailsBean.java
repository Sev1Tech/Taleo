/**
 * CandidateDetailsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public class CandidateDetailsBean  implements java.io.Serializable {
    private com.geocent.taleo.webapi.OfferBean[] offerBeans;

    private com.geocent.taleo.webapi.HistoryBean[] historyBeans;

    private com.geocent.taleo.webapi.InterviewBean[] interviewBeans;

    private com.geocent.taleo.webapi.ReferenceBean[] referenceBeans;

    private com.geocent.taleo.webapi.AttachmentBean[] attachmentBeans;

    private com.geocent.taleo.webapi.RequisitionBean[] requisitionBeans;

    private com.geocent.taleo.webapi.CandidateBean candidateBean;

    public CandidateDetailsBean() {
    }

    public CandidateDetailsBean(
           com.geocent.taleo.webapi.OfferBean[] offerBeans,
           com.geocent.taleo.webapi.HistoryBean[] historyBeans,
           com.geocent.taleo.webapi.InterviewBean[] interviewBeans,
           com.geocent.taleo.webapi.ReferenceBean[] referenceBeans,
           com.geocent.taleo.webapi.AttachmentBean[] attachmentBeans,
           com.geocent.taleo.webapi.RequisitionBean[] requisitionBeans,
           com.geocent.taleo.webapi.CandidateBean candidateBean) {
           this.offerBeans = offerBeans;
           this.historyBeans = historyBeans;
           this.interviewBeans = interviewBeans;
           this.referenceBeans = referenceBeans;
           this.attachmentBeans = attachmentBeans;
           this.requisitionBeans = requisitionBeans;
           this.candidateBean = candidateBean;
    }


    /**
     * Gets the offerBeans value for this CandidateDetailsBean.
     * 
     * @return offerBeans
     */
    public com.geocent.taleo.webapi.OfferBean[] getOfferBeans() {
        return offerBeans;
    }


    /**
     * Sets the offerBeans value for this CandidateDetailsBean.
     * 
     * @param offerBeans
     */
    public void setOfferBeans(com.geocent.taleo.webapi.OfferBean[] offerBeans) {
        this.offerBeans = offerBeans;
    }


    /**
     * Gets the historyBeans value for this CandidateDetailsBean.
     * 
     * @return historyBeans
     */
    public com.geocent.taleo.webapi.HistoryBean[] getHistoryBeans() {
        return historyBeans;
    }


    /**
     * Sets the historyBeans value for this CandidateDetailsBean.
     * 
     * @param historyBeans
     */
    public void setHistoryBeans(com.geocent.taleo.webapi.HistoryBean[] historyBeans) {
        this.historyBeans = historyBeans;
    }


    /**
     * Gets the interviewBeans value for this CandidateDetailsBean.
     * 
     * @return interviewBeans
     */
    public com.geocent.taleo.webapi.InterviewBean[] getInterviewBeans() {
        return interviewBeans;
    }


    /**
     * Sets the interviewBeans value for this CandidateDetailsBean.
     * 
     * @param interviewBeans
     */
    public void setInterviewBeans(com.geocent.taleo.webapi.InterviewBean[] interviewBeans) {
        this.interviewBeans = interviewBeans;
    }


    /**
     * Gets the referenceBeans value for this CandidateDetailsBean.
     * 
     * @return referenceBeans
     */
    public com.geocent.taleo.webapi.ReferenceBean[] getReferenceBeans() {
        return referenceBeans;
    }


    /**
     * Sets the referenceBeans value for this CandidateDetailsBean.
     * 
     * @param referenceBeans
     */
    public void setReferenceBeans(com.geocent.taleo.webapi.ReferenceBean[] referenceBeans) {
        this.referenceBeans = referenceBeans;
    }


    /**
     * Gets the attachmentBeans value for this CandidateDetailsBean.
     * 
     * @return attachmentBeans
     */
    public com.geocent.taleo.webapi.AttachmentBean[] getAttachmentBeans() {
        return attachmentBeans;
    }


    /**
     * Sets the attachmentBeans value for this CandidateDetailsBean.
     * 
     * @param attachmentBeans
     */
    public void setAttachmentBeans(com.geocent.taleo.webapi.AttachmentBean[] attachmentBeans) {
        this.attachmentBeans = attachmentBeans;
    }


    /**
     * Gets the requisitionBeans value for this CandidateDetailsBean.
     * 
     * @return requisitionBeans
     */
    public com.geocent.taleo.webapi.RequisitionBean[] getRequisitionBeans() {
        return requisitionBeans;
    }


    /**
     * Sets the requisitionBeans value for this CandidateDetailsBean.
     * 
     * @param requisitionBeans
     */
    public void setRequisitionBeans(com.geocent.taleo.webapi.RequisitionBean[] requisitionBeans) {
        this.requisitionBeans = requisitionBeans;
    }


    /**
     * Gets the candidateBean value for this CandidateDetailsBean.
     * 
     * @return candidateBean
     */
    public com.geocent.taleo.webapi.CandidateBean getCandidateBean() {
        return candidateBean;
    }


    /**
     * Sets the candidateBean value for this CandidateDetailsBean.
     * 
     * @param candidateBean
     */
    public void setCandidateBean(com.geocent.taleo.webapi.CandidateBean candidateBean) {
        this.candidateBean = candidateBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CandidateDetailsBean)) return false;
        CandidateDetailsBean other = (CandidateDetailsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerBeans==null && other.getOfferBeans()==null) || 
             (this.offerBeans!=null &&
              java.util.Arrays.equals(this.offerBeans, other.getOfferBeans()))) &&
            ((this.historyBeans==null && other.getHistoryBeans()==null) || 
             (this.historyBeans!=null &&
              java.util.Arrays.equals(this.historyBeans, other.getHistoryBeans()))) &&
            ((this.interviewBeans==null && other.getInterviewBeans()==null) || 
             (this.interviewBeans!=null &&
              java.util.Arrays.equals(this.interviewBeans, other.getInterviewBeans()))) &&
            ((this.referenceBeans==null && other.getReferenceBeans()==null) || 
             (this.referenceBeans!=null &&
              java.util.Arrays.equals(this.referenceBeans, other.getReferenceBeans()))) &&
            ((this.attachmentBeans==null && other.getAttachmentBeans()==null) || 
             (this.attachmentBeans!=null &&
              java.util.Arrays.equals(this.attachmentBeans, other.getAttachmentBeans()))) &&
            ((this.requisitionBeans==null && other.getRequisitionBeans()==null) || 
             (this.requisitionBeans!=null &&
              java.util.Arrays.equals(this.requisitionBeans, other.getRequisitionBeans()))) &&
            ((this.candidateBean==null && other.getCandidateBean()==null) || 
             (this.candidateBean!=null &&
              this.candidateBean.equals(other.getCandidateBean())));
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
        if (getOfferBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistoryBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterviewBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterviewBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterviewBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequisitionBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequisitionBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequisitionBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCandidateBean() != null) {
            _hashCode += getCandidateBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CandidateDetailsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "CandidateDetailsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "OfferBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "HistoryBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interviewBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interviewBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "InterviewBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "ReferenceBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "AttachmentBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisitionBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requisitionBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "RequisitionBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candidateBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:TBEWebAPI", "CandidateBean"));
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

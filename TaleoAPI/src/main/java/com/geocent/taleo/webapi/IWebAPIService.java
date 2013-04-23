/**
 * IWebAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public interface IWebAPIService extends javax.xml.rpc.Service {
    public java.lang.String getrpcrouterAddress();

    public com.geocent.taleo.webapi.IWebAPI getrpcrouter() throws javax.xml.rpc.ServiceException;

    public com.geocent.taleo.webapi.IWebAPI getrpcrouter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

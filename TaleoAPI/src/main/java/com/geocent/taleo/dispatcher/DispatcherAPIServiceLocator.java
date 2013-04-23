/**
 * DispatcherAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.dispatcher;

public class DispatcherAPIServiceLocator extends org.apache.axis.client.Service implements DispatcherAPIService {

    public DispatcherAPIServiceLocator() {
    }


    public DispatcherAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DispatcherAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for rpcrouter
    private java.lang.String rpcrouter_address = "https://tbe.taleo.net/MANAGER/dispatcher/servlet/rpcrouter";

    public java.lang.String getrpcrouterAddress() {
        return rpcrouter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String rpcrouterWSDDServiceName = "rpcrouter";

    public java.lang.String getrpcrouterWSDDServiceName() {
        return rpcrouterWSDDServiceName;
    }

    public void setrpcrouterWSDDServiceName(java.lang.String name) {
        rpcrouterWSDDServiceName = name;
    }

    public DispatcherAPI getrpcrouter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(rpcrouter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getrpcrouter(endpoint);
    }

    public DispatcherAPI getrpcrouter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RpcrouterSoapBindingStub _stub = new RpcrouterSoapBindingStub(portAddress, this);
            _stub.setPortName(getrpcrouterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setrpcrouterEndpointAddress(java.lang.String address) {
        rpcrouter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DispatcherAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                RpcrouterSoapBindingStub _stub = new RpcrouterSoapBindingStub(new java.net.URL(rpcrouter_address), this);
                _stub.setPortName(getrpcrouterWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("rpcrouter".equals(inputPortName)) {
            return getrpcrouter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:TBEDispatcherAPI", "DispatcherAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:TBEDispatcherAPI", "rpcrouter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("rpcrouter".equals(portName)) {
            setrpcrouterEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

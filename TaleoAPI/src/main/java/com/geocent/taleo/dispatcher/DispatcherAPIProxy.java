package com.geocent.taleo.dispatcher;

public class DispatcherAPIProxy implements DispatcherAPI {
  private String _endpoint = null;
  private DispatcherAPI dispatcherAPI = null;
  
  public DispatcherAPIProxy() {
    _initDispatcherAPIProxy();
  }
  
  public DispatcherAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initDispatcherAPIProxy();
  }
  
  private void _initDispatcherAPIProxy() {
    try {
      dispatcherAPI = (new DispatcherAPIServiceLocator()).getrpcrouter();
      if (dispatcherAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dispatcherAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dispatcherAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dispatcherAPI != null)
      ((javax.xml.rpc.Stub)dispatcherAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DispatcherAPI getDispatcherAPI() {
    if (dispatcherAPI == null)
      _initDispatcherAPIProxy();
    return dispatcherAPI;
  }
  
  public java.lang.String getURL(java.lang.String orgCode) throws java.rmi.RemoteException{
    if (dispatcherAPI == null)
      _initDispatcherAPIProxy();
    return dispatcherAPI.getURL(orgCode);
  }
  
  
}
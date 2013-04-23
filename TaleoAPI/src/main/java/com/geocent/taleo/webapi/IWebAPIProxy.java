package com.geocent.taleo.webapi;

public class IWebAPIProxy implements com.geocent.taleo.webapi.IWebAPI {
  private String _endpoint = null;
  private com.geocent.taleo.webapi.IWebAPI iWebAPI = null;
  
  public IWebAPIProxy() {
    _initIWebAPIProxy();
  }
  
  public IWebAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initIWebAPIProxy();
  }
  
  private void _initIWebAPIProxy() {
    try {
      iWebAPI = (new com.geocent.taleo.webapi.IWebAPIServiceLocator()).getrpcrouter();
      if (iWebAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iWebAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iWebAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iWebAPI != null)
      ((javax.xml.rpc.Stub)iWebAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.geocent.taleo.webapi.IWebAPI getIWebAPI() {
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI;
  }
  
  public long createTask(java.lang.String in0, com.geocent.taleo.webapi.TaskBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createTask(in0, in1);
  }
  
  public long createReference(java.lang.String in0, com.geocent.taleo.webapi.ReferenceBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createReference(in0, in1);
  }
  
  public long createEvent(java.lang.String in0, com.geocent.taleo.webapi.CalendarEventBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createEvent(in0, in1);
  }
  
  public java.lang.String login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.login(in0, in1, in2);
  }
  
  public void logout(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.logout(in0);
  }
  
  public java.lang.String getEnabledServices(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEnabledServices(in0);
  }
  
  public java.lang.String getLoginToken(java.lang.String sessionId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getLoginToken(sessionId);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchAccount(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchAccount(in0, in1);
  }
  
  public com.geocent.taleo.webapi.AccountBean getAccountById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAccountById(in0, in1);
  }
  
  public long createAccount(java.lang.String in0, com.geocent.taleo.webapi.AccountBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createAccount(in0, in1);
  }
  
  public void updateAccount(java.lang.String in0, com.geocent.taleo.webapi.AccountBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateAccount(in0, in1);
  }
  
  public void deleteAccount(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteAccount(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getBackgroundChecksByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getBackgroundChecksByCandidate(in0, in1);
  }
  
  public com.geocent.taleo.webapi.BackgroundCheckBean getBackgroundCheckById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getBackgroundCheckById(in0, in1);
  }
  
  public long createBackgroundCheck(java.lang.String in0, com.geocent.taleo.webapi.BackgroundCheckBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createBackgroundCheck(in0, in1);
  }
  
  public void updateBackgroundCheck(java.lang.String in0, com.geocent.taleo.webapi.BackgroundCheckBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateBackgroundCheck(in0, in1);
  }
  
  public void deleteBackgroundCheck(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteBackgroundCheck(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getEventByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEventByEntity(in0, in1, in2);
  }
  
  public com.geocent.taleo.webapi.LongArr getPublicEvents(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getPublicEvents(in0, in1, in2);
  }
  
  public com.geocent.taleo.webapi.CalendarEventBean getEventById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEventById(in0, in1);
  }
  
  public void updateEvent(java.lang.String in0, com.geocent.taleo.webapi.CalendarEventBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateEvent(in0, in1);
  }
  
  public void deleteEvent(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteEvent(in0, in1);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchCandidate(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchCandidate(in0, in1);
  }
  
  public com.geocent.taleo.webapi.CandidateBean getCandidateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandidateById(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getRequisitions(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRequisitions(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getOffers(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getOffers(in0, in1);
  }
  
  public long createCandidate(java.lang.String in0, com.geocent.taleo.webapi.CandidateBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createCandidate(in0, in1);
  }
  
  public void updateCandidate(java.lang.String in0, com.geocent.taleo.webapi.CandidateBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateCandidate(in0, in1);
  }
  
  public void setBinaryResume(java.lang.String in0, long in1, java.lang.String in2, com.geocent.taleo.webapi.ByteArr in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.setBinaryResume(in0, in1, in2, in3);
  }
  
  public com.geocent.taleo.webapi.ByteArr getBinaryResume(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getBinaryResume(in0, in1);
  }
  
  public void submitCandidate(java.lang.String in0, long in1, com.geocent.taleo.webapi.LongArr in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.submitCandidate(in0, in1, in2);
  }
  
  public void removeCandidate(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.removeCandidate(in0, in1, in2);
  }
  
  public void deleteCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteCandidate(in0, in1);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchContact(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchContact(in0, in1);
  }
  
  public com.geocent.taleo.webapi.ContactBean getContactById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getContactById(in0, in1);
  }
  
  public long createContact(java.lang.String in0, com.geocent.taleo.webapi.ContactBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createContact(in0, in1);
  }
  
  public void updateContact(java.lang.String in0, com.geocent.taleo.webapi.ContactBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateContact(in0, in1);
  }
  
  public void deleteContact(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteContact(in0, in1);
  }
  
  public com.geocent.taleo.webapi.HistoryBeanArr getCandidateHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandidateHistory(in0, in1);
  }
  
  public com.geocent.taleo.webapi.HistoryBeanArr getRequisitionHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRequisitionHistory(in0, in1);
  }
  
  public com.geocent.taleo.webapi.HistoryBeanArr getAccountHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAccountHistory(in0, in1);
  }
  
  public com.geocent.taleo.webapi.HistoryBeanArr getContactHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getContactHistory(in0, in1);
  }
  
  public com.geocent.taleo.webapi.HistoryBeanArr getUserHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getUserHistory(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getInterviewsByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getInterviewsByCandidate(in0, in1);
  }
  
  public com.geocent.taleo.webapi.InterviewBean getInterviewById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getInterviewById(in0, in1);
  }
  
  public long createInterview(java.lang.String in0, com.geocent.taleo.webapi.InterviewBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createInterview(in0, in1);
  }
  
  public void updateInterview(java.lang.String in0, com.geocent.taleo.webapi.InterviewBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateInterview(in0, in1);
  }
  
  public void deleteInterview(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteInterview(in0, in1);
  }
  
  public com.geocent.taleo.webapi.OfferBean getOfferById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getOfferById(in0, in1);
  }
  
  public long createOffer(java.lang.String in0, com.geocent.taleo.webapi.OfferBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createOffer(in0, in1);
  }
  
  public void updateOffer(java.lang.String in0, com.geocent.taleo.webapi.OfferBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateOffer(in0, in1);
  }
  
  public void setBinaryOffer(java.lang.String in0, long in1, java.lang.String in2, com.geocent.taleo.webapi.ByteArr in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.setBinaryOffer(in0, in1, in2, in3);
  }
  
  public com.geocent.taleo.webapi.ByteArr getBinaryOffer(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getBinaryOffer(in0, in1);
  }
  
  public void deleteOffer(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteOffer(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getReferencesByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getReferencesByCandidate(in0, in1);
  }
  
  public com.geocent.taleo.webapi.ReferenceBean getReferenceById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getReferenceById(in0, in1);
  }
  
  public void updateReference(java.lang.String in0, com.geocent.taleo.webapi.ReferenceBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateReference(in0, in1);
  }
  
  public void deleteReference(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteReference(in0, in1);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchRequisition(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchRequisition(in0, in1);
  }
  
  public com.geocent.taleo.webapi.RequisitionBean getRequisitionById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRequisitionById(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getCandidatesByRequisition(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandidatesByRequisition(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getAssociatedUsers(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAssociatedUsers(in0, in1, in2);
  }
  
  public long createRequisition(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createRequisition(in0, in1);
  }
  
  public void updateRequisition(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateRequisition(in0, in1);
  }
  
  public void setAssociatedUser(java.lang.String in0, long in1, java.lang.String in2, long in3, int in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.setAssociatedUser(in0, in1, in2, in3, in4);
  }
  
  public void removeAssociatedUser(java.lang.String in0, long in1, java.lang.String in2, long in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.removeAssociatedUser(in0, in1, in2, in3);
  }
  
  public void deleteRequisition(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteRequisition(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getTaskByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getTaskByEntity(in0, in1, in2);
  }
  
  public com.geocent.taleo.webapi.LongArr getTaskByUser(java.lang.String in0, long in1, java.util.Calendar in2, java.util.Calendar in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getTaskByUser(in0, in1, in2, in3);
  }
  
  public com.geocent.taleo.webapi.TaskBean getTaskById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getTaskById(in0, in1);
  }
  
  public void updateTask(java.lang.String in0, com.geocent.taleo.webapi.TaskBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateTask(in0, in1);
  }
  
  public void deleteTask(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteTask(in0, in1);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchUser(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchUser(in0, in1);
  }
  
  public com.geocent.taleo.webapi.UserBean getUserById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getUserById(in0, in1);
  }
  
  public long createUser(java.lang.String in0, com.geocent.taleo.webapi.UserBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createUser(in0, in1);
  }
  
  public long createUserWithPermissions(java.lang.String sessionId, com.geocent.taleo.webapi.UserBean userBeanToCreate, java.util.HashMap additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createUserWithPermissions(sessionId, userBeanToCreate, additionalEntities);
  }
  
  public void updateUser(java.lang.String in0, com.geocent.taleo.webapi.UserBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateUser(in0, in1);
  }
  
  public void deleteUser(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteUser(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getContactLogsByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getContactLogsByEntity(in0, in1, in2);
  }
  
  public com.geocent.taleo.webapi.ContactLogBean getContactLogById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getContactLogById(in0, in1);
  }
  
  public long createContactLog(java.lang.String in0, com.geocent.taleo.webapi.ContactLogBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createContactLog(in0, in1);
  }
  
  public long createEmailLog(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.util.Calendar in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createEmailLog(in0, in1, in2, in3, in4);
  }
  
  public long createEmailSentLog(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.util.Calendar in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createEmailSentLog(in0, in1, in2, in3, in4);
  }
  
  public void updateContactLog(java.lang.String in0, com.geocent.taleo.webapi.ContactLogBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateContactLog(in0, in1);
  }
  
  public void deleteContactLog(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteContactLog(in0, in1);
  }
  
  public java.util.HashMap getSystemProps(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getSystemProps(in0);
  }
  
  public java.lang.String getCandReqStatus(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandReqStatus(in0, in1, in2);
  }
  
  public java.lang.String parseResume(java.lang.String in0, com.geocent.taleo.webapi.ByteArr in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.parseResume(in0, in1);
  }
  
  public com.geocent.taleo.webapi.CandidateInsertResultBean parseResumeIntoCandidate(java.lang.String in0, com.geocent.taleo.webapi.ByteArr in1, java.lang.String referredBy, java.lang.String fileName) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.parseResumeIntoCandidate(in0, in1, referredBy, fileName);
  }
  
  public com.geocent.taleo.webapi.MetadataArr getMetadata(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getMetadata(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LookupArr getLookup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getLookup(in0, in1);
  }
  
  public void createLink(java.lang.String sessionId, java.lang.String entityType1, long entityId1, java.lang.String entityType2, long entityId2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.createLink(sessionId, entityType1, entityId1, entityType2, entityId2);
  }
  
  public void removeLink(java.lang.String sessionId, java.lang.String entityType1, long entityId1, java.lang.String entityType2, long entityId2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.removeLink(sessionId, entityType1, entityId1, entityType2, entityId2);
  }
  
  public long createAttachment(java.lang.String in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.geocent.taleo.webapi.ByteArr in5) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createAttachment(in0, in1, in2, in3, in4, in5);
  }
  
  public long createEntityAttachment(java.lang.String sessionId, java.lang.String entityType, long entityId, java.lang.String description, java.lang.String fileName, java.lang.String contentType, com.geocent.taleo.webapi.ByteArr data) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createEntityAttachment(sessionId, entityType, entityId, description, fileName, contentType, data);
  }
  
  public void updateAttachment(java.lang.String in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.geocent.taleo.webapi.ByteArr in5) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateAttachment(in0, in1, in2, in3, in4, in5);
  }
  
  public void deleteAttachment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteAttachment(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getAttachments(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAttachments(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LongArr getEntityAttachments(java.lang.String sessionId, java.lang.String entityType, long entityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEntityAttachments(sessionId, entityType, entityId);
  }
  
  public com.geocent.taleo.webapi.AttachmentBean getAttachment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAttachment(in0, in1);
  }
  
  public com.geocent.taleo.webapi.ByteArr getAttachmentData(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getAttachmentData(in0, in1);
  }
  
  public com.geocent.taleo.webapi.CandidateDetailsBean getCandidateDetailsById(java.lang.String in0, long in1, boolean in2, boolean in3, boolean in4, boolean in5, boolean in6, boolean in7) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandidateDetailsById(in0, in1, in2, in3, in4, in5, in6, in7);
  }
  
  public long createRequisitionTemplate(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createRequisitionTemplate(in0, in1);
  }
  
  public void postRequisition(java.lang.String sessionId, long requisitionId, long posterId, int formVersion) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.postRequisition(sessionId, requisitionId, posterId, formVersion);
  }
  
  public void unpostRequisition(java.lang.String sessionId, long requisitionId, long posterId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.unpostRequisition(sessionId, requisitionId, posterId);
  }
  
  public void upsertCandidateToRequisitions(java.lang.String sessionId, long candidateId, com.geocent.taleo.webapi.LongArr requisitionIds, long statusId, long reasonId, boolean doRanking) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.upsertCandidateToRequisitions(sessionId, candidateId, requisitionIds, statusId, reasonId, doRanking);
  }
  
  public com.geocent.taleo.webapi.SearchResultArr searchEmployee(java.lang.String sessionId, java.util.HashMap searchParams) throws java.rmi.RemoteException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.searchEmployee(sessionId, searchParams);
  }
  
  public void deleteEmployee(java.lang.String sessionId, long employeeId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteEmployee(sessionId, employeeId);
  }
  
  public void deleteEmployeeByNumber(java.lang.String sessionId, java.lang.String employeeNumber) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteEmployeeByNumber(sessionId, employeeNumber);
  }
  
  public long upsertEmployee(java.lang.String sessionId, java.lang.String employeeNumber, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.upsertEmployee(sessionId, employeeNumber, bean);
  }
  
  public com.geocent.taleo.webapi.EmployeeBean getEmployeeByNumber(java.lang.String sessionId, java.lang.String employeeNumber, java.util.Vector additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEmployeeByNumber(sessionId, employeeNumber, additionalEntities);
  }
  
  public com.geocent.taleo.webapi.EmployeeBean getEmployeeById(java.lang.String sessionId, long employeeId, java.util.Vector additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getEmployeeById(sessionId, employeeId, additionalEntities);
  }
  
  public long createEmployee(java.lang.String sessionId, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createEmployee(sessionId, bean);
  }
  
  public void updateEmployee(java.lang.String sessionId, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.updateEmployee(sessionId, bean);
  }
  
  public com.geocent.taleo.webapi.WorkHistoryArr getCandidateWorkHistory(java.lang.String sessionId, long candidateId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getCandidateWorkHistory(sessionId, candidateId);
  }
  
  public com.geocent.taleo.webapi.FlexRollingEntityBeanArr getRollingEntities(java.lang.String sessionId, java.lang.String rollingEntityType, java.lang.String entityType, long entityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRollingEntities(sessionId, rollingEntityType, entityType, entityId);
  }
  
  public long upsertRollingEntity(java.lang.String sessionId, com.geocent.taleo.webapi.FlexRollingEntityBean rollingEntityBean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.upsertRollingEntity(sessionId, rollingEntityBean);
  }
  
  public void deleteRollingEntity(java.lang.String sessionId, long rollingEntityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteRollingEntity(sessionId, rollingEntityId);
  }
  
  public java.lang.String loginPartner(java.lang.String orgCode, java.lang.String partnerCode, long currentTimeMillis, java.lang.String digest) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.loginPartner(orgCode, partnerCode, currentTimeMillis, digest);
  }
  
  public long createRegion(java.lang.String in0, com.geocent.taleo.webapi.RegionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createRegion(in0, in1);
  }
  
  public long createLocation(java.lang.String sessionId, com.geocent.taleo.webapi.LocationBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createLocation(sessionId, bean);
  }
  
  public long createDepartment(java.lang.String sessionId, com.geocent.taleo.webapi.DepartmentBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.createDepartment(sessionId, bean);
  }
  
  public com.geocent.taleo.webapi.RegionBean getRegionById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRegionById(in0, in1);
  }
  
  public com.geocent.taleo.webapi.DepartmentBean getDepartmentById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getDepartmentById(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LocationBean getLocationById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getLocationById(in0, in1);
  }
  
  public com.geocent.taleo.webapi.RegionBean getRegionByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRegionByName(in0, in1);
  }
  
  public com.geocent.taleo.webapi.DepartmentBean getDepartmentByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getDepartmentByName(in0, in1);
  }
  
  public com.geocent.taleo.webapi.LocationBean getLocationByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getLocationByName(in0, in1);
  }
  
  public void deleteRegion(java.lang.String in0, long regionId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteRegion(in0, regionId);
  }
  
  public void deleteLocation(java.lang.String sessionId, long locationId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteLocation(sessionId, locationId);
  }
  
  public void deleteDepartment(java.lang.String sessionId, long departmentId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    iWebAPI.deleteDepartment(sessionId, departmentId);
  }
  
  public com.geocent.taleo.webapi.RegionArr getRegions(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getRegions(in0);
  }
  
  public com.geocent.taleo.webapi.DepartmentArr getDepartments(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getDepartments(in0);
  }
  
  public com.geocent.taleo.webapi.LocationArr getLocations(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.getLocations(in0);
  }
  
  public long upsertRegion(java.lang.String sessionId, com.geocent.taleo.webapi.RegionBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.upsertRegion(sessionId, bean);
  }
  
  public long upsertLocation(java.lang.String sessionId, com.geocent.taleo.webapi.LocationBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.upsertLocation(sessionId, bean);
  }
  
  public long upsertDepartment(java.lang.String sessionId, com.geocent.taleo.webapi.DepartmentBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException{
    if (iWebAPI == null)
      _initIWebAPIProxy();
    return iWebAPI.upsertDepartment(sessionId, bean);
  }
  
  
}
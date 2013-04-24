package com.geocent.taleo.taleomigrator;

import com.geocent.taleo.dispatcher.DispatcherAPIServiceLocator;
import com.geocent.taleo.webapi.IWebAPI;
import com.geocent.taleo.webapi.IWebAPIServiceLocator;
import com.geocent.taleo.webapi.WebServicesException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.rpc.ServiceException;

/**
 * Simple driver to run the migration
 *
 */
public class TaleoMigratorMain {
    
    public static void main(String[] args) {
        String companyCode = args[0];
        String userName = args[1];
        String password = args[2];
        
        IWebAPI api = getWebAPI(companyCode);
        String session = getSession(api, companyCode, userName, password);
        
        CandidateStateConverter updator = new CandidateStateConverter(api, session);
        try {
            updator.updateCandidates();
            api.logout(session);
        } catch (RemoteException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static IWebAPI getWebAPI(String companyCode) {
        DispatcherAPIServiceLocator locator = new DispatcherAPIServiceLocator();
        
        String dispatcherURL;
        try {
            dispatcherURL = locator.getrpcrouter().getURL(companyCode);
            System.out.println("New URL to use " + dispatcherURL);
            IWebAPIServiceLocator webLocator = new IWebAPIServiceLocator();
            IWebAPI api = webLocator.getrpcrouter(new URL(dispatcherURL));
            return api;
            
        } catch (RemoteException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServiceException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    private static String getSession(IWebAPI api, String companyCode, String userName, String password) {
        try {
            String session = api.login(companyCode, userName, password);
            System.out.println("Session established " + session);
            return session;
        } catch (WebServicesException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(TaleoMigratorMain.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;
    }
}

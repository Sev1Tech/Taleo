/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geocent.taleo.taleomigrator;

import com.geocent.taleo.webapi.CandidateBean;
import com.geocent.taleo.webapi.IWebAPI;
import com.geocent.taleo.webapi.SearchResultArr;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 *
 * @author paul
 */
public abstract class CandidateStateManipulator {
    protected IWebAPI api;
    protected String session;
    
    public CandidateStateManipulator() {
    }

    protected SearchResultArr getCandidatesForState(String state) throws RemoteException {
        System.out.println("Getting candidates for state -- " + state + " --");
        HashMap searchCriteria = new HashMap();
        searchCriteria.put("state", state);
        SearchResultArr candidates = api.searchCandidate(session, searchCriteria);
        System.out.println("Found " + candidates.getArray().length + " candidates with state code " + state);
        return candidates;
    }

    protected abstract void updateCandidate(CandidateBean candidate, String state) throws RemoteException;

    public abstract void updateCandidates() throws RemoteException;
    
}

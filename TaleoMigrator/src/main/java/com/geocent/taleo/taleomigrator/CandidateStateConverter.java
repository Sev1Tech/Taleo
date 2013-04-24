/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geocent.taleo.taleomigrator;

import com.geocent.taleo.webapi.CandidateBean;
import com.geocent.taleo.webapi.IWebAPI;
import com.geocent.taleo.webapi.SearchResultArr;
import com.geocent.taleo.webapi.SearchResultBean;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author paul
 */
public class CandidateStateConverter extends CandidateStateManipulator {

    private Map<String, String> stateConversions;

    public CandidateStateConverter(IWebAPI api, String session) {
        this.api = api;
        this.session = session;
        this.stateConversions = new HashMap<String, String>();
        loadConversions();
    }

    public void updateCandidates() throws RemoteException {
        String[] dirtyStates = getSearchStates();
        for (String state : dirtyStates) {
            //search for candidates
            SearchResultArr cSearchResArr = getCandidatesForState(state);
            if (cSearchResArr != null) {
                SearchResultBean[] results = cSearchResArr.getArray();
                //loop through candidates
                for (SearchResultBean result : results) {
                    //get candidate by id
                    CandidateBean candidate = api.getCandidateById(session, result.getId());
                    //update candidate
                    updateCandidate(candidate, stateConversions.get(state));
                }
            }
        }
    }

    private String[] getSearchStates() {
        int dirtyStateCount = this.stateConversions.keySet().size();
        return this.stateConversions.keySet().toArray(new String[dirtyStateCount]);
    }

    private void loadConversions() {
        //random hand typed names
        this.stateConversions.put("Alabama", "US-AL");
        this.stateConversions.put("Florida", "US-FL");
        this.stateConversions.put("LA,", "US-LA");
        this.stateConversions.put("Louisiana", "US-LA");
        this.stateConversions.put("Maryland", "US-MD");
        this.stateConversions.put("South Carolina", "US-SC");
        this.stateConversions.put("Texas", "US-TX");
        this.stateConversions.put("NC.", "US-NC");

        //change typical codes to iso ones
        this.stateConversions.put("AK", "US-AK");
        this.stateConversions.put("AL", "US-AL");
        this.stateConversions.put("AR", "US-AR");
        this.stateConversions.put("AZ", "US-AZ");
        this.stateConversions.put("CA", "US-CA");
        this.stateConversions.put("CO", "US-CO");
        this.stateConversions.put("CT", "US-CT");
        this.stateConversions.put("DC", "US-DC");
        this.stateConversions.put("DE", "US-DE");
        this.stateConversions.put("FL", "US-FL");
        this.stateConversions.put("GA", "US-GA");
        this.stateConversions.put("HI", "US-HI");
        this.stateConversions.put("IA", "US-IA");
        this.stateConversions.put("ID", "US-ID");
        this.stateConversions.put("IL", "US-IL");
        this.stateConversions.put("IN", "US-IN");
        this.stateConversions.put("KS", "US-KS");
        this.stateConversions.put("KY", "US-KY");
        this.stateConversions.put("LA", "US-LA");
        this.stateConversions.put("MA", "US-MA");
        this.stateConversions.put("MD", "US-MD");
        this.stateConversions.put("ME", "US-ME");
        this.stateConversions.put("MI", "US-MI");
        this.stateConversions.put("MN", "US-MN");
        this.stateConversions.put("MO", "US-MO");
        this.stateConversions.put("MS", "US-MS");
        this.stateConversions.put("MT", "US-MT");
        this.stateConversions.put("NC", "US-NC");
        this.stateConversions.put("ND", "US-ND");
        this.stateConversions.put("NE", "US-NE");
        this.stateConversions.put("NH", "US-NH");
        this.stateConversions.put("NJ", "US-NJ");
        this.stateConversions.put("NM", "US-NM");
        this.stateConversions.put("NV", "US-NV");
        this.stateConversions.put("NY", "US-NY");
        this.stateConversions.put("OH", "US-OH");
        this.stateConversions.put("OK", "US-OK");
        this.stateConversions.put("OR", "US-OR");
        this.stateConversions.put("PA", "US-PA");
        this.stateConversions.put("RI", "US-RI");
        this.stateConversions.put("SC", "US-SC");
        this.stateConversions.put("SD", "US-SD");
        this.stateConversions.put("TN", "US-TN");
        this.stateConversions.put("TX", "US-TX");
        this.stateConversions.put("UT", "US-UT");
        this.stateConversions.put("VA", "US-VA");
        this.stateConversions.put("WA", "US-WA");
        this.stateConversions.put("WI", "US-WI");
        this.stateConversions.put("WV", "US-WV");
        this.stateConversions.put("WY", "US-WY");
    }

    @Override
    protected void updateCandidate(CandidateBean candidate, String state) throws RemoteException {
        System.err.println("Candidate before update " + candidate.getId() + ": " + candidate.getFirstName() + " " + candidate.getLastName() + " state = " + candidate.getState());
        //changes the state
        candidate.setState(state);
        api.updateCandidate(session, candidate);
        CandidateBean updated = api.getCandidateById(session, candidate.getId());
        System.err.println("Candidate after update " + updated.getId() + ": " + updated.getFirstName() + " " + updated.getLastName() + " state = " + updated.getState());
    }
}

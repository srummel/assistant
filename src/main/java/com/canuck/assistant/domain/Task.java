package com.canuck.assistant.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.canuck.assistant.interfaces.Cost;
import com.canuck.assistant.interfaces.Quantifiable;
import java.util.List;

/**
 *
 * @author public
 */
public class Task implements Quantifiable {

    private boolean completed;
    
    public Cost calculateCost(){return null;}
    
    public Cost calculateInvestment(){return null;}
    
    public Cost calculateROI(Cost cost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Task> retrieveByAssociatation(){
        return null;
    }
    
    public List<Activity> calculateSuccessCriteria() {
        return null;
    }

    public void calculateOpportunityCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void calculateTimeComittment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

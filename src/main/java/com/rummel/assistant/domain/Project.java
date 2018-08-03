package com.rummel.assistant.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.rummel.assistant.interfaces.Cost;
import com.rummel.assistant.interfaces.Quantifiable;
import java.util.List;

/**
 *
 * @author public
 */
public class Project implements Quantifiable{

    private List<Task> tasks;

    
    public void importTasks(List<Task> tasks){}

    public Cost calculateCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cost calculateROI(Cost cost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

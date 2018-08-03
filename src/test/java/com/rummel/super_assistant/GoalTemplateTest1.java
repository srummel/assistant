/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.super_assistant;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class GoalTemplateTest1 extends TestCase {
    
    public GoalTemplateTest1(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GoalTemplateTest1.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class App.
     */
    public void testScenario2() {
        
        // Define success criteria
        
        // Associate success criteria to a list of Activities
        
        // Define Key Process Indicators ( data points to collect during execution ) 
        
        // Implement KPI Retrieval Service to retrieve KPIs. 
        // Need to collect data points. 
        
        /// Present KPI to the User
        // Create data table to display to overview report
        // Need to determine core data to return
        
        // ##### Presentation of KPI historical data
        // Determines daily data points by collected data. For example, If only the 
        //  the first and last day of a month. It would stand to reason that 
        //  the progression of the values is linear. 
        
        // Create mechanism to collect data should be a plugin architecture.
        //  Will have multiple external sources.Need to be able to contain these 
        //  to not pollute the core functionality as well provide flexibility
        // Nice future spot for external integrations
        
        // Need to indicate Pass / Fail on progress
        
        // If Fail Identify possible solutions : increase income, decrease spending
        
        // What is the cost to get caught up with being aligned with progressing 
         // to a successfull goal achievement. 
        
        // Good indicator for Gap in timing or execution of plan
        
        
    }
}

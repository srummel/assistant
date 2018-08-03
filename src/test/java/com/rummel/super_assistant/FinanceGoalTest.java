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
public class FinanceGoalTest extends TestCase {
    
    public FinanceGoalTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FinanceGoalTest.class);
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
        
        
        // Create data table to display to overview report
        // define success criteria
        Criteria outgo = new FinancialOutGo();
        
        
        // Need to determine core data to return
        
        // Determine total debt
        
        // Determine current monthly outgo or split out to the day
        
        // Need to collect data points. 
        
        // Determines daily data points by collected data. For example, If only the 
        //  the first and last day of a month. It would stand to reason that 
        //  the progression of the values is linear. 
        
        // Create mechanism to collect data
        
        // Nice future spot for external integrations
        
        // Need to indicate Pass / Fail on progress
        
        // If Fail Identify possible solutions : increase income, decrease spending
        
        // What is the cost to get caught up with being aligned with progressing 
         // to a successfull goal achievement. 
        
        // Good indicator for Gap in timing or execution of plan
        
        
    }
}

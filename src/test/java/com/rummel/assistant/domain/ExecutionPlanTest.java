/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.domain;

import com.canuck.assistant.domain.ExecutionPlan;
import com.canuck.assistant.domain.Plan;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class ExecutionPlanTest extends TestCase {
    
    public ExecutionPlanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ExecutionPlanTest.class);
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
     * Test of getPlan method, of class ExecutionPlan.
     */
    public void testGetPlan() {
        System.out.println("getPlan");
        ExecutionPlan instance = new ExecutionPlan();
        Plan expResult = null;
        Plan result = instance.getPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

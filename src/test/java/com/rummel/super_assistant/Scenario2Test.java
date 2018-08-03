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
public class Scenario2Test extends TestCase {
    
    public Scenario2Test(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Scenario2Test.class);
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
        System.out.println("testScenario");
        fail("The test case is a prototype.");
    }
}

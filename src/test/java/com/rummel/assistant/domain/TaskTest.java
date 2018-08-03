/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.domain;

import com.rummel.assistant.interfaces.Cost;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class TaskTest extends TestCase {
    
    public TaskTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TaskTest.class);
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
     * Test of calculateCost method, of class Task.
     */
    public void testCalculateCost() {
        System.out.println("calculateCost");
        Task instance = new Task();
        Cost expResult = null;
        Cost result = instance.calculateCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateInvestment method, of class Task.
     */
    public void testCalculateInvestment() {
        System.out.println("calculateInvestment");
        Task instance = new Task();
        Cost expResult = null;
        Cost result = instance.calculateInvestment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateROI method, of class Task.
     */
    public void testCalculateROI() {
        System.out.println("calculateROI");
        Cost cost = null;
        Task instance = new Task();
        Cost expResult = null;
        Cost result = instance.calculateROI(cost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveByAssociatation method, of class Task.
     */
    public void testRetrieveByAssociatation() {
        System.out.println("retrieveByAssociatation");
        Task instance = new Task();
        List expResult = null;
        List result = instance.retrieveByAssociatation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSuccessCriteria method, of class Task.
     */
    public void testCalculateSuccessCriteria() {
        System.out.println("calculateSuccessCriteria");
        Task instance = new Task();
        List expResult = null;
        List result = instance.calculateSuccessCriteria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateOpportunityCost method, of class Task.
     */
    public void testCalculateOpportunityCost() {
        System.out.println("calculateOpportunityCost");
        Task instance = new Task();
        instance.calculateOpportunityCost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTimeComittment method, of class Task.
     */
    public void testCalculateTimeComittment() {
        System.out.println("calculateTimeComittment");
        Task instance = new Task();
        instance.calculateTimeComittment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

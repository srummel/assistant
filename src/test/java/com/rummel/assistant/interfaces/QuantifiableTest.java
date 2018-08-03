/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.interfaces;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class QuantifiableTest extends TestCase {
    
    public QuantifiableTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(QuantifiableTest.class);
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
     * Test of calculateCost method, of class Quantifiable.
     */
    public void testCalculateCost() {
        System.out.println("calculateCost");
        Quantifiable instance = new QuantifiableImpl();
        Cost expResult = null;
        Cost result = instance.calculateCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateROI method, of class Quantifiable.
     */
    public void testCalculateROI() {
        System.out.println("calculateROI");
        Cost cost = null;
        Quantifiable instance = new QuantifiableImpl();
        Cost expResult = null;
        Cost result = instance.calculateROI(cost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class QuantifiableImpl implements Quantifiable {

        public Cost calculateCost() {
            return null;
        }

        public Cost calculateROI(Cost cost) {
            return null;
        }
    }
}

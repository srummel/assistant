/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.interfaces;

import com.canuck.assistant.domain.Event;
import com.canuck.assistant.interfaces.Cost;
import com.canuck.assistant.interfaces.Costable;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class CostableTest extends TestCase {
    
    public CostableTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CostableTest.class);
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
     * Test of determineCost method, of class Costable.
     */
    public void testDetermineCost() {
        System.out.println("determineCost");
        Event event = null;
        Costable instance = new CostableImpl();
        Cost expResult = null;
        Cost result = instance.determineCost(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CostableImpl implements Costable {

        public Cost determineCost(Event event) {
            return null;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.services;

import com.canuck.assistant.domain.OpportunityCost;
import com.canuck.assistant.domain.Task;
import com.canuck.assistant.services.CostService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class CostServiceTest extends TestCase {
    
    public CostServiceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CostServiceTest.class);
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
     * Test of calculateForHours method, of class CostService.
     */
    public void testCalculateForHours() {
        System.out.println("calculateForHours");
        Task task = null;
        CostService instance = new CostService();
        OpportunityCost expResult = null;
        OpportunityCost result = instance.calculateForHours(task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

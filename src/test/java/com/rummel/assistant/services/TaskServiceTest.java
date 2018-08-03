/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.services;

import com.rummel.assistant.domain.Activity;
import com.rummel.assistant.interfaces.Cost;
import com.sun.jmx.snmp.tasks.Task;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class TaskServiceTest extends TestCase {
    
    public TaskServiceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TaskServiceTest.class);
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
     * Test of quantify method, of class TaskService.
     */
    public void testQuantify() {
        System.out.println("quantify");
        Activity activity = null;
        TaskService instance = new TaskService();
        Cost expResult = null;
        Cost result = instance.quantify(activity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievebyTag method, of class TaskService.
     */
    public void testRetrievebyTag() {
        System.out.println("retrievebyTag");
        String tag = "";
        TaskService instance = new TaskService();
        Task expResult = null;
        Task result = instance.retrievebyTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

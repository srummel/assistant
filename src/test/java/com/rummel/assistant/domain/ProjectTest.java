/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.domain;

import com.canuck.assistant.domain.Project;
import com.canuck.assistant.domain.Task;
import com.canuck.assistant.interfaces.Cost;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class ProjectTest extends TestCase {
    
    public ProjectTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProjectTest.class);
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
     * Test of importTasks method, of class Project.
     */
    public void testImportTasks() {
        System.out.println("importTasks");
        List<Task> tasks = null;
        Project instance = new Project();
        instance.importTasks(tasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCost method, of class Project.
     */
    public void testCalculateCost() {
        System.out.println("calculateCost");
        Project instance = new Project();
        Cost expResult = null;
        Cost result = instance.calculateCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateROI method, of class Project.
     */
    public void testCalculateROI() {
        System.out.println("calculateROI");
        Cost cost = null;
        Project instance = new Project();
        Cost expResult = null;
        Cost result = instance.calculateROI(cost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

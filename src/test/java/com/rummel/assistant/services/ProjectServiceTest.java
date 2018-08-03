/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.services;

import com.rummel.assistant.domain.Project;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class ProjectServiceTest extends TestCase {
    
    public ProjectServiceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProjectServiceTest.class);
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
     * Test of create method, of class ProjectService.
     */
    public void testCreate() {
        System.out.println("create");
        Project project = null;
        ProjectService instance = new ProjectService();
        instance.create(project);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.associations;

import com.rummel.assistant.domain.Task;
import com.rummel.assistant.domain.User;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class UserTasksTest extends TestCase {
    
    public UserTasksTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserTasksTest.class);
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
     * Test of associate method, of class UserTasks.
     */
    public void testAssociate() {
        System.out.println("associate");
        User user = null;
        Task task = null;
        UserTasks instance = new UserTasks();
        instance.associate(user, task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

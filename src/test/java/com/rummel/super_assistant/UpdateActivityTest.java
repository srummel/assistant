/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.super_assistant;

import com.rummel.assistant.dao.MorningWeatherReport;
import com.rummel.assistant.domain.Consumer;
import com.rummel.assistant.domain.Action;
import com.rummel.assistant.domain.Activity;
import com.rummel.assistant.domain.Response;
import com.rummel.assistant.services.ActivityService;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author public
 */
public class UpdateActivityTest extends TestCase {
    
    public UpdateActivityTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UpdateActivityTest.class);
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
    public void testScenario1() {
        System.out.println("testScenario1");
        
        //  Should there be an overarching class / container 
        // Flow of a given day
        // First screen will be dependant on the time of day and activity
        // Algorithm to present screen in situationally appropriate manner
        // Provide screens for the system to ask questions
        // One screen will be a first of day screen
        // Determine first of day activities
        // Retrieve activities that have been indicated to be first of day activities
        // Note: need to have a system to query the user for First of day activities
        ActivityService activityService  = new ActivityService();
       List<Action> firstOfDay  =  activityService.retrieveByTag("First of Day", true);
       firstOfDay.add(new MorningWeatherReport());
       
       // This should be moved to a queue. For now simply execute them linearally
       for(Action action: firstOfDay){
           Response response;
            response = action.execute();
            // Consumer is a property of the action.
            action.processResponse(response);
       }
       
        
        
        
        fail("The test case is a prototype.");
    }
}

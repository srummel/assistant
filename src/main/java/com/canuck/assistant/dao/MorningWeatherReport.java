/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canuck.assistant.dao;

import com.canuck.assistant.domain.Action;

/**
 *
 * @author public
 */
public class MorningWeatherReport extends Action {
    public static final String WEATHER__SERVICE_NAME = "Weather_Service";

 public MorningWeatherReport(){
     super(WEATHER__SERVICE_NAME);
 }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.interfaces;

import com.rummel.assistant.domain.Event;

/**
 *
 * @author public
 */
public interface Costable {

    
    Cost determineCost(Event event);
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canuck.assistant.interfaces;

import com.canuck.assistant.domain.Event;

/**
 *
 * @author public
 */
public interface Costable {

    
    Cost determineCost(Event event);
    
}

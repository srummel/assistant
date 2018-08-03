/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rummel.assistant.interfaces;

/**
 *
 * @author public
 */
public interface Quantifiable {
 
    Cost calculateCost();
    Cost calculateROI(Cost cost);
   
}

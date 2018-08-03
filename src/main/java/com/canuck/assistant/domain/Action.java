/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canuck.assistant.domain;

import com.canuck.assistant.interfaces.Executable;

/**
 *
 * @author public
 */
public abstract class Action extends Activity implements Executable {

    private Consumer consumer;

    public Action(String name) {
        super(name);
    }

    public abstract Response execute();
    /**
     *
     * @param response
     */
    public abstract void processResponse(Response response);

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

}

package pl.jrola.trainings.beans;

/**
 * Created by JrQ- on 2016-08-14.
 */
public class ScopeBean {

    protected int instanceCounter = 0;

    public int incrementCounter() {
        instanceCounter++;
        return instanceCounter;
    }

}

package Operators;

import Utils.State;

/**
 * Created by tonidias on 24.11.15.
 */
public abstract class Operator {
    protected State state;
    public abstract void execute();
}

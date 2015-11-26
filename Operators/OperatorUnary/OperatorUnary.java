package Operators.OperatorUnary;

import Operators.Operator;

/**
 * Created by tonidias on 24.11.15.
 */
public class OperatorUnary extends Operator {
    double val;

    public OperatorUnary(State s){
        state = s;
    }

    @Override
    void execute() {
        state.storeInStack = true;
    }
}

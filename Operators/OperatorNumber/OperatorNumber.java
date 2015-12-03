package Operators.OperatorNumber;

import Operators.Operator;
import Utils.State;

/**
 * Created by tonidias on 26.11.15.
 */
public class OperatorNumber extends Operator {
    State state;

    public OperatorNumber(State s){
        state = s;
    }

    @Override
    public void execute() {
        if(true == state.isStoreInStack()){
            state.getStack().push(Double.parseDouble(state.getTexte()));
            state.setStoreInStack(false);
            state.setTexte("0");
        }
    }
}

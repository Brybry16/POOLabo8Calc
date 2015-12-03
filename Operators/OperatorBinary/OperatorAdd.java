package Operators.OperatorBinary;

import Utils.State;

/**
 * Created by tonidias on 24.11.15.
 */
public class OperatorAdd extends OperatorBinary {
    public OperatorAdd(State s){
        super(s);
    }

    @Override
    public void execute() {
        super.execute();
        double test = val1 + val2;
        state.setTexte(String.valueOf(test));
        state.setStoreInStack(true);
    }
}

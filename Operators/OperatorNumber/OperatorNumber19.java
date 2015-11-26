package Operators.OperatorNumber;

import Utils.State;

/**
 * Created by tonidias on 26.11.15.
 */
public class OperatorNumber19 extends OperatorNumber{
    int number;
    public OperatorNumber19(State s, int n){
        super(s);
        number = n;
    }

    @Override
    public void execute() {
        super.execute();
        state.setTexte(state.getTexte() + number);
    }
}

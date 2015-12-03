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
        if(0 != Double.parseDouble(state.getTexte()))
            state.setTexte(state.getTexte() + number);
        else{
            state.setTexte(String.valueOf(number));
        }
    }
}

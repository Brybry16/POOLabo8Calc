package Operators.OperatorUnary;

import Utils.State;

/**
 * Created by tonidias on 07.12.15.
 */
public class OperatorSquareRoot extends OperatorUnary {
    public OperatorSquareRoot(State s) {
        super(s);
    }

    @Override
    public void execute() throws Exception {
        super.execute();
        double temp = Double.parseDouble(state.getTexte());
        temp = Math.pow(temp,1/2);
        state.setTexte(String.valueOf(temp));
    }
}

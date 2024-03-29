package Operators.OperatorUnary;

import Utils.State;

/**
 * Created by tonidias on 07.12.15.
 */
public class OperatorSquare extends OperatorUnary{
    @Override
    public void execute() throws Exception {
        super.execute();
    }

    public OperatorSquare(State s) {
        super(s);
        double temp = Double.parseDouble(state.getTexte());
        temp = Math.pow(temp, 2);
        state.setTexte(String.valueOf(temp));
    }
}

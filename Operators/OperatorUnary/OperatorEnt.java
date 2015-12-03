package Operators.OperatorUnary;

import Utils.State;

/**
 * Created by tonidias on 26.11.15.
 */
public class OperatorEnt extends OperatorUnary{

    public OperatorEnt(State s) {
        super(s);
    }

    @Override
    public void execute() {
        super.execute();
        state.getStack().push(state.getTexte());
        state.setTexte("0");
    }


}

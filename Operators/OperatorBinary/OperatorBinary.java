package Operators.OperatorBinary;

import Operators.Operator;
import Utils.State;

/**
 * Created by tonidias on 24.11.15.
 */
public class OperatorBinary extends Operator {

    protected double val1;
    protected double val2;

    public OperatorBinary(State s){
        state = s;
    }


    @Override
    public void execute() {
        val1 = Double.parseDouble(state.getStack().pop().toString());
        System.out.println(val1);
        val2 = Double.parseDouble(state.getTexte());

        System.out.println(val1 + " " + val2);
    }
}

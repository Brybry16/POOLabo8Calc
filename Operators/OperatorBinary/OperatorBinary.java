package Operators.OperatorBinary;

import Operators.Operator;

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
    void execute() {
        val1 = (double) state.stack.pop();
        val2 = Double.parseDouble(state.texte);

        System.out.println(val1 +" " + val2);
    }
}

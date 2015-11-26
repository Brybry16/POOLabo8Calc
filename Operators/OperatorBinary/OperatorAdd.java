package Operators.OperatorBinary;

/**
 * Created by tonidias on 24.11.15.
 */
public class OperatorAdd extends OperatorBinary {
    public OperatorAdd(State s){
        super(s);
    }

    @Override
    void execute() {
        super.execute();
        double test = val1 + val2;
    }
}

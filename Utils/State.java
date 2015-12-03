package Utils;

import javax.swing.*;
import java.util.Stack;

/**
 * Created by tonidias on 24.11.15.
 */
public class State {
    Double ms = null;
    Stack stack;
    String texte = "0";
    boolean storeInStack = false;

    public State(Stack s){
        stack = s;
    }

    public Double getMs() {
        return ms;
    }

    public Stack getStack() {
        return stack;
    }

    public String getTexte() {
        return texte;
    }

    public boolean isStoreInStack() {
        return storeInStack;
    }

    public void setMs(Double ms) {
        this.ms = ms;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void setStoreInStack(boolean storeInStack) {
        this.storeInStack = storeInStack;
    }
}

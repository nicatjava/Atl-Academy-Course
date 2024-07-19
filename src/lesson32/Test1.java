package lesson32;

import java.util.Deque;
import java.util.LinkedList;

public class Test1 {

    private static Deque<Operation> myDeque = new LinkedList<>();
    public static void main(String[] args) {
        doOperation(getRandomOperation());
        doOperation(getRandomOperation());
        doOperation(getRandomOperation());
        System.out.println(myDeque);
        ctrlZ();
        System.out.println(myDeque);
    }

    public enum Operation {
        END,
        UNDO,
        REDO,
        HOME,
        ENTER,
        RENAME,
        DELETE;
    }

    public static Operation getRandomOperation() {
        final int random = (int) (Math.random() * Operation.values().length);
        return Operation.values()[random];
    }

    public static void doOperation(Operation operation){
        myDeque.push(operation);
    }

    public static void ctrlZ(){
        myDeque.pop();
    }

}

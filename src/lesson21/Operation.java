package lesson21;

public enum Operation {
    SUM ('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MODULUS('%'),
    DEFAULT ;

    private char c;

    Operation() {
        this.c = c;
    }

    Operation(char c) {
    this.c = c;
    }


    public static Operation getOperation(char c){
        if (c == '+') return Operation.SUM;
        else if (c == '-') return Operation.SUBTRACT;
        else if (c == '*') return Operation.MULTIPLY;
        else if (c == '/') return Operation.DIVIDE;
        else if (c == '%') return Operation.MODULUS;
        else return Operation.DEFAULT;
    }
}

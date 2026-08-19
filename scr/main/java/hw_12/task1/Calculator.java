package hw_12.task1;

public class Calculator {

    private int one;
    private int two;
    private String operation;

    public Calculator(int one, int two, String operation) {
        this.one = one;
        this.two = two;
        this.operation = operation;
    }

    public int calculate() {

        if (operation.equals("-")) {
            return one - two;
        } else if (operation.equals("+")) {
            return one + two;
        } else if (operation.equals("*")) {
            return one * two;
        } else if (operation.equals("/")) {
            if (two == 0) {
                throw new DivisionByZeroException("Can`t division on zero");
            }
            return one / two;
        } else {
            throw new UnknownCalculatorException("The operation argument is incorrect!!!");
        }

    }


}

package com.zingsrepo.learning;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        CalcOperator<Integer, Integer> operator = new CalcOperator<>(1, 1);
        CalcInterface<Integer, Integer> calcInterface = (x1, x2) -> {
            return x1 + x2;
        };
        System.out.println(operator.calc(calcInterface));
        System.out.println(operator.calc((x1, x2) -> {
            return x1 - x2;
        }));
        System.out.println(operator.calc((x1, x2) -> x1 * x2));
        System.out.println(operator.calc((x1, x2) -> x1 / x2));
    }
}

@FunctionalInterface
interface CalcInterface<X, Y> {
    Y operate(X x1, X x2);
}

class CalcOperator<X extends Number, Y extends Number> {

    private X x1;
    private X x2;

    public CalcOperator(X x1, X x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Y calc(CalcInterface<X, Y> calcInterface) {
        Y y = calcInterface.operate(x1, x2);
        return y;
    }
}

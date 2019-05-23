package com.zingsrepo.learning;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        System.out.println(calc.add(1, 1));
        // System.out.println(Calc.add(1, 1));
        System.out.println(Calc.multiply(1, 1));
        // System.out.println(calc.multiply(1, 1)); // Can only be invoked by class.
    }
}

interface Calc {
    default int add(int x, int y) {
        return x + y;
    }
    static int multiply(int x, int y) {
        return x * y;
    }
}

class CalcImpl implements Calc {}

package org.forest.aop;

public class MathCalculator {

    public int div(int i, int j) {

        System.out.println("Math Calculator...div");
        return i / j;
    }

    public int multiply(int i, int j) {
        System.out.println("Math Calculator...multiply");
        return i * j;
    }
}

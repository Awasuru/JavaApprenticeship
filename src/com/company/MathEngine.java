package com.company;

public class MathEngine {
    int a;
    int b;

    public MathEngine(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printSum() {
        System.out.println(sum());
    }

    public void printSubstraction() {
        System.out.println(substract());
    }

    public void printMultiplication() {
        System.out.println(multiply());
    }

    public void printDivision() {
        System.out.println(divide());
    }

    public void printExponentiation() {
        System.out.println(exponentiation());
    }

    public void printSqrt() {
        System.out.println(squareRoot());
    }

    private int sum() {
        return a + b;
    }

    private int substract() {
        return a - b;
    }

    private int multiply() {
        return a * b;
    }

    private int divide() {
        return a / b;
    }

    private int exponentiation() {
        int c = a;
        while (b > 1) {
            c *= a;
            b--;
        }
        return c;
    }

    private double squareRoot() {
        return Math.sqrt(a);
    }
}
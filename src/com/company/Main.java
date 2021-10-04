package com.company;

public class Main {
    static MathEngine mathEngine;
    public static void main(String[] args) {
        Student[] personalData = {new Student("Paweł", "Żurek", 17, 3)};
        for (Student x : personalData) {
            System.out.println(x.name);
            System.out.println(x.surname);
            System.out.println(x.age);
            System.out.println(x.classs);
        }
        Teacher[] teacherData = {new Teacher("Tomek", "Twardowski", 43)};
        for (Teacher x : teacherData) {
            System.out.println(x.name);
            System.out.println(x.surname);
            System.out.println(x.age);
        }
        innitMathEngine();
        System.out.println(isDoorOpen());
        mathEngine.printSum();
        mathEngine.printSubstraction();
        mathEngine.printMultiplication();
        mathEngine.printDivision();
        mathEngine.printExponentiation();
        mathEngine.printSqrt();

    }

    private static boolean isDoorOpen() {
        return true;
    }
    private static void innitMathEngine() {
        mathEngine = new MathEngine(2, 3);
    }
}

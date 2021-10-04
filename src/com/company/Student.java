package com.company;

public final class Student extends Person{
    int classs;

    public Student(String name, String surname, int age, int classs) {
        super(name, surname, age);
        this.classs = classs;
    }
}

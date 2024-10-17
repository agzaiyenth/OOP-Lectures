package com.iit.oop;

public class Student extends Person {

    private int age;
    private double grade;
    public Student(String name, int age, double grade) {
        super(name,age);
        this.grade = grade;
    }
    public void displayDetails(){
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public boolean hasPassed(){
        return grade >= 50;
    }
}

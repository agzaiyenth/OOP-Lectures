package com.iit.oop;

public class Teacher extends Person {
    private double salary;
    private String Subject;
    public Teacher(String firstName, int age, double salary, String Subject) {
        super(firstName, age);
        this.salary = salary;
        this.Subject = Subject;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;

    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", Subject='" + Subject + '\'' +
                '}'+"\n"+super.toString();
    }
}

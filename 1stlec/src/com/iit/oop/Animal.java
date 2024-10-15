package com.iit.oop;

public class Animal {
    private String name;
    private int age;
    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eats(){
        System.out.println("eats anything");
    }
}

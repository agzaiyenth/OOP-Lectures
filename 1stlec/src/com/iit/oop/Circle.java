package com.iit.oop;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius=1.0;
        color= "blue";
    }
    public Circle(double radius) {
        this.radius = radius;
        color= "blue";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";

    }
}

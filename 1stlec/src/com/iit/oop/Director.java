package com.iit.oop;


public class Director extends Movie{

    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date Dob;

    public Director(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public Date getDob() {
        return Dob;
    }

    @Override
    public String toString() {
        return "Director [" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numDirectedMovie=" + numDirectedMovie +
                ", Dob=" + Dob +
                ']';
    }
}

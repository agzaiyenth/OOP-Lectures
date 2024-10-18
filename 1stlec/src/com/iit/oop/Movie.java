package com.iit.oop;

public class Movie {
    Actor [] listActor=new Actor[10];
    private String title;
    private String category;
    private Director director;
    private int numAward;

    public Movie(){}
    public Movie(String title,String category,Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
    }

    public void setNumAward(int numAward) {
        this.numAward = numAward;
    }
    public int getNumAward() {
        return numAward;
    }


    @Override
    public String toString() {
        return "Movie "+title+"\nCategory "+category+"\nNo of Awards "+numAward;
    }

}

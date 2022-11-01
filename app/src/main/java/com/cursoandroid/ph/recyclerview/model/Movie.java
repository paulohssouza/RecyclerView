package com.cursoandroid.ph.recyclerview.model;

public class Movie {
    private String title, gender, year;

    public Movie() {

    }

    public Movie(String title, String gender, String year) {
        this.title = title;
        this.gender = gender;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

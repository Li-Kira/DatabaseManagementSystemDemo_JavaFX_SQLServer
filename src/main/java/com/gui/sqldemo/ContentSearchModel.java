package com.gui.sqldemo;

public class ContentSearchModel {

    String title,language,rating,country,release,resolution,introduction,anothername;

    int duration;
    float score;

    public ContentSearchModel(String title,String language,String rating,String country,String release
    ,int duration,float score,String resolution,String introduction,String anothername){
        this.title = title;
        this.language = language;
        this.rating = rating;
        this.country = country;
        this.release = release;
        this.duration = duration;
        this.score = score;
        this.resolution = resolution;
        this.introduction = introduction;
        this.anothername = anothername;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getRating() {
        return rating;
    }

    public String getCountry() {
        return country;
    }

    public String getRelease() {
        return release;
    }

    public String getResolution() {
        return resolution;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getAnothername() {
        return anothername;
    }

    public int getDuration() {
        return duration;
    }

    public float getScore() {
        return score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setAnothername(String anothername) {
        this.anothername = anothername;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setScore(float score) {
        this.score = score;
    }
}

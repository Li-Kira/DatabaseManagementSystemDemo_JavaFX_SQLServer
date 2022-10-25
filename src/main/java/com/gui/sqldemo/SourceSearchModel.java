package com.gui.sqldemo;

public class SourceSearchModel {
    String title,director,producer,screenwriter,cast,publisher;

    public SourceSearchModel(String Title,String Director,String Producer,String Screenwriter,String Cast
    ,String Publisher){

        this.title = Title;
        this.director = Director;
        this.producer = Producer;
        this.screenwriter = Screenwriter;
        this.cast = Cast;
        this.publisher = Publisher;
    }



    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getScreenwriter() {
        return screenwriter;
    }

    public String getCast() {
        return cast;
    }

    public String getPublisher() {
        return publisher;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setScreenwriter(String screenwriter) {
        this.screenwriter = screenwriter;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

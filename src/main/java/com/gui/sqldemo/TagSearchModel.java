package com.gui.sqldemo;

public class TagSearchModel {
    String title,tag;
    public TagSearchModel(String title,String tag){
        this.title = title;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public String getTag() {
        return tag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

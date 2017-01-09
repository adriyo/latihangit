package com.example.admin.myapplication.model;

/**
 * Created by Admin on 1/6/2017.
 */

public class items {
    private String title;
    private String url;

    public items(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

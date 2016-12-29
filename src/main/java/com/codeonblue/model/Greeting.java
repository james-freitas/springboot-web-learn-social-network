package com.codeonblue.model;

public class Greeting {
    private String text;
    private Object id;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
}

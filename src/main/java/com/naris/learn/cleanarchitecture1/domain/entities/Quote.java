package com.naris.learn.cleanarchitecture1.domain.entities;

public class Quote {
    int id;
    String sentence;
    String author;

    public Quote(int id, String sentence, String author) {
        this.id = id;
        this.sentence = sentence;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

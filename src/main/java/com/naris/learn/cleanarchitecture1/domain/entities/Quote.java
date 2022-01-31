package com.naris.learn.cleanarchitecture1.domain.entities;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;

public class Quote {
    private int id;
    private String sentence;
    private String author;

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

    public RequestQuote toRequestQuote() {
        return new RequestQuote(this.getId(), this.getSentence(), this.getAuthor());
    }
}

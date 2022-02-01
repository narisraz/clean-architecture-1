package com.naris.learn.cleanarchitecture1.domain.entities.request;

public class RequestQuote {
    private int id;
    private String sentence;
    private String author;

    public RequestQuote(int id, String sentence, String author) {
        this.id = id;
        this.sentence = sentence;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getSentence() {
        return sentence;
    }

    public String getAuthor() {
        return author;
    }
}

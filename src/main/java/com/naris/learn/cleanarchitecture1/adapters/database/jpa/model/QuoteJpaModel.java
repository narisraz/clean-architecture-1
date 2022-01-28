package com.naris.learn.cleanarchitecture1.adapters.database.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuoteJpaModel {
    @Id @GeneratedValue
    private int id;
    private String sentence;
    private String author;

    public QuoteJpaModel() {
    }

    public QuoteJpaModel(int id, String sentence, String author) {
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

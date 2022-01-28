package com.naris.learn.cleanarchitecture1.domain.ports.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;

import java.util.List;

public interface RequestQuoteInputBoundary {
    List<Quote> getAll();
    Quote getOne(int id);
}

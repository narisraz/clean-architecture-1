package com.naris.learn.cleanarchitecture1.ports.database;

import com.naris.learn.cleanarchitecture1.entities.Quote;

import java.util.List;

public interface QuoteGateway {
    List<Quote> getAll();
    Quote getOne(int id);
    Quote save(Quote quote);
}

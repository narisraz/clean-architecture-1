package com.naris.learn.cleanarchitecture1.domain.ports.database;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;

import java.util.List;

public interface QuoteGateway {
    List<Quote> getAll();
    Quote getOne(int id);
    Quote save(Quote quote);
}

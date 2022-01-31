package com.naris.learn.cleanarchitecture1.domain.ports.database;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;

import java.util.List;
import java.util.Optional;

public interface QuoteGateway {
    List<Quote> getAll();
    Optional<Quote> getOne(int id);
    Quote save(Quote quote);
}

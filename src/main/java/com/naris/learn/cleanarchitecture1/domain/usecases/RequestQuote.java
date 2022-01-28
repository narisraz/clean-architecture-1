package com.naris.learn.cleanarchitecture1.domain.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;
import com.naris.learn.cleanarchitecture1.domain.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.RequestQuoteInputBoundary;

import java.util.List;

public class RequestQuote implements RequestQuoteInputBoundary {

    QuoteGateway quoteGateway;

    public RequestQuote(QuoteGateway quoteRepository) {
        this.quoteGateway = quoteRepository;
    }

    @Override
    public List<Quote> getAll() {
        return quoteGateway.getAll();
    }

    @Override
    public Quote getOne(int id) {
        return quoteGateway.getOne(id);
    }
}

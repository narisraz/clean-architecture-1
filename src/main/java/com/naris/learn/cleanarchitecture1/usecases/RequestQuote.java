package com.naris.learn.cleanarchitecture1.usecases;

import com.naris.learn.cleanarchitecture1.entities.Quote;
import com.naris.learn.cleanarchitecture1.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.ports.usecases.RequestQuoteInputBoundary;

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

package com.naris.learn.cleanarchitecture1.usecases;

import com.naris.learn.cleanarchitecture1.entities.Quote;
import com.naris.learn.cleanarchitecture1.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.ports.usecases.SaveQuoteInputBoundary;

public class SaveQuote implements SaveQuoteInputBoundary {

    private QuoteGateway quoteGateway;

    public SaveQuote(QuoteGateway quoteRepository) {
        this.quoteGateway = quoteRepository;
    }

    @Override
    public Quote save(Quote quote) {
        return quoteGateway.save(quote);
    }
}

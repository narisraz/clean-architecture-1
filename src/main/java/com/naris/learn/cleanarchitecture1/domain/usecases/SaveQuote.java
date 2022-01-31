package com.naris.learn.cleanarchitecture1.domain.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;
import com.naris.learn.cleanarchitecture1.domain.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.domain.ports.presenters.QuotePresenter;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.SaveQuoteInputBoundary;

public class SaveQuote implements SaveQuoteInputBoundary {

    private QuotePresenter presenter;
    private QuoteGateway quoteGateway;

    public SaveQuote(QuoteGateway quoteGateway, QuotePresenter presenter) {
        this.quoteGateway = quoteGateway;
        this.presenter = presenter;
    }

    @Override
    public ResponseQuote save(RequestQuote requestQuote) {
        return presenter.presentSuccess(quoteGateway.save(requestQuote.toQuote()).toRequestQuote());
    }
}

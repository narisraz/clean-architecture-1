package com.naris.learn.cleanarchitecture1.domain.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;
import com.naris.learn.cleanarchitecture1.domain.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.domain.ports.presenters.QuotePresenter;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.ReadQuoteInputBoundary;

import java.util.List;
import java.util.stream.Collectors;

public class ReadQuote implements ReadQuoteInputBoundary {

    QuoteGateway quoteGateway;
    QuotePresenter presenter;

    public ReadQuote(QuoteGateway quoteGateway, QuotePresenter presenter) {
        this.quoteGateway = quoteGateway;
        this.presenter = presenter;
    }

    @Override
    public List<ResponseQuote> getAll() {
        return quoteGateway.getAll().stream()
                .map(Quote::toRequestQuote)
                .map(presenter::presentSuccess)
                .collect(Collectors.toList());
    }

    @Override
    public ResponseQuote getOne(int id) {
        return quoteGateway.getOne(id)
                .map(Quote::toRequestQuote)
                .map(presenter::presentSuccess)
                .orElseGet(() -> presenter.presentFail("Quote not found"));
    }
}

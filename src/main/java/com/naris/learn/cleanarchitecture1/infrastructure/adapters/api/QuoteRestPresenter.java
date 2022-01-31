package com.naris.learn.cleanarchitecture1.infrastructure.adapters.api;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;
import com.naris.learn.cleanarchitecture1.domain.ports.presenters.QuotePresenter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class QuoteRestPresenter implements QuotePresenter {
    @Override
    public ResponseQuote presentSuccess(RequestQuote requestQuote) {
        return new ResponseQuote(requestQuote.getId(), requestQuote.getSentence(), requestQuote.getAuthor());
    }

    @Override
    public ResponseQuote presentFail(String message) {
        HttpStatus status = switch (message) {
            case "Quote not found" -> HttpStatus.NOT_FOUND;
            default -> HttpStatus.INTERNAL_SERVER_ERROR;
        };
        throw new ResponseStatusException(status, message);
    }
}

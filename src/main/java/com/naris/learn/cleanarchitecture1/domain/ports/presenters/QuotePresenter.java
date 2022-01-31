package com.naris.learn.cleanarchitecture1.domain.ports.presenters;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;

public interface QuotePresenter {
    ResponseQuote presentSuccess(RequestQuote requestQuote);
    ResponseQuote presentFail(String message);
}

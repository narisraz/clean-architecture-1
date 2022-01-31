package com.naris.learn.cleanarchitecture1.domain.ports.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;

public interface SaveQuoteInputBoundary {
    ResponseQuote save(RequestQuote requestQuote);
}

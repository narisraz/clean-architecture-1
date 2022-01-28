package com.naris.learn.cleanarchitecture1.domain.ports.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;

public interface SaveQuoteInputBoundary {
    Quote save(Quote quote);
}

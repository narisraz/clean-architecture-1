package com.naris.learn.cleanarchitecture1.ports.usecases;

import com.naris.learn.cleanarchitecture1.entities.Quote;

public interface SaveQuoteInputBoundary {
    Quote save(Quote quote);
}

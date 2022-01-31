package com.naris.learn.cleanarchitecture1.domain.ports.usecases;

import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;

import java.util.List;

public interface ReadQuoteInputBoundary {
    ResponseQuote getOne(int id);
    List<ResponseQuote> getAll();
}

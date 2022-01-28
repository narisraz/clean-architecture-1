package com.naris.learn.cleanarchitecture1.adapters.api;

import com.naris.learn.cleanarchitecture1.entities.Quote;
import com.naris.learn.cleanarchitecture1.ports.usecases.RequestQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.ports.usecases.SaveQuoteInputBoundary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteRestController {

    @Autowired
    private RequestQuoteInputBoundary requestQuoteInputBoundary;

    @Autowired
    private SaveQuoteInputBoundary saveQuoteInputBoundary;

    @GetMapping("/quotes")
    List<Quote> getQuotes() {
        return requestQuoteInputBoundary.getAll();
    }

    @GetMapping("/quotes/{id}")
    Quote getQuote(@PathVariable Integer id) {
        return requestQuoteInputBoundary.getOne(id);
    }

    @PostMapping(value = "/quotes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Quote addQuote(@RequestBody Quote quote) {
        return saveQuoteInputBoundary.save(quote);
    }
}

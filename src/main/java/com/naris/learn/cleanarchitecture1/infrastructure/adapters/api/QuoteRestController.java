package com.naris.learn.cleanarchitecture1.infrastructure.adapters.api;

import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.entities.response.ResponseQuote;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.ReadQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.SaveQuoteInputBoundary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteRestController {

    @Autowired
    private ReadQuoteInputBoundary requestQuoteInputBoundary;

    @Autowired
    private SaveQuoteInputBoundary saveQuoteInputBoundary;

    @GetMapping("/quotes")
    List<ResponseQuote> getQuotes() {
        return requestQuoteInputBoundary.getAll();
    }

    @GetMapping("/quotes/{id}")
    ResponseQuote getQuote(@PathVariable Integer id) {
        return requestQuoteInputBoundary.getOne(id);
    }

    @PostMapping(value = "/quotes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseQuote addQuote(@RequestBody RequestQuote requestQuote) {
        return saveQuoteInputBoundary.save(requestQuote);
    }
}

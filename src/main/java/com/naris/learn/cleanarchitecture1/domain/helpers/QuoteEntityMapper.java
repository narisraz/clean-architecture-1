package com.naris.learn.cleanarchitecture1.domain.helpers;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;
import com.naris.learn.cleanarchitecture1.domain.entities.request.RequestQuote;

import java.util.function.Function;

public class QuoteEntityMapper {

    public static Function<RequestQuote, Quote> requestQuoteToQuote = requestQuote -> new Quote(requestQuote.getId(), requestQuote.getSentence(), requestQuote.getAuthor());

    public static Function<Quote, RequestQuote> quoteToRequestQuote = quote -> new RequestQuote(quote.getId(), quote.getSentence(), quote.getAuthor());

}

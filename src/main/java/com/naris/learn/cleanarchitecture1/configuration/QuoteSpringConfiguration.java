package com.naris.learn.cleanarchitecture1.configuration;

import com.naris.learn.cleanarchitecture1.adapters.database.jpa.QuoteJpaGateway;
import com.naris.learn.cleanarchitecture1.adapters.database.jpa.QuoteJpaRepository;
import com.naris.learn.cleanarchitecture1.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.ports.usecases.RequestQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.ports.usecases.SaveQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.usecases.RequestQuote;
import com.naris.learn.cleanarchitecture1.usecases.SaveQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuoteSpringConfiguration {

    @Autowired
    private QuoteJpaRepository quoteJpaRepository;

    @Bean
    RequestQuoteInputBoundary createRequestQuote() {
        return new RequestQuote(createQuoteGateway());
    }

    @Bean
    SaveQuoteInputBoundary createSaveQuote() {
        return new SaveQuote(createQuoteGateway());
    }

    private QuoteJpaGateway createQuoteGateway() {
        return new QuoteJpaGateway(quoteJpaRepository);
    }
}

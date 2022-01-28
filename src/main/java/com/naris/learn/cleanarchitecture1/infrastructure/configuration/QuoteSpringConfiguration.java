package com.naris.learn.cleanarchitecture1.infrastructure.configuration;

import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.QuoteJpaGateway;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.QuoteJpaRepository;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.RequestQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.SaveQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.domain.usecases.RequestQuote;
import com.naris.learn.cleanarchitecture1.domain.usecases.SaveQuote;
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

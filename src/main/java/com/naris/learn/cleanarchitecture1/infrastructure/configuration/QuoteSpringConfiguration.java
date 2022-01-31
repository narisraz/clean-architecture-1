package com.naris.learn.cleanarchitecture1.infrastructure.configuration;

import com.naris.learn.cleanarchitecture1.domain.ports.presenters.QuotePresenter;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.ReadQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.domain.ports.usecases.SaveQuoteInputBoundary;
import com.naris.learn.cleanarchitecture1.domain.usecases.ReadQuote;
import com.naris.learn.cleanarchitecture1.domain.usecases.SaveQuote;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.api.QuoteRestPresenter;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.QuoteJpaGateway;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.QuoteJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuoteSpringConfiguration {

    @Bean
    QuotePresenter createQuotePresenter() {
        return new QuoteRestPresenter();
    }

    @Bean
    QuoteJpaGateway createQuoteGateway(QuoteJpaRepository repository) {
        return new QuoteJpaGateway(repository);
    }

    @Bean
    ReadQuoteInputBoundary createRequestQuote(QuoteJpaGateway gateway, QuotePresenter presenter) {
        return new ReadQuote(gateway, presenter);
    }

    @Bean
    SaveQuoteInputBoundary createSaveQuote(QuoteJpaGateway gateway, QuotePresenter presenter) {
        return new SaveQuote(gateway, presenter);
    }
}

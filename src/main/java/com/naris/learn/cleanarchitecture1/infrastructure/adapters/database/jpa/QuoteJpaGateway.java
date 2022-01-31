package com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;
import com.naris.learn.cleanarchitecture1.domain.ports.database.QuoteGateway;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.model.QuoteJpaModel;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.model.QuoteModelMapper;

import java.util.List;
import java.util.Optional;


public class QuoteJpaGateway implements QuoteGateway {

    private QuoteJpaRepository quoteJpaRepository;

    public QuoteJpaGateway(QuoteJpaRepository quoteJpaRepository) {
        this.quoteJpaRepository = quoteJpaRepository;
    }

    @Override
    public List<Quote> getAll() {
        return QuoteModelMapper.INSTANCE.quoteJpaModelListToQuoteList(quoteJpaRepository.findAll());
    }

    @Override
    public Optional<Quote> getOne(int id) {
        return quoteJpaRepository.findById(id).map(QuoteModelMapper.INSTANCE::quoteJpaModelToQuote);
    }

    @Override
    public Quote save(Quote quote) {
        QuoteJpaModel quoteJpaModel = QuoteModelMapper.INSTANCE.quoteToQuoteJpaModel(quote);
        return QuoteModelMapper.INSTANCE.quoteJpaModelToQuote(quoteJpaRepository.save(quoteJpaModel));
    }
}

package com.naris.learn.cleanarchitecture1.adapters.database.jpa.model;

import com.naris.learn.cleanarchitecture1.entities.Quote;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuoteModelMapper {

    QuoteModelMapper INSTANCE = Mappers.getMapper(QuoteModelMapper.class);

    Quote quoteJpaModelToQuote(QuoteJpaModel quoteJpaModel);
    QuoteJpaModel quoteToQuoteJpaModel(Quote quote);

    List<Quote> quoteJpaModelListToQuoteList(List<QuoteJpaModel> quoteJpaModels);
}

package com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.helpers;

import com.naris.learn.cleanarchitecture1.domain.entities.Quote;
import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.model.QuoteJpaModel;
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

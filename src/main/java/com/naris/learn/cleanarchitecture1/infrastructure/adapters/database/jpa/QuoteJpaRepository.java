package com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa;

import com.naris.learn.cleanarchitecture1.infrastructure.adapters.database.jpa.model.QuoteJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteJpaRepository extends JpaRepository<QuoteJpaModel, Integer> {
}

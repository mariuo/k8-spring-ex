package com.mcamelo.k8s_mysql.repository;

import com.mcamelo.k8s_mysql.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}

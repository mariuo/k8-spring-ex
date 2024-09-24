package com.mcamelo.k8s_mysql.service;

import com.mcamelo.k8s_mysql.model.ExchangeRate;
import com.mcamelo.k8s_mysql.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public ExchangeRate addExchangeRate(ExchangeRate exchangeRate){
        return exchangeRateRepository.save(exchangeRate);
    }

    public double getAmount(String sourceCurrency, String targetCurrency){
        ExchangeRate exchangeRate = exchangeRateRepository.findBySourceCurrencyAndTargetCurrency(sourceCurrency, targetCurrency);
            return exchangeRate == null ? 0 : exchangeRate.getAmount();

    }
}

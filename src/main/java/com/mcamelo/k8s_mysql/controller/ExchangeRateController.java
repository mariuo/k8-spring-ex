package com.mcamelo.k8s_mysql.controller;

import com.mcamelo.k8s_mysql.model.ExchangeRate;
import com.mcamelo.k8s_mysql.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("/getAmount")
    public double getAmount(@RequestParam String sourceCurrency, @RequestParam String targetCurrency){
        return exchangeRateService.getAmount(sourceCurrency, targetCurrency);
    }

    @PostMapping("/addExchangeRate")
    public ExchangeRate addExchangeRate(@RequestBody ExchangeRate exchangeRate){
        return exchangeRateService.addExchangeRate(exchangeRate);
    }

}

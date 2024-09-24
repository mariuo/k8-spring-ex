package com.mcamelo.k8s_mysql.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Date;

@Entity
@Table(name= "exchange-rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;
    @NotNull
    private String sourceCurrency;
    @NotNull
    private String targetCurrency;
    @NotNull
    private double amount;
    @NotNull
    private Date lastUpdated;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

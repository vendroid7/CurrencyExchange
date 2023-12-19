package com.vendroid.currencyexchange;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;


@Entity
@Table(name = "currency_exchange")
public class CurrencyExchange {
    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;




    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMult) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMult;
    }
    public CurrencyExchange()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMult() {
        return conversionMultiple;
    }

    public void setConversionMult(BigDecimal conversionMult) {
        this.conversionMultiple = conversionMult;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }



}

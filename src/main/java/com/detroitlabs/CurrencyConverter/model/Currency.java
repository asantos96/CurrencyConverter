package com.detroitlabs.CurrencyConverter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    //Establish JSON variables that are single objects here
    String base;
    String date;
    //variable rates holds all currencies and their exchange based on the baseEUR
    //    HashMap<String, Double> rates;
    Rates internationalCurrency;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public HashMap<String, Double> getRates() {
//        return rates;
//    }
//
//    public void setRates(HashMap<String, Double> rates) {
//        this.rates = rates;
//    }

    @JsonProperty("rates")
    public Rates getInternationalCurrency() {
        return internationalCurrency;
    }
    @JsonProperty("rates")
    public void setInternationalCurrency(Rates internationalCurrency) {
        this.internationalCurrency = internationalCurrency;
    }
}

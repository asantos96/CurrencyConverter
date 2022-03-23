package com.detroitlabs.CurrencyConverter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
    //Establish JSON variables that are within the rate object
    double AED;

    public double getAED() {
        return AED;
    }

    public void setAED(double AED) {
        this.AED = AED;
    }
}

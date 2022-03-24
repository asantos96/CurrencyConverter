package com.detroitlabs.CurrencyConverter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Rates {
    //Establish JSON variables that are within the rate object
    double AED;
    double BHD;
    double CAD;
    double CHF;
    double GBP;
    double KWD;
    double KYD;
    double OMR;
    double USD;

    @JsonProperty("AED")
    public double getAED() {
        return AED;
    }
    @JsonProperty("AED")
    public void setAED(double AED) {
        this.AED = AED;
    }
    @JsonProperty("BHD")
    public double getBHD() {
        return BHD;
    }
    @JsonProperty("BHD")
    public void setBHD(double BHD) {
        this.BHD = BHD;
    }
    @JsonProperty("CAD")
    public double getCAD() {
        return CAD;
    }
    @JsonProperty("CAD")
    public void setCAD(double CAD) {
        this.CAD = CAD;
    }
    @JsonProperty("CHF")
    public double getCHF() {
        return CHF;
    }
    @JsonProperty("CHF")
    public void setCHF(double CHF) {
        this.CHF = CHF;
    }
    @JsonProperty("GBP")
    public double getGBP() {
        return GBP;
    }
    @JsonProperty("GBP")
    public void setGBP(double GBP) {
        this.GBP = GBP;
    }
    @JsonProperty("KWD")
    public double getKWD() {
        return KWD;
    }
    @JsonProperty("KWD")
    public void setKWD(double KWD) {
        this.KWD = KWD;
    }
    @JsonProperty("KYD")
    public double getKYD() {
        return KYD;
    }
    @JsonProperty("KYD")
    public void setKYD(double KYD) {
        this.KYD = KYD;
    }
    @JsonProperty("OMR")
    public double getOMR() {
        return OMR;
    }
    @JsonProperty("OMR")
    public void setOMR(double OMR) {
        this.OMR = OMR;
    }
    @JsonProperty("USD")
    public double getUSD() {
        return USD;
    }
    @JsonProperty("USD")
    public void setUSD(double USD) {
        this.USD = USD;
    }
}

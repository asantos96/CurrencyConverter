package com.detroitlabs.CurrencyConverter.controller;

import com.detroitlabs.CurrencyConverter.model.Currency;
import com.detroitlabs.CurrencyConverter.service.CurrencyService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ModelMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterControllerTest {

    private CurrencyService currencyService;
    private String currencyAbbreviation = "USD";
    private double value = 55.31;

    @Test
    void shouldReturnUSDConversionFromEuros() {
        //Arrange
        Currency output = currencyService.retrieveCurrencyData();

        //Act
        double convertedValue = value / output.getInternationalCurrency().getUSD();

        //Assert
        assertEquals(convertedValue, 50.29558088167762);
    }
}
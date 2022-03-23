package com.detroitlabs.CurrencyConverter.controller;

import com.detroitlabs.CurrencyConverter.model.Currency;
import com.detroitlabs.CurrencyConverter.model.Rates;
import com.detroitlabs.CurrencyConverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;


@Controller
public class CurrencyConverterController {

    @Autowired
    private CurrencyService currencyService;
    private Currency currency;
    private Rates rates;

    @RequestMapping("/")
    public String currencySearchBars(){
        return "home";
    }




    @RequestMapping("/q")
    public String currencySearchResult(@RequestParam("currencyTypeUserSearch") String currencyAbbreviation,
                                       @RequestParam("valueUserSearch") double value, ModelMap modelMap){
        Currency output = currencyService.retrieveCurrencyData();
        modelMap.put("Key", output.getInternationalCurrency());
        //possible equation for conversion
        return "home";
    }

}

package com.detroitlabs.CurrencyConverter.controller;

import com.detroitlabs.CurrencyConverter.model.Currency;
import com.detroitlabs.CurrencyConverter.model.Rates;
import com.detroitlabs.CurrencyConverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CurrencyConverterController {

    @Autowired
    private CurrencyService currencyService;
    private Currency currency;
    private Rates rates;

    @RequestMapping("/")
    public String currencySearchBars(ModelMap modelMap) {
        Currency euroOutput = currencyService.retrieveCurrencyData();
//        System.out.println(euroOutput.getInternationalCurrency().getAED());

        modelMap.put("euroKey", euroOutput);
        return "home";
    }


    @RequestMapping("/q")
    public String currencySearchResult(@RequestParam("currencyTypeUserSearch") String currencyAbbreviation,
                                       @RequestParam("valueUserSearch") double value, ModelMap modelMap) {
        Currency output = currencyService.retrieveCurrencyData();
        modelMap.put("Key", output);

        double convertedValue = 0;
//        DEBUGGING
//        System.out.println(currencyAbbreviation.equalsIgnoreCase("AED"));
//        System.out.println(currencyAbbreviation);
        if (currencyAbbreviation.equalsIgnoreCase("AED")) {
               convertedValue = value / output.getInternationalCurrency().getAED();
        }
        if (currencyAbbreviation.equalsIgnoreCase("BHD")) {
            convertedValue = value / output.getInternationalCurrency().getBHD();
        }
        if (currencyAbbreviation.equalsIgnoreCase("CAD")) {
            convertedValue = value / output.getInternationalCurrency().getCAD();
        }
        if (currencyAbbreviation.equalsIgnoreCase("CHF")) {
            convertedValue = value / output.getInternationalCurrency().getCHF();
        }
        if (currencyAbbreviation.equalsIgnoreCase("GBP")) {
            convertedValue = value / output.getInternationalCurrency().getGBP();
        }
        if (currencyAbbreviation.equalsIgnoreCase("KWD")) {
            convertedValue = value / output.getInternationalCurrency().getKWD();
        }
        if (currencyAbbreviation.equalsIgnoreCase("KYD")) {
            convertedValue = value / output.getInternationalCurrency().getKYD();
        }
        if (currencyAbbreviation.equalsIgnoreCase("OMR")) {
            convertedValue = value / output.getInternationalCurrency().getOMR();
        }
        if (currencyAbbreviation.equalsIgnoreCase("USD")) {
            convertedValue = value / output.getInternationalCurrency().getUSD();
        }
//        else {
//
//        }

        //additional modelMap, you can still utilize the "key" created above
        modelMap.addAttribute("convertedValue", convertedValue);
                return "searchresult";
    }

}
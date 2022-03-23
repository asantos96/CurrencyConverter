package com.detroitlabs.CurrencyConverter.service;

import com.detroitlabs.CurrencyConverter.model.Currency;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyService {
    public Currency retrieveCurrencyData(){
        RestTemplate restTemplate = new RestTemplate();
        //Looks within this URL and coordinates what class it should be pulled into
        return restTemplate.getForObject("http://data.fixer.io/api/latest?access_key=dd9a34ac948bf2c49a6c48a34a861baf"
                , Currency.class);
    }

}

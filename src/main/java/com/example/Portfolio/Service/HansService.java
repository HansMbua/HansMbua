package com.example.Portfolio.Service;

import com.example.Portfolio.entity.Quote;
import com.example.Portfolio.entity.value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Timer;

@Service
public class HansService implements hansServiceInter{

    private Quote theQuote;
    private Timer timer;
    private String url;


    private RestTemplate restTemplate;

    @Autowired
    public HansService(RestTemplate restTemplate, @Value("https://zenquotes.io/api/random") String url ) {
        this.restTemplate = restTemplate;
        this.url = url;

    }

    @Override
    public Quote getTheQuote() {

         Quote[] theQuotes = restTemplate.getForObject(url, Quote[].class);

        return theQuotes[0];
    }


//    Quote quote = new Quote();
//    value value = new value();
//    RestTemplate restTemplate = new RestTemplate();
//        public value getQuote(){
//
//
//
//            quote = restTemplate.getForObject("https://gistcdn.githack.com/ayan-b/ff0441b5a8d6c489b58659ffb849aff4/raw/e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Quote.class);
//            value = quote.getValue();
//
//            return value;
//        }




}

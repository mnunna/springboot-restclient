package com.mahendranunna.springclient.client;

import com.mahendranunna.springclient.model.Quote;
import com.mahendranunna.springclient.model.QuoteService;
import com.mahendranunna.springclient.model.QuoteServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CallRestService  implements CommandLineRunner {
    @Autowired
    QuoteServiceBean service;

    private void callRestService(){

        System.out.println("#################################CommandLineRunner#################################");

        Quote quote = service.getDaily(QuoteService.CATEGORY_INSPIRATIONAL);
        System.out.println("Quote of the day is: "+quote.getQuote());

    }

    @Override
    public void run(String... args) throws Exception {
        callRestService();
    }
}

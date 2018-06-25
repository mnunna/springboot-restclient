package com.mahendranunna.springclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponseContents {

    private ArrayList<Quote> quotes = new ArrayList<>(0);

    public QuoteResponseContents() {
    }

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }
}

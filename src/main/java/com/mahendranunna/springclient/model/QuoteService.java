package com.mahendranunna.springclient.model;

public interface QuoteService {
    String CATEGORY_INSPIRATIONAL = "inspire";
    Quote getDaily(String category);


}

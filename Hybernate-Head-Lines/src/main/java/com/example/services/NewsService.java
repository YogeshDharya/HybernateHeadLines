package com.example.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.entities.*;
import com.example.models.NewsResponse;
import java.util.*;

@Service 
public class NewsService{
    private String apiKey;
    private final RestTemplate restTemplate;
    public NewsService(RestTemplate newRestTemplate){
        this.restTemplate = newRestTemplate;
    }
    public List<NewsArticle> fetchNews(){
        String url = "http://api.mediastack.com/v1/news?access_key=" + apiKey + "&countries=us";
        ResponseEntity<NewsResponse> response = restTemplate.getForEntity(url, NewsResponse.class);
        return response.getBody().getArticles();        
    }
}
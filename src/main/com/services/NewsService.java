package com.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import com.example.entities.*;
import com.example.models.NewsResponse;
import com.example.repositories.NewsArticleRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service 
public class NewsService{
    @Value("${mediastack.api.key}")
    private String apiKey;
    @Value("${mediastack.api.base.url}")
    private String baseUrl  ;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private NewsArticleRepository repository;

    public List<NewsArticle> fetchNews(){
         RestTemplate restTemplate = new RestTemplate();
        String url = baseUrl + apiKey + "&countries=us";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        List<Map<String, Object>> data = (List<Map<String, Object>>) response.getBody().get("data"); 
        //return response.getBody().getArticles();        
        List<NewsArticle> articles = data.stream()
            .map(this::mapToNewsArticle)
            .collect(Collectors.toList());
        return repository.saveAll(articles);        
    }
    private NewsArticle mapToNewsArticle(Map<String, Object> data){
        NewsArticle article = new NewsArticle();
        article.setTitle((String) data.get("title"));
        article.setDescription((String) data.get("description"));
        article.setUrl((String) data.get("url"));
        article.setSource((String) data.get("source"));
        article.setPublishedAt((String) data.get("published_at"));
        return article;
    }
}
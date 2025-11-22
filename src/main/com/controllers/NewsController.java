package com.controllers;
import java.util.*;

import com.entities.NewsArticle;
import com.example.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NewsController {
    //@Autowired
    private NewsService newsService ;
    
    @Autowired
    private PersistenceService persistenceService;
    
    @RequestMapping("api/news")
    public List<NewsArticle> fetchAndSaveNews(){
        List<NewsArticle> articles = newsService.fetchNews();
        persistenceService.saveNewsArticle(articles);
        return articles;
    }
}
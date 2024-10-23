package com.example.controllers;
import java.util.*;

import com.example.entities.NewsArticle;
import com.example.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService ;
    
    @Autowired
    private PersistenceService persistenceService;
    
    @GetMapping("/fetch")
    public List<NewsArticle> fetchAndSaveNews(){
        List<NewsArticle> articles = newsService.fetchNews();
        persistenceService.saveNewsArticle(articles);
        return articles;
    }
    // public NewsController(NewsService myNewsService,PersistenceService myPersistenceService){
    //     this.newsService = myNewsService;
    //     this.persistenceService = myPersistenceService;
    // }
}
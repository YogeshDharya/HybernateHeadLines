package com.example.services;
import com.example.entities.NewsArticle;
import com.example.repositories.NewsArticleRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
public class PersistenceService{
    @Autowired 
    private NewsArticleRepository newsRepository; 
    public void saveNewsArticle(List<NewsArticle> articlesList){
        for(NewsArticle article: articlesList){
            newsRepository.save(article);
        }
    }
}
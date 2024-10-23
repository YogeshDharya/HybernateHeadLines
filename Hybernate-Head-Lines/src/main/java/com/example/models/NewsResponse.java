package com.example.models;
import com.example.entities.NewsArticle;
import java.util.*;
public class NewsResponse{
    private List<NewsArticle> articles;
    NewsResponse(List<NewsArticle> newsArticles ){
        this.articles = newsArticles;
    }
    public List<NewsArticle> getArticles(){
        return this.articles;
    }
}
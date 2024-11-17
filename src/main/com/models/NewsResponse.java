package com.example.models;
import com.example.entities.NewsArticle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
//Some temurin hostpost 
public class NewsResponse{
    @JsonProperty("data")
    private List<NewsArticle> articles;
    NewsResponse(List<NewsArticle> newsArticles ){
        this.articles = newsArticles;
    }
    public List<NewsArticle> getArticles(){
        return this.articles;
    }
}
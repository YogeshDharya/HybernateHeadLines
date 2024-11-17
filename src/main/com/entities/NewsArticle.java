package com.example.entities;
import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;

@Entity
public class NewsArticle{
    @Id 
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id; 

    @JsonProperty("title")
    private  String title; 

    @JsonProperty("description")
    private String description; 

    @JsonProperty("author")
    private String author;
    
        @JsonProperty("url")
        private final String url;
    
        @JsonProperty("published_at")
        private String published_at;

        @JsonProperty("source")
        private String source;
        //TODO 
        //o Object info of a news article as returned by the news api 
        //Also end 2 end flow is required for more clarity 
        public Long getNewsId(){
            return this.id;
        }
        public String getNewsTitle(){
            return this.title;
        }
        public String getNewsDescription(){
            return this.description;
        }
        public String getNewsAuthor(){
            return this.author;
        }
        public void setNewsId(Long newsId){
            this.id = newsId;
        }
        public void setAuthor(String newAuthor){
            this.author = newAuthor;
        }
        public String getAuthor(){
            return this.author;
        }
        
    public void setNewsTitle(String newsTitle){
        this.title = newsTitle;
    }
    public void setAllDescription(String newDescription){
        this.description = newDescription;
        //TODO 
        //o Requires way more modular controls EVEN THOUGH we may not be required to use it any time soon 
    }  
    
}
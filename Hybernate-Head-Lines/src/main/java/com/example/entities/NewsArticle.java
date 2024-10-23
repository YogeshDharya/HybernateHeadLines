import javax.annotation.processing.Generated;
package com.example.entities;

@Entity
public class NewsArticle{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id; 
    private final String title; 
    private String content; 
    private final String author;
    //TODO 
    //o Object info of a news article as returned by the news api 
    //Also end 2 end flow is required for more clarity 
    public Long getNewsId(){
        return this.id;
    }
    public String getNewsTitle(){
        return this.title;
    }
    public String getNewsContent(){
        return this.content;
    }
    public Long getNewsAuthor(){
        return this.author;
    }
    public void setNewsId(Long newsId){
        this.id = newsId;
    }
    public void setNewsTitle(String newsTitle){
        this.title = newsTitle;
    }
    public void setAllContent(String newContent){
        this.content = newContent;
        //TODO 
        //o Requires way more modular controls EVEN THOUGH we may not be required to use it any time soon 
    }  
    
}
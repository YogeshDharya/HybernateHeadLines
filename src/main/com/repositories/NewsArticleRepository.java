package com.example.repositories;
import com.example.entities.NewsArticle;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long>{
    //Custom   query method to find articles by source 
    List<NewsArticle> findBySource(String src);
    //searches by keyword 
    List<NewsArticle> findByTitleContaining(String keyword);
}
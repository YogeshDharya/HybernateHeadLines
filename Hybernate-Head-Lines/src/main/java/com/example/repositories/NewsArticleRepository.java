package com.example.repositories;
import com.example.entities.NewsArticle;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long>{
    
}
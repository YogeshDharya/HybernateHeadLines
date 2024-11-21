package main.com.entities;
import jakarta.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String newsId;

    @Column
    private String accessedAt;

     public History() {}

    public History(Long userId, String newsId, String accessedAt) {
        this.userId = userId;
        this.newsId = newsId;
        this.accessedAt = accessedAt;
    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getAccessedAt() {
        return accessedAt;
    }

    public void setAccessedAt(String accessedAt) {
        this.accessedAt = accessedAt;
    }
}
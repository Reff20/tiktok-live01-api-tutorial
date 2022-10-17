package br.com.tiktokapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_NEWS")
public class News implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NEWS_TITLE")
    private String newsTitle;

    @Column(name = "NEWS_CONTENT")
    private String newsContent;

    @Column(name = "NEWS_CREATOR")
    private String newsCreator;

    @Column(name = "NEWS_DATE")
    private Date newsDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsCreator() {
        return newsCreator;
    }

    public void setNewsCreator(String newsCreator) {
        this.newsCreator = newsCreator;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }
}

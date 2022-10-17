package br.com.tiktokapi.controller;

import br.com.tiktokapi.dto.request.PostNews;
import br.com.tiktokapi.model.News;
import br.com.tiktokapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody PostNews dto){
        return newsService.createNews(dto);
    }
}

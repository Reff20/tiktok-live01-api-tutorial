package br.com.tiktokapi.service;

import br.com.tiktokapi.dto.request.PostNews;
import br.com.tiktokapi.dto.response.Response;
import br.com.tiktokapi.model.News;
import br.com.tiktokapi.repository.NewsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public ResponseEntity<Object> createNews(PostNews dto){
        Response resp = new Response();
        try{


            //Inicio
            News model = new News();
            Date date = new Date();

            model.setNewsCreator(dto.getCreator());
            model.setNewsContent(dto.getContent());
            model.setNewsTitle(dto.getTitle());
            model.setNewsDate(date);

            newsRepository.save(model);
            //Final
            resp.setMessage("Noticia criada com sucesso!");
            resp.setStatus(201);

            return new ResponseEntity<>(resp, HttpStatus.CREATED);

        }catch (Exception ex){
            resp.setMessage("Erro! Requisição má sucedida...");
            resp.setStatus(400);
            System.out.println(ex);
            return new ResponseEntity<>(resp, HttpStatus.CREATED);
        }
    }
}

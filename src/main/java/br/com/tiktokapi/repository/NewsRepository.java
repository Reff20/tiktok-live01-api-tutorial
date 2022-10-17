package br.com.tiktokapi.repository;

import br.com.tiktokapi.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}

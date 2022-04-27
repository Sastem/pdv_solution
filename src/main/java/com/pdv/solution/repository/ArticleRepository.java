package com.pdv.solution.repository;

import com.pdv.solution.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    @Override
    List<Article> findAll();

    @Override
    List<Article> findAllById(Iterable<Integer> integers);
}

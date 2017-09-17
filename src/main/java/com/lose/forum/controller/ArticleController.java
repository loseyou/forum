package com.lose.forum.controller;

import com.lose.forum.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Article;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lose
 * @since 2017-09-17
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@PostMapping
	public @ResponseBody Integer addArticle(Article article){
		return articleService.addArticle(article);
	}
	
	@DeleteMapping
	public @ResponseBody Article deleteArticle(Article article) {
		articleService.deleteArticle(article);
		return article;
	}
	
	@PutMapping
	public @ResponseBody Article updateArticle(Article article){
		articleService.updateArticle(article);
		return article;
	}
	
	@GetMapping
	public @ResponseBody Article selectArticleById(Article article){
		return articleService.selectArticleById(article);
	}
	
	
	@GetMapping("/articles")
	public @ResponseBody List<Article> selectArticleList(){
		return articleService.selectArticleList();
	}

}

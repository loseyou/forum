package com.lose.forum.service;

import com.lose.forum.model.Article;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface ArticleService{
	
	Integer addArticle(Article article);
	
	Integer deleteArticle(Article article);
	
	Integer updateArticle(Article article);
	
	Article selectArticleById(Article article);
	
	List<Article> selectArticleList();
	
}

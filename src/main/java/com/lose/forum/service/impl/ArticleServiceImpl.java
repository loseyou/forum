package com.lose.forum.service.impl;

import com.lose.forum.service.ArticleService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.ArticleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Article;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);
	
	@Autowired
	private ArticleDao articleDao;
	
	public Integer addArticle(Article article){
		return articleDao.addArticle(article);
	}
	
	public Integer deleteArticle(Article article){
		return articleDao.deleteArticle(article);
	}
	
	public Integer updateArticle(Article article){
		return articleDao.updateArticle(article);
	}
	
	public Article selectArticleById(Article article){
		return articleDao.selectArticleById(article);
	}
	
	public List<Article> selectArticleList(){
		return articleDao.selectArticleList();
	}
	
}

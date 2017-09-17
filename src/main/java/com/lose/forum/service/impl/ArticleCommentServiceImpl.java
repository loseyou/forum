package com.lose.forum.service.impl;

import com.lose.forum.service.ArticleCommentService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.ArticleCommentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleComment;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class ArticleCommentServiceImpl implements ArticleCommentService {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleCommentServiceImpl.class);
	
	@Autowired
	private ArticleCommentDao articleCommentDao;
	
	public Integer addArticleComment(ArticleComment articleComment){
		return articleCommentDao.addArticleComment(articleComment);
	}
	
	public Integer deleteArticleComment(ArticleComment articleComment){
		return articleCommentDao.deleteArticleComment(articleComment);
	}
	
	public Integer updateArticleComment(ArticleComment articleComment){
		return articleCommentDao.updateArticleComment(articleComment);
	}
	
	public ArticleComment selectArticleCommentById(ArticleComment articleComment){
		return articleCommentDao.selectArticleCommentById(articleComment);
	}
	
	public List<ArticleComment> selectArticleCommentList(){
		return articleCommentDao.selectArticleCommentList();
	}
	
}

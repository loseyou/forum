package com.lose.forum.dao;

import com.lose.forum.model.ArticleComment;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface ArticleCommentDao {
	
	Integer addArticleComment(ArticleComment articleComment);
	
	Integer deleteArticleComment(ArticleComment articleComment);
	
	Integer updateArticleComment(ArticleComment articleComment);
	
	ArticleComment selectArticleCommentById(ArticleComment articleComment);
	
	List<ArticleComment> selectArticleCommentList();
	
}
package com.lose.forum.service;

import com.lose.forum.model.ArticleTag;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface ArticleTagService{
	
	Integer addArticleTag(ArticleTag articleTag);
	
	Integer deleteArticleTag(ArticleTag articleTag);
	
	Integer updateArticleTag(ArticleTag articleTag);
	
	ArticleTag selectArticleTagById(ArticleTag articleTag);
	
	List<ArticleTag> selectArticleTagList();
	
}

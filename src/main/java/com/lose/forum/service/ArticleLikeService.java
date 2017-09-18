package com.lose.forum.service;

import com.lose.forum.model.ArticleLike;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface ArticleLikeService{
	
	Integer addArticleLike(ArticleLike articleLike);
	
	Integer deleteArticleLike(ArticleLike articleLike);
	
	Integer updateArticleLike(ArticleLike articleLike);
	
	ArticleLike selectArticleLikeById(ArticleLike articleLike);
	
	List<ArticleLike> selectArticleLikeList();
	
}

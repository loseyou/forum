package com.lose.forum.service.impl;

import com.lose.forum.service.ArticleLikeService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.ArticleLikeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleLike;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class ArticleLikeServiceImpl implements ArticleLikeService {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleLikeServiceImpl.class);
	
	@Autowired
	private ArticleLikeDao articleLikeDao;
	
	public Integer addArticleLike(ArticleLike articleLike){
		return articleLikeDao.addArticleLike(articleLike);
	}
	
	public Integer deleteArticleLike(ArticleLike articleLike){
		return articleLikeDao.deleteArticleLike(articleLike);
	}
	
	public Integer updateArticleLike(ArticleLike articleLike){
		return articleLikeDao.updateArticleLike(articleLike);
	}
	
	public ArticleLike selectArticleLikeById(ArticleLike articleLike){
		return articleLikeDao.selectArticleLikeById(articleLike);
	}
	
	public List<ArticleLike> selectArticleLikeList(){
		return articleLikeDao.selectArticleLikeList();
	}
	
}

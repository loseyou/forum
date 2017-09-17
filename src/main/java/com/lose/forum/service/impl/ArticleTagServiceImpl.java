package com.lose.forum.service.impl;

import com.lose.forum.service.ArticleTagService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.ArticleTagDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleTag;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class ArticleTagServiceImpl implements ArticleTagService {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleTagServiceImpl.class);
	
	@Autowired
	private ArticleTagDao articleTagDao;
	
	public Integer addArticleTag(ArticleTag articleTag){
		return articleTagDao.addArticleTag(articleTag);
	}
	
	public Integer deleteArticleTag(ArticleTag articleTag){
		return articleTagDao.deleteArticleTag(articleTag);
	}
	
	public Integer updateArticleTag(ArticleTag articleTag){
		return articleTagDao.updateArticleTag(articleTag);
	}
	
	public ArticleTag selectArticleTagById(ArticleTag articleTag){
		return articleTagDao.selectArticleTagById(articleTag);
	}
	
	public List<ArticleTag> selectArticleTagList(){
		return articleTagDao.selectArticleTagList();
	}
	
}

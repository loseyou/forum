package com.lose.forum.controller;

import com.lose.forum.service.ArticleTagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleTag;
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
@RequestMapping("/articleTag")
public class ArticleTagController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleTagController.class);
	
	@Autowired
	private ArticleTagService articleTagService;
	
	@PostMapping
	public @ResponseBody Integer addArticleTag(ArticleTag articleTag){
		return articleTagService.addArticleTag(articleTag);
	}
	
	@DeleteMapping
	public @ResponseBody ArticleTag deleteArticleTag(ArticleTag articleTag) {
		articleTagService.deleteArticleTag(articleTag);
		return articleTag;
	}
	
	@PutMapping
	public @ResponseBody ArticleTag updateArticleTag(ArticleTag articleTag){
		articleTagService.updateArticleTag(articleTag);
		return articleTag;
	}
	
	@GetMapping
	public @ResponseBody ArticleTag selectArticleTagById(ArticleTag articleTag){
		return articleTagService.selectArticleTagById(articleTag);
	}
	
	
	@GetMapping("/articleTags")
	public @ResponseBody List<ArticleTag> selectArticleTagList(){
		return articleTagService.selectArticleTagList();
	}

}

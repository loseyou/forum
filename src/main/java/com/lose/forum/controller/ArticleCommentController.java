package com.lose.forum.controller;

import com.lose.forum.service.ArticleCommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleComment;
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
@RequestMapping("/articleComment")
public class ArticleCommentController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleCommentController.class);
	
	@Autowired
	private ArticleCommentService articleCommentService;
	
	@PostMapping
	public @ResponseBody Integer addArticleComment(ArticleComment articleComment){
		return articleCommentService.addArticleComment(articleComment);
	}
	
	@DeleteMapping
	public @ResponseBody ArticleComment deleteArticleComment(ArticleComment articleComment) {
		articleCommentService.deleteArticleComment(articleComment);
		return articleComment;
	}
	
	@PutMapping
	public @ResponseBody ArticleComment updateArticleComment(ArticleComment articleComment){
		articleCommentService.updateArticleComment(articleComment);
		return articleComment;
	}
	
	@GetMapping
	public @ResponseBody ArticleComment selectArticleCommentById(ArticleComment articleComment){
		return articleCommentService.selectArticleCommentById(articleComment);
	}
	
	
	@GetMapping("/articleComments")
	public @ResponseBody List<ArticleComment> selectArticleCommentList(){
		return articleCommentService.selectArticleCommentList();
	}

}

package com.lose.forum.controller;

import com.lose.forum.service.ArticleLikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArticleLike;
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
@RequestMapping("/articleLike")
public class ArticleLikeController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleLikeController.class);
	
	@Autowired
	private ArticleLikeService articleLikeService;
	
	@PostMapping
	public @ResponseBody Integer addArticleLike(ArticleLike articleLike){
		return articleLikeService.addArticleLike(articleLike);
	}
	
	@DeleteMapping
	public @ResponseBody ArticleLike deleteArticleLike(ArticleLike articleLike) {
		articleLikeService.deleteArticleLike(articleLike);
		return articleLike;
	}
	
	@PutMapping
	public @ResponseBody ArticleLike updateArticleLike(ArticleLike articleLike){
		articleLikeService.updateArticleLike(articleLike);
		return articleLike;
	}
	
	@GetMapping
	public @ResponseBody ArticleLike selectArticleLikeById(ArticleLike articleLike){
		return articleLikeService.selectArticleLikeById(articleLike);
	}
	
	
	@GetMapping("/articleLikes")
	public @ResponseBody List<ArticleLike> selectArticleLikeList(){
		return articleLikeService.selectArticleLikeList();
	}

}

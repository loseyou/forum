package com.lose.forum.controller;

import com.lose.forum.service.TagLikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.TagLike;
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
@RequestMapping("/tagLike")
public class TagLikeController {

	private static final Logger logger = LoggerFactory.getLogger(TagLikeController.class);
	
	@Autowired
	private TagLikeService tagLikeService;
	
	@PostMapping
	public @ResponseBody Integer addTagLike(TagLike tagLike){
		return tagLikeService.addTagLike(tagLike);
	}
	
	@DeleteMapping
	public @ResponseBody TagLike deleteTagLike(TagLike tagLike) {
		tagLikeService.deleteTagLike(tagLike);
		return tagLike;
	}
	
	@PutMapping
	public @ResponseBody TagLike updateTagLike(TagLike tagLike){
		tagLikeService.updateTagLike(tagLike);
		return tagLike;
	}
	
	@GetMapping
	public @ResponseBody TagLike selectTagLikeById(TagLike tagLike){
		return tagLikeService.selectTagLikeById(tagLike);
	}
	
	
	@GetMapping("/tagLikes")
	public @ResponseBody List<TagLike> selectTagLikeList(){
		return tagLikeService.selectTagLikeList();
	}

}

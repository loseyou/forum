package com.lose.forum.controller;

import com.lose.forum.service.TopicLikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.TopicLike;
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
@RequestMapping("/topicLike")
public class TopicLikeController {

	private static final Logger logger = LoggerFactory.getLogger(TopicLikeController.class);
	
	@Autowired
	private TopicLikeService topicLikeService;
	
	@PostMapping
	public @ResponseBody Integer addTopicLike(TopicLike topicLike){
		return topicLikeService.addTopicLike(topicLike);
	}
	
	@DeleteMapping
	public @ResponseBody TopicLike deleteTopicLike(TopicLike topicLike) {
		topicLikeService.deleteTopicLike(topicLike);
		return topicLike;
	}
	
	@PutMapping
	public @ResponseBody TopicLike updateTopicLike(TopicLike topicLike){
		topicLikeService.updateTopicLike(topicLike);
		return topicLike;
	}
	
	@GetMapping
	public @ResponseBody TopicLike selectTopicLikeById(TopicLike topicLike){
		return topicLikeService.selectTopicLikeById(topicLike);
	}
	
	
	@GetMapping("/topicLikes")
	public @ResponseBody List<TopicLike> selectTopicLikeList(){
		return topicLikeService.selectTopicLikeList();
	}

}

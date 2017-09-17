package com.lose.forum.controller;

import com.lose.forum.service.TopicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Topic;
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
@RequestMapping("/topic")
public class TopicController {

	private static final Logger logger = LoggerFactory.getLogger(TopicController.class);
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping
	public @ResponseBody Integer addTopic(Topic topic){
		return topicService.addTopic(topic);
	}
	
	@DeleteMapping
	public @ResponseBody Topic deleteTopic(Topic topic) {
		topicService.deleteTopic(topic);
		return topic;
	}
	
	@PutMapping
	public @ResponseBody Topic updateTopic(Topic topic){
		topicService.updateTopic(topic);
		return topic;
	}
	
	@GetMapping
	public @ResponseBody Topic selectTopicById(Topic topic){
		return topicService.selectTopicById(topic);
	}
	
	
	@GetMapping("/topics")
	public @ResponseBody List<Topic> selectTopicList(){
		return topicService.selectTopicList();
	}

}

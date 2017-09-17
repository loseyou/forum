package com.lose.forum.service;

import com.lose.forum.model.Topic;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TopicService{
	
	Integer addTopic(Topic topic);
	
	Integer deleteTopic(Topic topic);
	
	Integer updateTopic(Topic topic);
	
	Topic selectTopicById(Topic topic);
	
	List<Topic> selectTopicList();
	
}

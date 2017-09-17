package com.lose.forum.dao;

import com.lose.forum.model.Topic;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TopicDao {
	
	Integer addTopic(Topic topic);
	
	Integer deleteTopic(Topic topic);
	
	Integer updateTopic(Topic topic);
	
	Topic selectTopicById(Topic topic);
	
	List<Topic> selectTopicList();
	
}
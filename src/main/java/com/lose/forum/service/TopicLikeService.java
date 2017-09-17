package com.lose.forum.service;

import com.lose.forum.model.TopicLike;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TopicLikeService{
	
	Integer addTopicLike(TopicLike topicLike);
	
	Integer deleteTopicLike(TopicLike topicLike);
	
	Integer updateTopicLike(TopicLike topicLike);
	
	TopicLike selectTopicLikeById(TopicLike topicLike);
	
	List<TopicLike> selectTopicLikeList();
	
}

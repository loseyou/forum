package com.lose.forum.service.impl;

import com.lose.forum.service.TopicLikeService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.TopicLikeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.TopicLike;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class TopicLikeServiceImpl implements TopicLikeService {
	
	private static final Logger logger = LoggerFactory.getLogger(TopicLikeServiceImpl.class);
	
	@Autowired
	private TopicLikeDao topicLikeDao;
	
	public Integer addTopicLike(TopicLike topicLike){
		return topicLikeDao.addTopicLike(topicLike);
	}
	
	public Integer deleteTopicLike(TopicLike topicLike){
		return topicLikeDao.deleteTopicLike(topicLike);
	}
	
	public Integer updateTopicLike(TopicLike topicLike){
		return topicLikeDao.updateTopicLike(topicLike);
	}
	
	public TopicLike selectTopicLikeById(TopicLike topicLike){
		return topicLikeDao.selectTopicLikeById(topicLike);
	}
	
	public List<TopicLike> selectTopicLikeList(){
		return topicLikeDao.selectTopicLikeList();
	}
	
}

package com.lose.forum.service.impl;

import com.lose.forum.service.TopicService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.TopicDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Topic;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class TopicServiceImpl implements TopicService {
	
	private static final Logger logger = LoggerFactory.getLogger(TopicServiceImpl.class);
	
	@Autowired
	private TopicDao topicDao;
	
	public Integer addTopic(Topic topic){
		return topicDao.addTopic(topic);
	}
	
	public Integer deleteTopic(Topic topic){
		return topicDao.deleteTopic(topic);
	}
	
	public Integer updateTopic(Topic topic){
		return topicDao.updateTopic(topic);
	}
	
	public Topic selectTopicById(Topic topic){
		return topicDao.selectTopicById(topic);
	}
	
	public List<Topic> selectTopicList(){
		return topicDao.selectTopicList();
	}
	
}

package com.lose.forum.service.impl;

import com.lose.forum.service.ArtileTopicService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.ArtileTopicDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArtileTopic;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class ArtileTopicServiceImpl implements ArtileTopicService {
	
	private static final Logger logger = LoggerFactory.getLogger(ArtileTopicServiceImpl.class);
	
	@Autowired
	private ArtileTopicDao artileTopicDao;
	
	public Integer addArtileTopic(ArtileTopic artileTopic){
		return artileTopicDao.addArtileTopic(artileTopic);
	}
	
	public Integer deleteArtileTopic(ArtileTopic artileTopic){
		return artileTopicDao.deleteArtileTopic(artileTopic);
	}
	
	public Integer updateArtileTopic(ArtileTopic artileTopic){
		return artileTopicDao.updateArtileTopic(artileTopic);
	}
	
	public ArtileTopic selectArtileTopicById(ArtileTopic artileTopic){
		return artileTopicDao.selectArtileTopicById(artileTopic);
	}
	
	public List<ArtileTopic> selectArtileTopicList(){
		return artileTopicDao.selectArtileTopicList();
	}
	
}

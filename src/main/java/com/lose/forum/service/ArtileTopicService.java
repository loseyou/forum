package com.lose.forum.service;

import com.lose.forum.model.ArtileTopic;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface ArtileTopicService{
	
	Integer addArtileTopic(ArtileTopic artileTopic);
	
	Integer deleteArtileTopic(ArtileTopic artileTopic);
	
	Integer updateArtileTopic(ArtileTopic artileTopic);
	
	ArtileTopic selectArtileTopicById(ArtileTopic artileTopic);
	
	List<ArtileTopic> selectArtileTopicList();
	
}

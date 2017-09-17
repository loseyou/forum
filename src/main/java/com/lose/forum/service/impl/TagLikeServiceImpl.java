package com.lose.forum.service.impl;

import com.lose.forum.service.TagLikeService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.TagLikeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.TagLike;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class TagLikeServiceImpl implements TagLikeService {
	
	private static final Logger logger = LoggerFactory.getLogger(TagLikeServiceImpl.class);
	
	@Autowired
	private TagLikeDao tagLikeDao;
	
	public Integer addTagLike(TagLike tagLike){
		return tagLikeDao.addTagLike(tagLike);
	}
	
	public Integer deleteTagLike(TagLike tagLike){
		return tagLikeDao.deleteTagLike(tagLike);
	}
	
	public Integer updateTagLike(TagLike tagLike){
		return tagLikeDao.updateTagLike(tagLike);
	}
	
	public TagLike selectTagLikeById(TagLike tagLike){
		return tagLikeDao.selectTagLikeById(tagLike);
	}
	
	public List<TagLike> selectTagLikeList(){
		return tagLikeDao.selectTagLikeList();
	}
	
}

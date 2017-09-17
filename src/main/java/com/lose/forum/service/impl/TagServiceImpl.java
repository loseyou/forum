package com.lose.forum.service.impl;

import com.lose.forum.service.TagService;
import org.springframework.stereotype.Service;
import com.lose.forum.dao.TagDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Tag;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
@Service
public class TagServiceImpl implements TagService {
	
	private static final Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);
	
	@Autowired
	private TagDao tagDao;
	
	public Integer addTag(Tag tag){
		return tagDao.addTag(tag);
	}
	
	public Integer deleteTag(Tag tag){
		return tagDao.deleteTag(tag);
	}
	
	public Integer updateTag(Tag tag){
		return tagDao.updateTag(tag);
	}
	
	public Tag selectTagById(Tag tag){
		return tagDao.selectTagById(tag);
	}
	
	public List<Tag> selectTagList(){
		return tagDao.selectTagList();
	}
	
}

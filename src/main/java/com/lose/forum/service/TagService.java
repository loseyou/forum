package com.lose.forum.service;

import com.lose.forum.model.Tag;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TagService{
	
	Integer addTag(Tag tag);
	
	Integer deleteTag(Tag tag);
	
	Integer updateTag(Tag tag);
	
	Tag selectTagById(Tag tag);
	
	List<Tag> selectTagList();
	
}

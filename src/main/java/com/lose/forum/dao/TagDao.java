package com.lose.forum.dao;

import com.lose.forum.model.Tag;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TagDao {
	
	Integer addTag(Tag tag);
	
	Integer deleteTag(Tag tag);
	
	Integer updateTag(Tag tag);
	
	Tag selectTagById(Tag tag);
	
	List<Tag> selectTagList();
	
}
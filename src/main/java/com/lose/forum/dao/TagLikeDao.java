package com.lose.forum.dao;

import com.lose.forum.model.TagLike;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TagLikeDao {
	
	Integer addTagLike(TagLike tagLike);
	
	Integer deleteTagLike(TagLike tagLike);
	
	Integer updateTagLike(TagLike tagLike);
	
	TagLike selectTagLikeById(TagLike tagLike);
	
	List<TagLike> selectTagLikeList();
	
}
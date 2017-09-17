package com.lose.forum.service;

import com.lose.forum.model.TagLike;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface TagLikeService{
	
	Integer addTagLike(TagLike tagLike);
	
	Integer deleteTagLike(TagLike tagLike);
	
	Integer updateTagLike(TagLike tagLike);
	
	TagLike selectTagLikeById(TagLike tagLike);
	
	List<TagLike> selectTagLikeList();
	
}

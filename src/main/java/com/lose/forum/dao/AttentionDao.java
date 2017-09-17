package com.lose.forum.dao;

import com.lose.forum.model.Attention;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface AttentionDao {
	
	Integer addAttention(Attention attention);
	
	Integer deleteAttention(Attention attention);
	
	Integer updateAttention(Attention attention);
	
	Attention selectAttentionById(Attention attention);
	
	List<Attention> selectAttentionList();
	
}
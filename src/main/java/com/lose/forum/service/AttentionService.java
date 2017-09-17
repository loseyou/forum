package com.lose.forum.service;

import com.lose.forum.model.Attention;
import java.util.List;


/**
 *
 * @author lose
 * @since 2017-09-17
 */
public interface AttentionService{
	
	Integer addAttention(Attention attention);
	
	Integer deleteAttention(Attention attention);
	
	Integer updateAttention(Attention attention);
	
	Attention selectAttentionById(Attention attention);
	
	List<Attention> selectAttentionList();
	
}

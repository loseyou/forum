package com.lose.forum.controller;

import com.lose.forum.service.AttentionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Attention;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lose
 * @since 2017-09-17
 */
@RestController
@RequestMapping("/attention")
public class AttentionController {

	private static final Logger logger = LoggerFactory.getLogger(AttentionController.class);
	
	@Autowired
	private AttentionService attentionService;
	
	@PostMapping
	public @ResponseBody Integer addAttention(Attention attention){
		return attentionService.addAttention(attention);
	}
	
	@DeleteMapping
	public @ResponseBody Attention deleteAttention(Attention attention) {
		attentionService.deleteAttention(attention);
		return attention;
	}
	
	@PutMapping
	public @ResponseBody Attention updateAttention(Attention attention){
		attentionService.updateAttention(attention);
		return attention;
	}
	
	@GetMapping
	public @ResponseBody Attention selectAttentionById(Attention attention){
		return attentionService.selectAttentionById(attention);
	}
	
	
	@GetMapping("/attentions")
	public @ResponseBody List<Attention> selectAttentionList(){
		return attentionService.selectAttentionList();
	}

}

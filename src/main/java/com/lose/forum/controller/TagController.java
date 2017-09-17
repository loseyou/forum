package com.lose.forum.controller;

import com.lose.forum.service.TagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.Tag;
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
@RequestMapping("/tag")
public class TagController {

	private static final Logger logger = LoggerFactory.getLogger(TagController.class);
	
	@Autowired
	private TagService tagService;
	
	@PostMapping
	public @ResponseBody Integer addTag(Tag tag){
		return tagService.addTag(tag);
	}
	
	@DeleteMapping
	public @ResponseBody Tag deleteTag(Tag tag) {
		tagService.deleteTag(tag);
		return tag;
	}
	
	@PutMapping
	public @ResponseBody Tag updateTag(Tag tag){
		tagService.updateTag(tag);
		return tag;
	}
	
	@GetMapping
	public @ResponseBody Tag selectTagById(Tag tag){
		return tagService.selectTagById(tag);
	}
	
	
	@GetMapping("/tags")
	public @ResponseBody List<Tag> selectTagList(){
		return tagService.selectTagList();
	}

}

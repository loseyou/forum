package com.lose.forum.controller;

import com.lose.forum.service.ArtileTopicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lose.forum.model.ArtileTopic;
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
@RequestMapping("/artileTopic")
public class ArtileTopicController {

	private static final Logger logger = LoggerFactory.getLogger(ArtileTopicController.class);
	
	@Autowired
	private ArtileTopicService artileTopicService;
	
	@PostMapping
	public @ResponseBody Integer addArtileTopic(ArtileTopic artileTopic){
		return artileTopicService.addArtileTopic(artileTopic);
	}
	
	@DeleteMapping
	public @ResponseBody ArtileTopic deleteArtileTopic(ArtileTopic artileTopic) {
		artileTopicService.deleteArtileTopic(artileTopic);
		return artileTopic;
	}
	
	@PutMapping
	public @ResponseBody ArtileTopic updateArtileTopic(ArtileTopic artileTopic){
		artileTopicService.updateArtileTopic(artileTopic);
		return artileTopic;
	}
	
	@GetMapping
	public @ResponseBody ArtileTopic selectArtileTopicById(ArtileTopic artileTopic){
		return artileTopicService.selectArtileTopicById(artileTopic);
	}
	
	
	@GetMapping("/artileTopics")
	public @ResponseBody List<ArtileTopic> selectArtileTopicList(){
		return artileTopicService.selectArtileTopicList();
	}

}

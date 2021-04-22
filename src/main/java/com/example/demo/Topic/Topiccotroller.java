package com.example.demo.Topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topiccotroller {
	@Autowired
	private Topicservice topicService;
	
    @RequestMapping("/topics") 
	public List<Topic> getalltopics() {
		
		return topicService.getalltopics();

	}
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
    	return topicService.getTopic(id);
    }

}

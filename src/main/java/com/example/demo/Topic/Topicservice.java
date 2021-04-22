package com.example.demo.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Topicservice {
	List<Topic> topics =   Arrays.asList(
			new Topic ("Springboot","spring framework","java brains "),
			new Topic ("java dev","core","web"),
			new Topic ("css","Html","java")

             );

public List<Topic> getalltopics(){
	
	
	
	return topics ;
	
           } 
public Topic getTopic(String id ) {
	
	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}

}

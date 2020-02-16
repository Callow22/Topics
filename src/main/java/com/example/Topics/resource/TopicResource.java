package com.example.Topics.resource;

import com.example.Topics.model.Topic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicResource {
    @PostMapping("/topics")
    public ResponseEntity addTopic(Topic topic){
        return new ResponseEntity(HttpStatus.OK);
    }


}

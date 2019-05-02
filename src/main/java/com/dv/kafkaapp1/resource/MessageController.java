package com.dv.kafkaapp1.resource;

import com.dv.kafkaapp1.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class MessageController {

    @Autowired
    private Sender sender;

    @PostMapping("/message")
    public void getMessage(@RequestBody String message) {
        sender.send(message);
    }

}

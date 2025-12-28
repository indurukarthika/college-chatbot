package com.college.chatbot.controller;

import com.college.chatbot.model.ChatbotQA;
import com.college.chatbot.repository.ChatbotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private ChatbotRepository repository;

    @PostMapping
    public String chat(@RequestBody String message) {

        message = message.toLowerCase().trim();

        for (ChatbotQA qa : repository.findAll()) {
            if (message.contains(qa.getKeyword())) {
                return qa.getAnswer();
            }
        }

        return "Sorry 🤔 I didn't understand.";
    }
}

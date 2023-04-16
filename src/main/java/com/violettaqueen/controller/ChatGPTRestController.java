package com.violettaqueen.controller;

import com.violettaqueen.service.ChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.violettaqueen.model.SearchRequest;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ChatGPTRestController {

    private final ChatGPTService chatGPTService;

    public ChatGPTRestController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }


    @PostMapping("searchChatGPT")
    public String searchChatGPT(@RequestBody SearchRequest searchRequest){

        log.info("searchChatGpt Started query: " + searchRequest.getQuery());
        return chatGPTService.processSearch(searchRequest.getQuery());


    }


}

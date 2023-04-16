package com.violettaqueen.service;

import com.violettaqueen.model.ChatGPTRequest;
import com.violettaqueen.model.ChatGPTResponse;
import org.apache.http.client.methods.HttpPost;
import org.springframework.stereotype.Service;

@Service
public class ChatGPTService {

    public String processSearch(String query){

        ChatGPTRequest chatGPTRequest = new ChatGPTRequest();
        chatGPTRequest.setPrompt(query);

        HttpPost post = new HttpPost();
        ChatGPTResponse chatGPTResponse = new ChatGPTResponse();
        return chatGPTResponse.getChatGPTChoicesList().get(0).getText();

    }


}

package com.violettaqueen.model;

import lombok.Data;

import java.util.List;

@Data
public class ChatGPTResponse {

    private List<ChatGPTChoice> chatGPTChoicesList;


}

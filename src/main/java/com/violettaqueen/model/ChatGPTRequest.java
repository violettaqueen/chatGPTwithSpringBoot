package com.violettaqueen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "test-davinci-003";
    private String prompt;
    private int temperature = 1;
    @JsonProperty(value = "max_tokens")
    private int maxTokens = 100;
}

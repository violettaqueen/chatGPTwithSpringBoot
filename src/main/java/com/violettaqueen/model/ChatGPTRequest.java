package com.violettaqueen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "text-davinci-003";
    private String prompt;
    private Integer temperature = 1;
    @SerializedName(value = "max_tokens")
    private Integer maxTokens = 100;
}

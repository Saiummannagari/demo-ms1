package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "message",
        "date"
})
public class Status {

    @JsonProperty(value = "code", required = true)
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonProperty(value = "date", required = true)
    private String date;
}

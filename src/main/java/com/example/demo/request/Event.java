package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "event",
        "qty"
})
public class Event {

    @JsonProperty(value = "event", required = true)
    private String event;

    @JsonProperty(value = "quantity", required = true)
    private Integer qty;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("date")
    private ZonedDateTime date;
}

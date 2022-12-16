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
    "is_gift_card",
    "merchant",
    "method",
    "expiration_date"
})
public class Payment {

    @JsonProperty("is_gift_card")
    private Boolean isGiftCard;

    @JsonProperty("merchant")
    private String merchant;

    @JsonProperty("method")
    private String method;

    @JsonProperty("expiration_date")
    private String expirationDate;
}

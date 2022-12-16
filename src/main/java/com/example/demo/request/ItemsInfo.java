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
    "item_id",
    "sku",
    "quantity"
})
public class ItemsInfo {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty(value = "sku", required = true)
    private String sku;

    @JsonProperty(value = "quantity", required = true)
    private Integer quantity;
}

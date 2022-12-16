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
        "uom",
        "length",
        "width",
        "height",
        "weight",
        "weight_uom"
})
public class Dimension {

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("length")
    private double length;

    @JsonProperty("width")
    private double width;

    @JsonProperty("height")
    private double height;

    @JsonProperty("weight")
    private double weight;

    @JsonProperty("weight_uom")
    private String weightUom;
}
package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "id",
        "store_area",
        "address",
        "url",
        "phone_number",
        "hours"
})
public class Store {

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("store_area")
    private String storeArea;

    @JsonProperty(value = "address", required = true)
    private Address address;

    @JsonProperty("url")
    private String url;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("hours")
    private List<Hour> hours;
}
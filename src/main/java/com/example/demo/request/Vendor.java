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
@JsonPropertyOrder({"phone", "name", "email", "type", "address"})
public class Vendor {

    @JsonProperty(value = "phone", required = true)
    private String phone;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("type")
    private String type;

    @JsonProperty(value = "address", required = true)
    private Address address;

}



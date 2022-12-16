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
    "email",
    "first_name",
    "last_name",
    "phone",
    "address"
})
public class BilledTo {

    @JsonProperty("email")
    private String email;

    @JsonProperty(value = "first_name", required = true)
    private String firstName;

    @JsonProperty(value = "last_name", required = true)
    private String lastName;

    @JsonProperty("phone")
    private Long phone;

    @JsonProperty(value = "address", required = true)
    private Address address;
}

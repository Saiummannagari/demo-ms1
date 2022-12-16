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
    "customer_id",
    "address",
    "email",
    "first_name",
    "last_name",
    "phone",
    "customer_type"
})
public class Customer {

    @JsonProperty(value = "customer_id", required = true)
    private String customerId;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("email")
    private String email;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone")
    private Long phone;

    @JsonProperty("customer_type")
    private String customerType;
}


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
    "street_1",
    "street_2",
    "city",
    "state",
    "zip",
    "country"
})
public class Address {

    @JsonProperty(value = "street_1", required = true)
    private String street1;

    @JsonProperty("street_2")
    private String street2;

    @JsonProperty(value = "city", required = true)
    private String city;

    @JsonProperty(value = "state", required = true)
    private String state;

    @JsonProperty(value = "zip", required = true)
    private Integer zip;

    @JsonProperty(value = "country", required = true)
    private String country;
}

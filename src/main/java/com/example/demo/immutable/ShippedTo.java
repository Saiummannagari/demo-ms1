package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableShippedTo.class)
@JsonDeserialize(as = ImmutableShippedTo.class)
@InterfaceBasedBuilderStyle
public interface ShippedTo {

    @JsonProperty("email")
    Optional<String> getEmail();

    @JsonProperty(value = "first_name", required = true)
    String getFirstName();

    @JsonProperty(value = "last_name", required = true)
    String getLastName();

    @JsonProperty("phone")
    Optional<String> getPhone();

    @JsonProperty(value = "address",required = true)
    Address getAddress();
}

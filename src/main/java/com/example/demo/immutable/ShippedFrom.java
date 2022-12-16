package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableShippedFrom.class)
@JsonDeserialize(as = ImmutableShippedFrom.class)
@InterfaceBasedBuilderStyle
public interface ShippedFrom {

    Optional<String> getCompanyName();

    Optional<String> getEmail();

    Optional<String> getFirstName();

    Optional<String> getLastName();

    Optional<String> getPhone();

    Optional<Address> getAddress();
}

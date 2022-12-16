package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVendor.class)
@JsonDeserialize(as = ImmutableVendor.class)
@InterfaceBasedBuilderStyle
public interface Vendor {

    String getPhone();

    String getName();

    Optional<String> getEmail();

    Optional<String> getType();

    Address getAddress();
}

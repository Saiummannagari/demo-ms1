package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableAddress.class)
@JsonDeserialize(as = ImmutableAddress.class)
@InterfaceBasedBuilderStyle
public interface Address {

    String getStreet1();

    Optional<String> getStreet2();

    String getCity();

    String getState();

    String getZip();

    String getCountry();
}

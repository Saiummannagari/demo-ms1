package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Address;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBilledTo.class)
@JsonDeserialize(as = ImmutableBilledTo.class)
@InterfaceBasedBuilderStyle
public interface BilledTo {

    Optional<String> getEmail();

    String getFirstName();

    String getLastName();

    Optional<String> getPhone();

    Address getAddress();
}

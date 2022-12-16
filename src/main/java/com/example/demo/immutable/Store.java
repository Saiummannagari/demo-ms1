package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Address;
import com.example.demo.request.Hour;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStore.class)
@JsonDeserialize(as = ImmutableStore.class)
@InterfaceBasedBuilderStyle
public interface Store {

    Optional<String> getName();

    Optional<String> getId();

    Optional<String> getStoreArea();

    Address getAddress();

    Optional<String> getUrl();

    Optional<String> getPhoneNumber();

    Optional<List<Hour>> getHours();
}

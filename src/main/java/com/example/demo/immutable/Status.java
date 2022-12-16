package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStatus.class)
@JsonDeserialize(as = ImmutableStatus.class)
@InterfaceBasedBuilderStyle
public interface Status {

    String getCode();

    Optional<String> getMessage();

    String getDate();
}

package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableOrderEvent.class)
@JsonDeserialize(as = ImmutableOrderEvent.class)
@InterfaceBasedBuilderStyle
public interface OrderEvent {

    Optional<String> getEvent();

    Optional<String> getDate();
}

package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableItemEvent.class)
@JsonDeserialize(as = ImmutableItemEvent.class)
@InterfaceBasedBuilderStyle
public interface ItemEvent {

    String getEvent();

    Integer getQty();

    Optional<Integer> getSequence();

    Optional<String> getDate();
}

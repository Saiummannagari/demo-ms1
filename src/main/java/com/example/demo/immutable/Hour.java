package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableHour.class)
@JsonDeserialize(as = ImmutableHour.class)
@InterfaceBasedBuilderStyle
public interface Hour {

    String getOpen();

    String getClose();
}

package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableDimension.class)
@JsonDeserialize(as = ImmutableDimension.class)
@InterfaceBasedBuilderStyle
public interface Dimension {

    Optional<String> getUom();

    Optional<Double> getLength();

    Optional<Double> getWidth();

    Optional<Double> getHeight();

    Optional<Double> getWeight();

    Optional<String> getWeightUom();
}

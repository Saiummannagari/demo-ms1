package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableItemsInfo.class)
@JsonDeserialize(as = ImmutableItemsInfo.class)
@InterfaceBasedBuilderStyle
public interface ItemsInfo {

    Optional<String> getItemId();

    String getSku();

    Integer getQuantity();
}

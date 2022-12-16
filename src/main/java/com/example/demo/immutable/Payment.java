package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePayment.class)
@JsonDeserialize(as = ImmutablePayment.class)
@InterfaceBasedBuilderStyle
public interface Payment {

    Optional<Boolean> getIsGiftCard();

    Optional<String> getMerchant();

    Optional<String> getMethod();

    Optional<String> getExpirationDate();
}

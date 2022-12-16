package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.BilledTo;
import com.example.demo.request.Payment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBilling.class)
@JsonDeserialize(as = ImmutableBilling.class)
@InterfaceBasedBuilderStyle
public interface Billing {

    Optional<Double> getAmount();

    Optional<List<Payment>> getPayments();

    BilledTo getBilledTo();

    Optional<Double> getTaxAmount();

    Optional<Double> getTaxRate();

    Optional<Double> getShippingHandling();
}

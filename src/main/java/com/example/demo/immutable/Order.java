package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.OrderInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOrder.class)
@JsonDeserialize(as = ImmutableOrder.class)
@InterfaceBasedBuilderStyle
public interface Order {

    OrderInfo getOrderInfo();
}

package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.*;
import com.example.demo.request.Billing;
import com.example.demo.request.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableOrderInfo.class)
@JsonDeserialize(as = ImmutableOrderInfo.class)
@InterfaceBasedBuilderStyle
public interface OrderInfo {

    Integer getOrderNumber();

    String getOrderDate();

    List<OrderItem> getOrderItems();

    Optional<Billing> getBilling();

    Customer getCustomer();

    Optional<Map<String, String>> getAttributes();

    Optional<String> getCurrencyCode();

    Optional<List<Shipment>> getShipments();

    Optional<List<PickUp>> getPickups();

    Optional<List<OrderEvent>> getEvents();

    Optional<String> getOrderPromiseDate();

    Optional<String> getSelectedShipMethod();
}

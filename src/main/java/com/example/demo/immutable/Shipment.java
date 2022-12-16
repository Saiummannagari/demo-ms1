package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.ItemsInfo;
import com.example.demo.request.ShippedFrom;
import com.example.demo.request.ShippedTo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableShipment.class)
@JsonDeserialize(as = ImmutableShipment.class)
@InterfaceBasedBuilderStyle
public interface Shipment {

    List<ItemsInfo> getItemsInfo();

    Optional<String> getShipMethod();

    String getCarrier();

    Optional<String> getCarrierService();

    Optional<String> getShipSource();

    String getShipDate();

    Optional<Double> getShipDiscount();

    Optional<Double> getShipTax();

    Optional<Double> getShipTotal();

    String getTrackingNumber();

    Optional<ShippedFrom> getShippedFrom();

    ShippedTo getShippedTo();
}

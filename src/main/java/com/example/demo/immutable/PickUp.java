package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.ItemsInfo;
import com.example.demo.request.Status;
import com.example.demo.request.Store;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePickUp.class)
@JsonDeserialize(as = ImmutablePickUp.class)
@InterfaceBasedBuilderStyle
public interface PickUp {

    String getId();

    List<ItemsInfo> getItemsInfo();

    Status getStatus();

    Optional<String> getEta();

    Optional<String> getPickupByDate();

    Optional<Map<String, String>> getAttributes();

    Store getStore();

    Optional<String> getCarrier();

    Optional<String> getTrackingNumber();

    Optional<String> getShipDate();

    Optional<String> getType();
}

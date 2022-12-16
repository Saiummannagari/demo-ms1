package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.example.demo.request.Dimension;
import com.example.demo.request.Event;
import com.example.demo.request.Vendor;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableOrderItem.class)
@JsonDeserialize(as = ImmutableOrderItem.class)
@InterfaceBasedBuilderStyle
public interface OrderItem {

    Optional<List<String>> getCategories();

    Optional<Boolean> getIsBackordered();

    Optional<List<Vendor>> getVendors();

    Optional<String> getDescription();

    Optional<Double> getDiscountAmount();

    Optional<Double> getDiscountPercent();

    Optional<String> getFinalSaleDate();

    String getFulfillmentStatus();

    Optional<Boolean> getIsFinalSale();

    Optional<Boolean> getIsGift();

    Optional<String> getItemId();

    String getItemImage();

    Optional<String> getItemPromiseDate();

    String getItemUrl();

    Optional<Integer> getLineNumber();

    String getName();

    Integer getQuantity();

    String getSku();

    Integer getUnitPrice();

    Optional<String> getFulfillmentType();

    Optional<Map<String, String>> getAttributes();

    Optional<Dimension> getDimension();

    Optional<List<ItemEvent>> getEvents();

    Optional<String> getAnticipatedShipDate();
}

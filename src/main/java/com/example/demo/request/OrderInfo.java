
package com.example.demo.request;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order_number",
    "order_date",
    "order_items",
    "billing",
    "customer",
    "attributes",
    "currency_code",
    "shipments",
    "pickups",
    "events",
    "order_promise_date",
    "selected_ship_method"
})
public class OrderInfo {

    @JsonProperty("order_number")
    private Integer orderNumber;

    @JsonProperty("order_date")
    private String orderDate;

    @JsonProperty("order_items")
    private List<OrderItem> orderItems;

    @JsonProperty("billing")
    private Billing billing;

    @JsonProperty("customer")
    private Customer customer;

    @JsonProperty("attributes")
    private Map<String, String> attributes;

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty(value = "shipments", required = true)
    private List<Shipment> shipments;

    @JsonProperty("pickups")
    private PickUp pickups;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("order_promise_date")
    private String order_promise_date;

    @JsonProperty("selected_ship_method")
    private String selected_ship_method;
}

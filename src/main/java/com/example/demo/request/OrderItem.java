package com.example.demo.request;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categories",
    "is_backordered",
    "vendors",
    "description",
    "discount_amount",
    "discount_percent",
    "final_sale_date",
    "fulfillment_status",
    "is_final_sale",
    "is_gift",
    "item_id",
    "item_image",
    "item_promise_date",
    "item_url",
    "line_number",
    "name",
    "quantity",
    "sku",
    "unit_price",
    "fulfillment_type",
    "attributes",
    "dimension",
    "events",
    "anticipated_ship_date"
})
public class OrderItem {

    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("is_backordered")
    private Boolean isBackordered;

    @JsonProperty("vendors")
    private List<Vendor> vendors;

    @JsonProperty("description")
    private String description;

    @JsonProperty("discount_amount")
    private double discountAmount;

    @JsonProperty("discount_percent")
    private double discountPercent;

    @JsonProperty("final_sale_date")
    private String finalSaleDate;

    @JsonProperty(value = "fulfillment_status", required = true)
    private String fulfillmentStatus;

    @JsonProperty("is_final_sale")
    private Boolean isFinalSale;

    @JsonProperty("is_gift")
    private Boolean isGift;

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty(value = "item_image", required = true)
    private String itemImage;

    @JsonProperty("item_promise_date")
    private String itemPromiseDate;

    @JsonProperty(value = "item_url", required = true)
    private String itemUrl;

    @JsonProperty("line_number")
    private Integer lineNumber;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "quantity", required = true)
    private Integer quantity;

    @JsonProperty(value = "sku", required = true)
    private String sku;

    @JsonProperty(value = "unit_price", required = true)
    private Integer unitPrice;

    @JsonProperty("fulfillment_type")
    private String fulfillmentType;

    @JsonProperty("attributes")
    private Map<String, String> attributes;

    @JsonProperty("dimension")
    private Dimension dimension;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("anticipated_ship_date")
    private String anticipated_ship_date;
}

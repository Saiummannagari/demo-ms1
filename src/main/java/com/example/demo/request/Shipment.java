package com.example.demo.request;

import java.util.List;
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
    "items_info",
    "ship_method",
    "carrier",
    "carrier_service",
    "ship_source",
    "ship_date",
    "ship_discount",
    "ship_tax",
    "ship_total",
    "tracking_number",
    "shipped_from",
    "shipped_to"
})
public class Shipment {

    @JsonProperty(value = "items_info", required = true)
    private List<ItemsInfo> itemsInfo;

    @JsonProperty("ship_method")
    private String shipMethod;

    @JsonProperty(value = "carrier", required = true)
    private String carrier;

    @JsonProperty("carrier_service")
    private String carrierService;

    @JsonProperty("ship_source")
    private String shipSource;

    @JsonProperty(value = "ship_date", required = true)
    private String shipDate;

    @JsonProperty("ship_discount")
    private double shipDiscount;

    @JsonProperty("ship_tax")
    private double shipTax;

    @JsonProperty("ship_total")
    private double shipTotal;

    @JsonProperty(value = "tracking_number", required = true)
    private String trackingNumber;

    @JsonProperty("shipped_from")
    private ShippedFrom shippedFrom;

    @JsonProperty(value = "shipped_to", required = true)
    private ShippedTo shippedTo;

}

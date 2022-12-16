package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "items_info",
        "status",
        "eta",
        "pickup_by_date",
        "attributes",
        "store",
        "carrier",
        "tracking_number",
        "ship_date",
        "type"
})
public class PickUp {
    @JsonProperty(value = "id", required = true)
    private String id;

    @JsonProperty("items_info")
    private List<ItemsInfo> itemsInfo;

    @JsonProperty(value = "status", required = true)
    private Status status;

    @JsonProperty("eta")
    private String eta;

    @JsonProperty("pickup_by_date")
    private String pickupByDate;

    @JsonProperty("attributes")
    private Map<String, String> attributes;

    @JsonProperty(value = "store", required = true)
    private Store store;

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    @JsonProperty("ship_date")
    private String shipDate;

    @JsonProperty("type")
    private String type;
}

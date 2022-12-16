
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
    "amount",
    "payments",
    "billed_to",
    "tax_amount",
    "tax_rate",
    "shipping_handling"
})
public class Billing {

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("payments")
    private List<Payment> payments;

    @JsonProperty(value = "billed_to", required = true)
    private BilledTo billedTo;

    @JsonProperty("tax_amount")
    private double taxAmount;

    @JsonProperty("tax_rate")
    private double taxRate;

    @JsonProperty("shipping_handling")
    private double shippingHandling;
}

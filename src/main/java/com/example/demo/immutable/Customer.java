package com.example.demo.immutable;

import com.example.demo.InterfaceBasedBuilderStyle;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableCustomer.class)
@JsonDeserialize(as = ImmutableCustomer.class)
@InterfaceBasedBuilderStyle
public interface Customer {

    String getCustomerId();

    Optional<Address> getAddress();

    Optional<String> getEmail();

    Optional<String> getFirstName();

    Optional<String> getLastName();

    Optional<Long> getPhone();

    Optional<String> getCustomerType();
}

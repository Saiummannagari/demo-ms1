package com.example.demo.rest;


import com.example.demo.request.Order;
import com.example.demo.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="narvar",url = "${narvar.url}")
public interface NarvarFeignClient {

    @PostMapping(value = "/orders")
    Response updateOrder(@RequestBody Order order);

    @PutMapping(value = "/orders/{order_number}/shipments")
    Response updateShipments(@PathVariable("order_number") String orderNumber);

    @GetMapping(value = "/orders/{order_number}")
    Response retrieveOrderDetails(@PathVariable("order_number") String orderNumber);
}

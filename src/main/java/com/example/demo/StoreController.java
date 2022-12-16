package com.example.demo;

import com.example.demo.domain.Store;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    private final StoreImpl impl;

    public StoreController(StoreImpl impl) {
        this.impl = impl;
    }

    @GetMapping(value = "/stores")
    public ResponseEntity<List<Store>> get() throws InterruptedException {

               Thread.sleep(10000);
        return  impl.getStores();
    }
}

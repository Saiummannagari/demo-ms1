package com.example.demo;

import com.example.demo.domain.Store;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreImpl {

    public ResponseEntity<List<Store>> getStores() {
        ArrayList<Store> stores = new ArrayList<>();

        stores.add(Store.builder().id(1).storeName("hyderabad").build());
        stores.add(Store.builder().id(2).storeName("mumbai").build());
        stores.add(Store.builder().id(3).storeName("bangalore").build());

//        for(Store s: stores) {
//            System.out.println(s.getId()+" "+s.getStoreName());
//        }

//        return new ArrayList<Store>(){{
//            add(new Store(1,"hyderabad"));
//            add(new Store(2,"mumbai"));
//            add(new Store(3,"bangalore"));
//        }};
        return ResponseEntity.status(403).body(stores);

    }
}

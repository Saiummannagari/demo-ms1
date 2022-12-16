package com.example.demo.domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Builder
@Getter
@Setter
@NonNull
//@RequiredArgsConstructor
//@NoArgsConstructor
public class Store  {


    int id;

    String storeName;

   public Store() {

   }

    public Store(int id, String storeName) {
        this.id = id;
        this.storeName = storeName;
    }
}

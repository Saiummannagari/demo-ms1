package com.example.demo.errordecoder;

import feign.FeignException;
import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NarvarErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 403) {
            throw new ArithmeticException("exception");
        } else {
            return new RuntimeException("error");
        }
    }
}

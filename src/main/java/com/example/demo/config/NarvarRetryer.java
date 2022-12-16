package com.example.demo.config;

import feign.RetryableException;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Slf4j
@RefreshScope
@Component
public class NarvarRetryer implements Retryer {
    @Value("${narvar.retryMaxAttempts}")
    private int retryMaxAttempt = 5;

    @Value("${narvar.retryInterval}")
    private long retryInterval = 3000L;
    private int attempts;
    NarvarRetryer() {
        this.attempts = 1;
    }

    @Override
    public void continueOrPropagate(RetryableException e) {
        System.out.println("retry max attempts :: "+ retryMaxAttempt);
        System.out.println("retryInterval :: "+retryInterval);
        log.info("Feign retry attempt {} due to {} ", attempts, e.getMessage());
        if(attempts++ == retryMaxAttempt){
            log.error("Encountered exeception {} ", e.getMessage());
            throw e;
        }
        try {
            Thread.sleep(retryInterval);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Retryer clone() {
        return new NarvarRetryer();
    }

}

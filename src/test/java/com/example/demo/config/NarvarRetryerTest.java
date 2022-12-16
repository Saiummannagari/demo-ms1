package com.example.demo.config;

import com.example.demo.errordecoder.NarvarErrorDecoder;
import com.example.demo.rest.NarvarFeignClient;
import feign.*;
import feign.Request.Options;
import feign.codec.ErrorDecoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
//@TestPropertySource
public class NarvarRetryerTest {

    @Autowired
    private NarvarRetryer narvarRetryer;

    @Mock
    private Retryer retryer;

    @Mock
    Client clientMock;

//    @Autowired
//    NarvarFeignClient narvarFeignClient;

    @Test
    public void continueOrPropagateTest() throws IOException {
        RetryableException exception = constructRetryableException();
        when(clientMock.execute(any(Request.class), any(Options.class))).thenThrow(exception);
//        narvarRetryer.continueOrPropagate(exception);
//        doThrow(exception).when(retryer).continueOrPropagate(any());
//        assertEquals(5, narvarRetryer.continueOrPropagate(exception));
//        verify(narvarRetryer, times(5)).continueOrPropagate(exception);

        NarvarFeignClient narvarFeignClient = Feign.builder()
                .client(clientMock)
                .retryer(narvarRetryer)
                .contract(new SpringMvcContract())
                .target(NarvarFeignClient.class,"https://api.github.com");
        assertThrows(RetryableException.class, () ->narvarFeignClient.retrieveOrderDetails("121"));
        verify(clientMock, times(5)).execute(any(Request.class), any(Options.class));
    }

    @Test
    public void continueOrPropagateTest2() throws IOException {
        ArithmeticException exception = constructArthematicException();
        when(clientMock.execute(any(Request.class), any(Options.class))).thenThrow(exception);
//        narvarRetryer.continueOrPropagate(exception);
//        doThrow(exception).when(retryer).continueOrPropagate(any());
//        assertEquals(5, narvarRetryer.continueOrPropagate(exception));
//        verify(narvarRetryer, times(5)).continueOrPropagate(exception);

        NarvarFeignClient narvarFeignClient = Feign.builder()
                .client(clientMock)
                .retryer(narvarRetryer)
                .contract(new SpringMvcContract())
                .target(NarvarFeignClient.class,"https://api.github.com");
        assertThrows(ArithmeticException.class, () ->narvarFeignClient.retrieveOrderDetails("121"));
        verify(clientMock, times(   1)).execute(any(Request.class), any(Options.class));
    }

    RetryableException constructRetryableException() {
      return new RetryableException(500,
                    "Internal service error",
                    Request.HttpMethod.GET,
                    null,
                    Request.create(Request.HttpMethod.GET, "", new HashMap<>(), Request.Body.empty(), null));
    }

    ArithmeticException constructArthematicException() {
        return new ArithmeticException();
    }
}

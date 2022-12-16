package com.example.demo.errordecoder;

import com.example.demo.response.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Request;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NarvarErrorDecoderTest {

    @Mock
    private ErrorDecoder errorDecoder;

    @Autowired
    private NarvarErrorDecoder narvarErrorDecoder;

    @Test
    public void testAuthenticationException() throws Exception {
//        ReflectionErrorDecoder<ErrorCodeAndMessage, BaseServiceException> authenticationErrorDecoder =
//                new ServiceExceptionErrorDecoder(
//                        TestApiClassWithPlainExceptions.class, fallbackErrorDecoderMock);
        Response response = getResponseWithErrorCode("403", "403", "Forbidden");

       // errorDecoder.decode("", response);

        assertThrows(ArithmeticException.class, ()->narvarErrorDecoder.decode("", response));
       // verify(narvarErrorDecoder).decode(eq(""), Mockito.any(Response.class));
    }


    private Response getResponseWithErrorCode(String status, String code, String message)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return Response.builder()
                .status(403)
                .reason("")
                .headers(new HashMap<>())
                .body(
                        objectMapper.writeValueAsString(
                                        com.example.demo.response.Response.builder().status(status).messages(Collections.singletonList(Message.builder().code(code).message(message).build())).build()
                        ),StandardCharsets.UTF_8)
                .request(Request.create(Request.HttpMethod.GET, "", new HashMap<>(), Request.Body.empty(), null))
                .build();
    }

}

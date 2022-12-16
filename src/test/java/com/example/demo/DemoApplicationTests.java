package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.example.demo.rest.NarvarFeignClient")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

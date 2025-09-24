package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Value("${hello.message}")
    private String expectedMessage;    

    @Test
    void helloEndpointShouldReturnMessage() {
        String body = this.restTemplate.getForObject("/hello", String.class);
        assertThat(body).isEqualTo(expectedMessage);
    }

    
}


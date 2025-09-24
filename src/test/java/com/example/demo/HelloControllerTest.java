package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHello() {
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello CI/CD with GitHub Actions and Docker! Cambio para probar pipeline");
    }
}

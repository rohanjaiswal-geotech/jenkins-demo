package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class DemoApplicationTests {

    DemoApplication demoApplication;

    @Test
    void DemoTestCase1() {
        demoApplication = new DemoApplication();
        assertThat(demoApplication.DemoTestCase()).isEqualTo(true);
    }

    @Test
    void DemoTestCase2() {
        demoApplication = new DemoApplication();
        assertThat(demoApplication.DemoTestCase()).isEqualTo(true);
    }

}

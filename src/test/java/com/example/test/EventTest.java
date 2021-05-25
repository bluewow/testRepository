package com.example.test;

import com.example.test.event.RegisterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EventTest {

    @Autowired
    RegisterService service;

    @Test
    void test() throws InterruptedException {
        service.register("홍길동");
        Thread.sleep(3000);
    }

}

package com.example.test.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SmsEventHandler {
    @Async
    @EventListener
    public void sendSms(RegisteredEvent event) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(event.getName() + "가입을 축하합니다");
    }
    @Async
    @EventListener
    public void makeCoupon(RegisteredEvent event) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(event.getName() + "쿠폰을 전송합니다");
    }
}

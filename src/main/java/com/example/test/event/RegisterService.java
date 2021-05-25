package com.example.test.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 이벤트를 전달하는 주체
 */
@RequiredArgsConstructor
@Service
public class RegisterService {

    private final ApplicationEventPublisher publisher;

    public void register(String name) {
        System.out.println("회원 추가 완료");
        publisher.publishEvent(new RegisteredEvent(name));
        System.out.println("회원 가입 완료");
    }
}

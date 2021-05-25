package com.example.test.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *  이벤트는 상태가 바뀐후에 발생하기 때문에 이름은 과거시제로 짓는다
 */

@Getter
@AllArgsConstructor
public class RegisteredEvent {
    String name;
}

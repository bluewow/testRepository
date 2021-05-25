package com.example.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserVo {
    String userId;
    String test;

    public UserVo(String userId, String test) {
        this.userId = userId;
        this.test = test;
    }
}

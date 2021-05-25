package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.util.SerializationUtils;


public class SerializableTest {

    @Test
    void testUserSession() {
        UserSession userSession = new UserSession();
        byte[] serialize = SerializationUtils.serialize(userSession);


    }
}

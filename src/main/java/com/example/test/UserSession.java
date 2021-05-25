package com.example.test;

import lombok.*;
import org.springframework.util.SerializationUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class UserSession extends ab implements Serializable {
    private String name;
    private Object object;
    private Date creation = new Date();
    private Map<String, Object> dictionary = new HashMap<String, Object>();

    public UserSession(String name) {
        TESTA testA = new TESTA();

    }


}

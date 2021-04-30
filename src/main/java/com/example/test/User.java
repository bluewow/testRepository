package com.example.test;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OptimisticLocking;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Lock;

@Setter
@Getter
@Entity
@Table
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    Long id;

    String name;
}

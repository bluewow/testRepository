package com.example.test;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//     @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
//     @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "14000")})
     Optional<User> findByName(String name);
}

package com.example.test;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.lang.Nullable;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//     @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
//     @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "14000")})
     @NotNull
     User findByName(String name);
}

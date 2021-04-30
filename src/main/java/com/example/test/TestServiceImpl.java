package com.example.test;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.OptimisticLock;
import org.hibernate.annotations.OptimisticLocking;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;


@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {
    private final UserRepository userRepository;
    private final Utils utils;

    @Transactional
    @Override
    public void test() {
        System.out.println(utils.getTarget());

    }

}

package com.example.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

//@Component
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {

    private Map<String, Long> start;
    private Map<String, Long> end;

    public MyBeanPostProcessor() {
        start = new HashMap<>();
        end = new HashMap<>();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        start.put(beanName, System.currentTimeMillis());
        return bean;
    }

    Long totalTime = 0L;
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        end.put(beanName, System.currentTimeMillis());

        Long time = initializationTime(beanName);
        totalTime += time;

        System.out.println("beanName :" + beanName + " time : " + time + " totalTime : " + totalTime);
        return bean;
    }

    @Override
    public int getOrder() {
        return Integer.MAX_VALUE;
    }

    //this method returns initialization time of the bean.
    public long initializationTime(String beanName) {
        return end.get(beanName) - start.get(beanName);
    }
}
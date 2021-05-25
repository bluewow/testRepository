package com.example.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private long launchTime;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        launchTime = System.currentTimeMillis();
    }

    public long getLaunchTime() {
        return launchTime;
    }
}
package org.forest.models;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Dog implements ApplicationContextAware {

    ApplicationContext context;

    public Dog() {
        System.out.println("Dog constructor...");

    }

//    @PostConstruct
    public void init() {
        System.out.println("Dog... @PostConstruct...");
    }


//    @PreDestroy
    public void destroy() {
        System.out.println("Dog ... @PreDestroy...");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        context = applicationContext;
    }
}

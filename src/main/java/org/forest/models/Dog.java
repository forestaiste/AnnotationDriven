package org.forest.models;


public class Dog {

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
}

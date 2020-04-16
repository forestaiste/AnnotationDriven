package org.forest.test;

import org.forest.config.MainConfig;
import org.forest.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitions = context.getBeanDefinitionNames();

        for (String d: definitions) {
            System.out.println(d);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] definitions = context.getBeanDefinitionNames();
//
//        for (String d: definitions) {
//            System.out.println(d);
//        }
//
        System.out.println("Container is created");
        Object p = context.getBean("person");
//        Object p2 = context.getBean("person");
//
//        System.out.println(p == p2);
    }
}

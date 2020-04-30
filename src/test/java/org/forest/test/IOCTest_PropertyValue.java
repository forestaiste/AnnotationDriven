package org.forest.test;


import org.forest.config.MainConfigOfPropertyValues;
import org.forest.models.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01() {

        printBeans(context);

        System.out.println("=============");

        Person p = (Person)context.getBean("person");
        System.out.println(p);

        ConfigurableEnvironment env = context.getEnvironment();
        String nickName = env.getProperty("nickName");
        System.out.println("nickname = " + nickName);
        context.close();
    }

    private void printBeans(AnnotationConfigApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}

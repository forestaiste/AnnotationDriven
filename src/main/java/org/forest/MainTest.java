package org.forest;

import org.forest.config.MainConfig;
import org.forest.models.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        Person p = (Person) context.getBean(Person.class);

        System.out.println(p.getName());

        String[] names = context.getBeanNamesForType(Person.class);

        for (String n: names) {
           System.out.println(n);
        }
    }
}

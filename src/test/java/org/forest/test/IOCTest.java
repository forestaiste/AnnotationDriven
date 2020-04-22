package org.forest.test;

import org.forest.config.MainConfig;
import org.forest.config.MainConfig2;
import org.forest.models.Blue;
import org.forest.models.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitions = context.getBeanDefinitionNames();

        for (String d: definitions) {
            System.out.println(d);
        }

        Person p = (Person)context.getBean("person");
        System.out.println(p.getName());
    }

    @Test
    public void test02() {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitions = context.getBeanDefinitionNames();

        for (String d: definitions) {
            System.out.println(d);
        }

        System.out.println("Container is created");
        Object p = context.getBean("person");
        Object p2 = context.getBean("person");

        System.out.println(p == p2);
    }

    @Test
    public void test03() {
        ConfigurableEnvironment env = context.getEnvironment();
        String property = env.getProperty(("os.name"));

        System.out.println(property);

        String[] names = context.getBeanNamesForType(Person.class);

        for (String name: names) {
            System.out.println(name);
        }

        Map<String, Person> persons = context.getBeansOfType(Person.class);
        System.out.println(persons);
    }

    private void printBeans(AnnotationConfigApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void testImport() {
        printBeans(context);

        Blue blue = context.getBean(Blue.class);
        System.out.println(blue);

        Object bean = context.getBean("colorFactoryBean");
        System.out.println("bean's type: " + bean.getClass());
    }
}

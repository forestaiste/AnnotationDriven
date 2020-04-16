package org.forest.config;

import org.forest.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    @Bean("person")
    @Scope("prototype")
    public Person person() {
        System.out.println("Add person into container");

        return new Person("zhangsan", 25);
    }
}

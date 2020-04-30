package org.forest.config;

import org.forest.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:/person.yml"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person() {
        return  new Person();
    }
}

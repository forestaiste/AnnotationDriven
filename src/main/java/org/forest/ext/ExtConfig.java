package org.forest.ext;

import org.forest.models.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.forest.ext")
@Configuration
public class ExtConfig {

    @Bean
    public  Car car() {
        return new Car();
    }
}

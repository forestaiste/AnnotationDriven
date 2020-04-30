package org.forest.config;

import org.forest.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "org.forest", useDefaultFilters =  false, includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
})
public class MainConfig {
    @Bean
    public Person person() {
        return new Person("LiSi", 20, "Tom");
    }
}


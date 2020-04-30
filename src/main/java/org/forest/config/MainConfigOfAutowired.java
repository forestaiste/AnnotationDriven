package org.forest.config;

import org.forest.dao.BookDao;
import org.forest.models.Boss;
import org.forest.models.Car;
import org.forest.models.Color;
import org.forest.models.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"org.forest.service", "org.forest.dao", "org.forest.controller"})
public class MainConfigOfAutowired {
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao() {

        BookDao dao = new BookDao();
        dao.setLabel("2");

        return dao;
    }

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Boss boss(Car car) {
        return new Boss(car);
    }

    @Bean
    public Color color(Car car) {
        Color color = new Color();
        color.setCar(car);
        return color;
    }

    @Bean
    public Red red() {
        return new Red();
    }
}

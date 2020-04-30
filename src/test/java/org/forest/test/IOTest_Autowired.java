package org.forest.test;

import org.forest.config.MainConfigOfAutowired;
import org.forest.config.MainConfigOfPropertyValues;
import org.forest.dao.BookDao;
import org.forest.models.Boss;
import org.forest.models.Car;
import org.forest.models.Color;
import org.forest.models.Person;
import org.forest.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOTest_Autowired {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test01() {

        BookService service = context.getBean(BookService.class);

        System.out.println(service);

        BookDao dao = (BookDao)context.getBean("bookDao2");
        System.out.println(dao);

        Boss boss = context.getBean(Boss.class);
        System.out.println(boss);

        Car car = context.getBean(Car.class);
        System.out.println(car);

        Color color = context.getBean(Color.class);
        System.out.println(color);
        System.out.println(context);
        context.close();
    }
}

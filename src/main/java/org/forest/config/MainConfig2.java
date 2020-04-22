package org.forest.config;

import org.forest.condition.LinuxCondition;
import org.forest.condition.MyImportBeanDefinitionRegistrar;
import org.forest.condition.MyImportSelector;
import org.forest.condition.WindowsCondition;
import org.forest.models.Color;
import org.forest.models.ColorFactoryBean;
import org.forest.models.Person;
import org.springframework.context.annotation.*;

@Conditional({LinuxCondition.class})
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfig2 {

    @Lazy
    @Bean("person")
    @Scope(scopeName = "prototype")
    public Person person() {
        System.out.println("Add person into container");

        return new Person("zhangsan", 25);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return  new Person("Bill Gates", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return  new Person("linus", 42);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}

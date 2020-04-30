package org.forest.test;

import org.forest.aop.MathCalculator;
import org.forest.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOTest_AOP {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

    @Test
    public void test01() {

        MathCalculator calculator = context.getBean(MathCalculator.class);

        calculator.div(10, 2);

        calculator.multiply(5, 3);

        context.close();
    }
}

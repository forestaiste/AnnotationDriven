package org.forest.test;

import org.forest.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        System.out.println("Container was created");

        context.close();
    }
}

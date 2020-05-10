package org.forest.test;

import org.junit.Test;
import org.forest.ext.ExtConfig;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOTest_Ext {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);

        context.publishEvent(new ApplicationEvent(new String("my published event.")) {
        });
        context.close();
    }
}

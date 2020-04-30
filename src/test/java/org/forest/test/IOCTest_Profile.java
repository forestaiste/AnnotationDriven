package org.forest.test;


import org.forest.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;

public class IOCTest_Profile {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //context.getEnvironment().setActiveProfiles("test", "dev");
        context.register(MainConfigOfProfile.class);
        context.refresh();

        String[] names = context.getBeanNamesForType(DataSource.class);

        for (String name : names) {
            System.out.println(name);
        }
        context.close();
    }
}

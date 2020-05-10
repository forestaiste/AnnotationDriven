package org.forest.test;

import org.forest.tx.TxConfig;
import org.forest.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOTest_Tx {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService service = context.getBean(UserService.class);

        service.insertUser();
        context.close();
    }
}

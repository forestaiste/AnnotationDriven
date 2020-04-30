package org.forest.models;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("forwarded IoC " + applicationContext);

        this.applicationContext = applicationContext;
    }


    public void setBeanName(String s) {
        System.out.println("Current name of bean: " + s);
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String resolvedValue = stringValueResolver.resolveStringValue("Hi ${os.name}");

        System.out.println("Resolved string value: " + resolvedValue);
    }
}

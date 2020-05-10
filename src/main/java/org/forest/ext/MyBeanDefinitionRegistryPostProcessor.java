package org.forest.ext;

import org.forest.models.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor-postProcessBeanDefinitionRegistry...bean count: " + beanDefinitionRegistry.getBeanDefinitionCount());

        RootBeanDefinition definition = new RootBeanDefinition(Car.class);
        //AbstractBeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Car.class).getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("hello", definition);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor-postProcessBeanFactory...bean count: " + configurableListableBeanFactory.getBeanDefinitionCount());
    }
}

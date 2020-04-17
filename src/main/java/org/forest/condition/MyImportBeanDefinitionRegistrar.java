package org.forest.condition;

import org.forest.models.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasRed = registry.containsBeanDefinition("org.forest.models.Red");
        boolean hasBlue = registry.containsBeanDefinition("org.forest.models.Blue");

        if (hasBlue && hasRed) {
            RootBeanDefinition rainbow = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow", rainbow);
        }
    }
}

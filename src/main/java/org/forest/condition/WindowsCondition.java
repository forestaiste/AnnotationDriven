package org.forest.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory factory = conditionContext.getBeanFactory();

        ClassLoader loader = conditionContext.getClassLoader();
        Environment env = conditionContext.getEnvironment();
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = env.getProperty("os.name");

        if (property.contains("Windows"))
        {
            return true;
        }

        return false;
    }
}

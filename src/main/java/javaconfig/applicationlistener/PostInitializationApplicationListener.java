package javaconfig.applicationlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;
import java.util.Map;

public class PostInitializationApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ConfigurableListableBeanFactory beanFactory;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Map<String, Object> allBeans = event.getApplicationContext().getBeansOfType(Object.class);

        for (Map.Entry<String, Object> beanEntry : allBeans.entrySet()) {
            String beanName = beanEntry.getKey();
            Object bean = beanEntry.getValue();

            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                Class beanClass = Class.forName(beanClassName);

                for (Method method : beanClass.getMethods()) {
                    if (method.isAnnotationPresent(PostInitialized.class)) {
                        try {
                            method.invoke(bean);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

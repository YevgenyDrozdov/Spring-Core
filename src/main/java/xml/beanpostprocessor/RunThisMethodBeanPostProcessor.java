package xml.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ownannotation.RunThisMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Class beanClass = bean.getClass();

        Method[] beanMethods = beanClass.getMethods();

        Arrays.stream(beanMethods).forEach(beanMethod -> {
            RunThisMethod runThisMethodAnnotation = beanMethod.getAnnotation(RunThisMethod.class);
            if (runThisMethodAnnotation != null) {
                int repeat = runThisMethodAnnotation.repeat();

                for (int i = 0; i < repeat; i++) {
                    try {
                        beanMethod.invoke(bean);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        return bean;
    }

}

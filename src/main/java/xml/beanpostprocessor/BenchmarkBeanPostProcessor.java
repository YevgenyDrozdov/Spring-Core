package xml.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class BenchmarkBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> originalClasses = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        originalClasses.put(beanName, bean.getClass());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Class beanClass = originalClasses.get(beanName);
        originalClasses.remove(beanName);

        if (containsBenchmarkedMethods(beanClass.getMethods())) {
            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {

                    Object result = null;

                    Method originalMethod = beanClass.getMethod(method.getName(), method.getParameterTypes());

                    if (originalMethod.isAnnotationPresent(Benchmark.class)) {
                        long startTime = System.nanoTime();
                        result = method.invoke(bean, args);
                        long duration = System.nanoTime() - startTime;
                        System.out.println("Method called: " + method.toString() + ". Duration: " + duration + " ns");
                    } else {
                        result = method.invoke(bean, args);
                    }

                    return result;
                });
        } else {
            return bean;
        }
    }

    private boolean containsBenchmarkedMethods(Method[] methods) {
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                return true;
            }
        }

        return false;
    }


}

package xml.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TransactionAnnotationBeanPostProcessor implements BeanPostProcessor {

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

        if (containsTransactionalMethods(beanClass.getMethods())) {
            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(),
                    (Object proxy, Method method, Object[] args) -> {

                        Object result = null;

                        Method originalMethod = beanClass.getMethod(method.getName(), method.getParameterTypes());

                        if (originalMethod.isAnnotationPresent(Transaction.class)) {
                            System.out.println("Transaction started.");
                            result = method.invoke(bean, args);
                            System.out.println("Transaction finished.");
                        } else {
                            result = method.invoke(bean, args);
                        }

                        return result;
                    });
        } else {
            return bean;
        }
    }

    private boolean containsTransactionalMethods(Method[] methods) {
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                return true;
            }
        }

        return false;
    }

}

package ownannotation;

import java.lang.reflect.Method;

public class ObjectFactory {

    public <T> T createObject(Class<T> type) {
        try {
            T obj = (T)type.newInstance();

            for (Method method : type.getDeclaredMethods()) {
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    int repeat = annotation.repeat();

                    for (int i = 0; i < repeat; i++) {
                        method.invoke(obj);
                    }
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

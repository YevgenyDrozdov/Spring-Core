package javaconfig.applicationlistener;

public class MyBeanImpl implements MyBean {

    @Override
    @PostInitialized
    public void doOnApplicationStartup() {
        System.out.println("doOnApplicationStartup called.");
    }

}

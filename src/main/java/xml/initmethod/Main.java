package xml.initmethod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //ApplicationContext context = new ClassPathXmlApplicationContext("init-method-context.xml");
        //context.getBean(Human.class);

        //System.out.println(Integer.MAX_VALUE);

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        lock.readLock().lock();
        lock.readLock().lock();
        try {
            System.out.println(lock.getReadHoldCount());

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    lock.readLock().lock();
                    lock.readLock().lock();
                    System.out.println(" #: " + lock.getReadHoldCount());

                    lock.readLock().unlock();
                    lock.readLock().unlock();
                    System.out.println(" #: " + lock.getReadHoldCount());
                }
            });

            executorService.shutdown();
            executorService.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        } finally {
            System.out.println("unlock 0");
            lock.readLock().unlock();
            lock.readLock().unlock();
        }


    }

}

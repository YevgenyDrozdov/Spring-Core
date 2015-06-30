package annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("annotation.resource");
        BookShelf bookShelf = context.getBean("bookShelf", BookShelf.class);
        System.out.println(bookShelf.getBooks());
    }

}

package xml.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injection-context.xml");
        /*BookShelf shelf = context.getBean(BookShelf.class);
        shelf.printBooks();*/

        Map<String, BookShelf> shelvesMap = context.getBeansOfType(BookShelf.class);
        for (Map.Entry<String, BookShelf> shelfEntry : shelvesMap.entrySet()) {
            System.out.println(shelfEntry.getKey() + ": " + shelfEntry.getValue());
            shelfEntry.getValue().printBooks();
        }
    }

}

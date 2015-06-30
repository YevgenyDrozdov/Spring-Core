package annotation.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class BookShelf {

    // Resource (bookShelfService) is injected by name
    @Resource
    private BookShelfService bookShelfService;

    public List<String> getBooks() {
        return bookShelfService.getBooks();
    }

}

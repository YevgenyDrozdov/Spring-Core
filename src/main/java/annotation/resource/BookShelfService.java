package annotation.resource;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookShelfService {

    public List<String> getBooks() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }

}

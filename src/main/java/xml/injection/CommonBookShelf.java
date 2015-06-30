package xml.injection;

import java.util.List;

public abstract class CommonBookShelf implements BookShelf {

    private List<String> books;

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void printBooks() {
        if (books != null) {
            books.stream().forEach(s -> System.out.println(s));
        }
    }
}

package ownannotation;

import xml.scope.Book;

public class AnnotatedBook extends Book {

    @RunThisMethod
    public void init() {
        System.out.println("Annotated book is being created.");
    }

    @RunThisMethod(repeat = 5)
    public void printHello5Times() {
        System.out.println("Hello!");
    }

}

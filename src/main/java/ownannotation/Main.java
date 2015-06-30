package ownannotation;

public class Main {

    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactory();
        AnnotatedBook book = factory.createObject(AnnotatedBook.class);
    }

}

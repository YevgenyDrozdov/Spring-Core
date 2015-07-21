package xml.definitioninheritance;

public interface Repository {

    Object create(Object key, Object o);
    Object read(Object key);

}

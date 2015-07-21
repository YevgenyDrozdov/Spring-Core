package xml.definitioninheritance;

public class OracleRepository implements Repository {

    @Override
    public Object create(Object key, Object o) {
        System.out.println("OracleRepository: creating the object for the key " + key);
        return o;
    }

    @Override
    public Object read(Object key) {
        System.out.println("OracleRepository: reading the object by the key " + key);
        return null;
    }
}

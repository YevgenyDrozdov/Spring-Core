package annotation.autowiredwithqualifier;

@Derby
public class DerbyDao implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm Derby DAO");
    }
}

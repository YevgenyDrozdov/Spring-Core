package annotation.autowiredwithqualifier;

@Oracle
public class OracleDao implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm Oracle DAO");
    }
}

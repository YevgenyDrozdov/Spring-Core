package xml.factorymethod;

public class BabyFactory {

    public Baby createBaby() {
        Baby baby = new Baby();
        baby.setName("Alice");
        baby.setAge(1);
        return baby;
    }

}

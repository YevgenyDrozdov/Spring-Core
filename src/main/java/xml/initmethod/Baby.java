package xml.initmethod;

public class Baby implements Human {

    private int age;
    private String name;

    public void born() {
        System.out.println("Uaaaa-uaaa-uaaaa!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package xml.constructorinjection;

import xml.initmethod.Human;

public class Adult implements Human {

    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void born() {
        System.out.println(name + "[" + age + "]");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}

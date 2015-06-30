package xml.postconstruct;

import xml.initmethod.Human;

import javax.annotation.PostConstruct;

public class Baby implements Human {

    private String name;
    private int age;

    @Override
    @PostConstruct
    public void born() {
        System.out.println("Uaaa-uaaaa-uaa!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

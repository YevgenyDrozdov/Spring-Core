package xml.beanpostprocessor;

import xml.initmethod.Human;
import ownannotation.RunThisMethod;

public class Baby implements Human {

    private String name;
    private int age;

    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    @RunThisMethod(repeat = 10)
    @Benchmark
    @Transaction
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

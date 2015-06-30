package xml.initmethod;

import java.util.List;
import java.util.stream.Collectors;

public class Family {

    private List<Human> members;

    public void printMembers() {
        System.out.print("Family members: ");

        String output = members.stream().map(m -> m.getName() + "[" + m.getAge() + "]" ).collect(Collectors.joining(", "));
        System.out.println(output);
    }

    public void setMembers(List<Human> members) {
        this.members = members;
    }
}

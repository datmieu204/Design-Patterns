package BAI1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String spouse;
    private boolean married;
    private List<Person> children;

    public Person(String name, String dateOfBirth, String gender, String spouse) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.spouse = spouse;

        if (this.spouse == null) {
            this.married = false;
        } else {
            this.married = true;
        }

        this.children = new ArrayList<>();

    }

    public boolean isMarried() {
        return married;
    }

    public void addPerson(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public String toString() {
        return ("Person : [Name : " + name + ", DateOfBirth : " + dateOfBirth + ", Gender : " + gender + ", Spouse : "
                + spouse + " ]");
    }

    public boolean isLastestChild(List<Person> list) {
        for (Person person : list) {
            if (list.contains(person)) {
                return false;
            }
        }
        return true;
    }
}

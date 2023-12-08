package BAI1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Person> UnMarried = new ArrayList<>();
    private static List<Person> LastestGeneration = new ArrayList<>();
    private static List<Person> HaveTwoChildren = new ArrayList<>();

    public static void findUnmarried(List<Person> list) {
        for (Person person : list) {
            if (!person.isMarried()) {
                UnMarried.add(person);
            }
        }
    }

    public static void findSpouseHaveTwoChildren(List<Person> list) {
        for (Person person : list) {
            if (person.getChildren().size() == 2 && person.isMarried()) {
                HaveTwoChildren.add(person);
            }
        }
    }

    public static void findLastestChild(List<Person> list) {
        for (Person person : list) {
            if (person.getChildren().isEmpty() ) {
                LastestGeneration.add(person);
            }
        }
    }

    public static void check(List<Person> list) {
        findSpouseHaveTwoChildren(list);
        findUnmarried(list);
    }

    public static void main(String[] args) {
        Person x = new Person("James", "25/05/1980", "male", "Hana");

        Person y = new Person("Ryan", "24/05/2004", "female", null);
        Person z = new Person("Kai", "09/09/2007", "male", "Jennifer");

        x.addPerson(y);
        x.addPerson(z);

        Person u1 = new Person("U1", "02/02/2030", "male", "YYY");
        Person u2 = new Person("U2", "29/04/2032", "female", "ZZZ");
        Person u3 = new Person("U3", "13/07/2028", "male", "KKK");
        Person u4 = new Person("U4", "02/02/2034", "female", null);

        z.addPerson(u1);
        z.addPerson(u2);
        z.addPerson(u3);
        z.addPerson(u4);

        Person u5 = new Person("U5", "02/02/2050", "male", null);
        Person u6 = new Person("U6", "02/08/2055", "female", null);
        Person u7 = new Person("U7", "19/09/2057", "female", null);
        Person u8 = new Person("U8", "19/09/2057", "male", null);
        
        u1.addPerson(u5);
        u1.addPerson(u6);
        u2.addPerson(u7);
        u2.addPerson(u8);

        List<Person> myList = new ArrayList<>();
        myList.add(x);

        check(myList);

        
        for(Person person1 : myList) {
            check(person1.getChildren());
            for(Person person2 : person1.getChildren()) {
                check(person2.getChildren());

                for(Person person3 : person2.getChildren()) {
                    check(person3.getChildren());
                    findLastestChild(person3.getChildren());
                }

            }

        }

        System.out.println("Unmarried : ");
        for (Person person : UnMarried) {
            System.out.println(person);
        }

        System.out.println();

        System.out.println("Lastest Generation : ");
        for (Person person : LastestGeneration) {
            System.out.println(person);
        }

        System.out.println();

        System.out.println("Spouse Have Two Children : ");
        for (Person person : HaveTwoChildren) {
            System.out.println(person);
        }

    }
}




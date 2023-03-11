package basics;

import java.util.Arrays;
import java.util.List;

public class Unit1Java8Solution {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("J", "P",1),
                new Person("K", "Q",2),
                new Person("L", "R",3),
                new Person("K", "P",4)
        );

        System.out.println("sort a list by lastName");
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("create a method that prints all elements in the list");
        printAllConditionally(people, p->true);

        System.out.println("create a method that prints all the people that have last name beginning with P");
        printAllConditionally(people, p-> p.getLastName().startsWith("P"));
        System.out.println("create a method that prints all the people that have first name beginning with K");
        printAllConditionally(people, p-> p.getFirstName().startsWith("K"));
    }

    private static void printAllConditionally(List<Person> people, Condition condition) {
        people.forEach(person -> {
            if (condition.testCondition(person)) {
                System.out.println(person);
            }
        });
    }
}

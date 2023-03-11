package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Java7Solution {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("J", "P",1),
                new Person("K", "Q",2),
                new Person("L", "R",3),
                new Person("K", "P",4)
        );

        //sort a list by lastName

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //create a method that prints all elements in the list
        System.out.println("Print All ***************");
        printAll(people);

        //create a method that prints all the people that have last name beginning with P
        System.out.println("Print All Last Name Starting With P ***************");
        printAllUsingCondition(people, new Condition() {
            @Override
            public boolean testCondition(Person person) {
                return person.getLastName().startsWith("P");
            }
        });

        System.out.println("Print All First Name Starting With K ***************");
        printAllUsingCondition(people, new Condition() {
            @Override
            public boolean testCondition(Person person) {
                return person.getFirstName().startsWith("K");
            }
        });
    }

    private static void printAllUsingCondition(List<Person> people, Condition condition) {
        for (Person p: people){
            if(condition.testCondition(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p: people){
            System.out.println(p);
        }
//        people.forEach(person -> System.out.println(person));
    }
}

interface Condition {
    boolean testCondition(Person person);
}
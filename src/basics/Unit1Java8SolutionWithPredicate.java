package basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Java8SolutionWithPredicate {

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
        printAllConditionally(people, p->true, p-> System.out.println(p));

        System.out.println("create a method that prints all the people that have last name beginning with P");
        printAllConditionally(people, p-> p.getLastName().startsWith("P"), p-> System.out.println(p));
        printAllConditionally(people, p-> p.getLastName().startsWith("P"), p-> System.out.println(p.getLastName()));
        System.out.println("create a method that prints all the people that have first name beginning with K");
        printAllConditionally(people, p-> p.getFirstName().startsWith("K"), p-> System.out.println(p));
        printAllConditionally(people, p-> p.getFirstName().startsWith("K"), p-> System.out.println(p.getFirstName()));
    }

    private static void printAllConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        people.forEach(person -> {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        });
    }
}

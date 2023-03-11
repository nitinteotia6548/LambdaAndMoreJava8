import basics.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("J", "P",1),
                new Person("K", "Q",2),
                new Person("L", "R",3),
                new Person("K", "P",4)
        );

        System.out.println("create a method that prints all elements in the list");
        printAllConditionally(people, p->true, System.out::println); // it works like this, p -> method(p)
    }

    private static void printAllConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        people.forEach(person -> {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        });
    }
}

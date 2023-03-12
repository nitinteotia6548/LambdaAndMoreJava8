import basics.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("J", "J",1),
                new Person("K", "Q",2),
                new Person("L", "R",3),
                new Person("K", "J",4)
        );

        // print the first name of the person whose last name starts with J
        people.stream()
                .filter(p->p.getLastName().startsWith("J"))
                .forEach(p -> System.out.println(p.getFirstName()));

        // count the number of person whose last name starts with J
        long countOfPeople = people.stream()
                .filter(p -> p.getLastName().startsWith("J"))
                .count();
        System.out.println(countOfPeople);

        // count the number of person whose last name starts with J using parallelism
        long countOfPeopleViaParallelism = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("J"))
                .count();
        System.out.println(countOfPeopleViaParallelism);
    }
}

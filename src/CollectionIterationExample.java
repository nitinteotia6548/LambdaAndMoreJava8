import basics.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("J", "P",1),
                new Person("K", "Q",2),
                new Person("L", "R",3),
                new Person("K", "P",4)
        );

        System.out.println("Using For Loop");
        for (int i = 0; i < people.size(); i++) { //controlling the iteration -> external iteration
            System.out.println(people.get(i));
        }

        System.out.println("Using For in Loop");
        for (Person p: people) { //telling compiler to do the iteration in a particular way, controlling the iteration -> external iteration
            System.out.println(p);
        }

        System.out.println("Using Lambda For Each loop");
        people.forEach(System.out::println);// telling the intent to iterate over it but not how and not controlling it. Since Java8
        // telling that execute the lambda expression for each and every element in the people list
        // easier to run in multiple threads and it is not sequential (multithreading and parallelism can be used)
    }
}

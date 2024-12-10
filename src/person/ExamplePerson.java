package person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExamplePerson {

    private static final List<Person> peoples = MockData.getPeople();

    //  -> filter
    public static List<Person> filterPeople(int age){
        List<Person> males = peoples.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList());

        return males;
    }


    // -> sorted
    public static List<Person> sortedPeople(){
        List<Person> sortedPeoples = peoples.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        return  sortedPeoples;
    };


    // -> allMatched
    public static boolean isAllMatched(){
        boolean allMatched = peoples.stream()
                .allMatch(person -> person.getAge() > 20);
        return allMatched;
    }

    // -> anyMatched
    public static boolean isAnyMatched(){
        boolean anyMatched = peoples.stream()
                .allMatch(person -> person.getAge() > 20);

        return anyMatched;
    }

    // -> noneMatched
    public static boolean isNoneMatched(){
        boolean noneMatched = peoples.stream()
                .noneMatch(person -> person.getName().equals("Jame Lyly"));

        return noneMatched;
    }


    // -> max
    public static void maxAge(){
        peoples.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
    }

    // -> min
    public static void minAge(){
        peoples.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
    }


    // -> group
    public static void group(){
        Map<Gender, List<Person>> groupByGender = peoples.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach(((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        }
        ));
    }



    // -> combined stream api together
    public static void oldestMale(){
        Optional<String> oldestMale = peoples.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestMale.ifPresent(System.out::println);
    }

//        System.out.println(allMatched + " -> allMatched");
//        System.out.println(anyMatched + " -> anyMatched");
//        System.out.println(noneMatched + " -> noneMatched");
//        males.forEach(System.out::println);
//        sortedPeoples.forEach(System.out::println);
}

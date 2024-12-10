import person.ExamplePerson;
import person.Person;

import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<Person> filterPeopleByAge =  ExamplePerson.filterPeople(10);
        System.out.println(filterPeopleByAge);
        System.out.println("Hello World!");
    }
}

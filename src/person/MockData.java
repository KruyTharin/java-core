package person;

import java.util.List;

public class MockData {

  public static List<Person> getPeople() {
      return List.of(
              new Person("Tharin", 22, Gender.MALE),
              new Person("Raking", 25, Gender.MALE),
              new Person("Rikky", 40, Gender.MALE),
              new Person("Tida", 24, Gender.FEMALE),
              new Person("Chorng", 17, Gender.FEMALE),
              new Person("Liza", 19, Gender.FEMALE)
      );
  }
}

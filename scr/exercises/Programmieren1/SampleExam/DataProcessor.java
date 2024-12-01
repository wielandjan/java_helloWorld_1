package exercises.Programmieren1.SampleExam;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<Person> people;

    public DataProcessor() {
        List<Person> people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}

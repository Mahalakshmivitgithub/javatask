import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class PersonSorter {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Adhi", 19));
        people.add(new Person("Balaji", 20));
        people.add(new Person("Charu", 21));
        people.add(new Person("Bhavana",22));
        people.add(new Person("Seenu", 18));
        Collections.sort(people, Comparator.comparing(Person::getAge));
        people.forEach(System.out::println);
    }
}

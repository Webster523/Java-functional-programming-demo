package section07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Simon", 48));
        people.add(new Person("Alice", 30));
        people.add(new Person("Chris", 24));

        MethodReference obj = new MethodReference();
//        obj.sortDataWithInstanceMethod(people);
        obj.sortDataWithStaticMethod(people);
        people.forEach(System.out::println);
    }

    public void sortDataWithInstanceMethod(List<Person> people) {
        Collections.sort(people, this::compareAge);
    }

    public void sortDataWithStaticMethod(List<Person> people) {
        Collections.sort(people, Person::compareAge);
    }

    public int compareAge(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

}

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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";

    }

    public static int compareAge(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

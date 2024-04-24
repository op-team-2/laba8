import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 21);
        Person person2 = new Person("Alice", 17);
        Person person3 = new Person("Bob", 25);

        Person[] people = {person1, person2, person3};

        Arrays.sort(people, new NameComparator());

        for (Person person : people) {
            System.out.println(person);
        }

        TreeSet<Person> treeSet = new TreeSet<>(new AgeComparator());
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);

        for (Person person : treeSet) {
            System.out.println(person);
        }
    }
}

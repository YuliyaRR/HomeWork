package home_work_collections.worker;

import home_work_collections.comparator.AgeAnimalAndNickComparator;
import home_work_collections.comparator.AgeAnimalComparator;
import home_work_collections.comparator.LengthPasswordAndNickComparator;
import home_work_collections.comparator.LengthPasswordComparator;
import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SorterWithTimeTest {

    @Test
    public void sortJDK(){
        Time time = new Time();
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");

        List<Person> person = new ArrayList<>();
        person.add(one);
        person.add(two);
        person.add(three);
        person.add(four);

        List<Person> expected = new ArrayList<>();
        expected.add(four);
        expected.add(two);
        expected.add(three);
        expected.add(one);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortJDK(person, new LengthPasswordComparator(), time);
        Assertions.assertEquals(expected, person);
    }

    @Test
    public void sortJDK2(){
        Time time = new Time();
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");

        List<Person> person = new ArrayList<>();
        person.add(one);
        person.add(two);
        person.add(three);
        person.add(four);

        List<Person> expected = new ArrayList<>();
        expected.add(four);
        expected.add(three);
        expected.add(two);
        expected.add(one);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortJDK(person, new LengthPasswordAndNickComparator(), time);
        Assertions.assertEquals(expected, person);
    }

    @Test
    public void sortJDK3(){
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");

        List<Animal> animals = new ArrayList<>();
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);

        List<Animal> expected = new ArrayList<>();
        expected.add(three);
        expected.add(four);
        expected.add(one);
        expected.add(two);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortJDK(animals, new AgeAnimalComparator(), time);
        Assertions.assertEquals(expected, animals);
    }

    @Test
    public void sortJDK4(){
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");

        List<Animal> animals = new ArrayList<>();
        animals.add(one);
        animals.add(two);
        animals.add(four);
        animals.add(three);

        List<Animal> expected = new ArrayList<>();
        expected.add(three);
        expected.add(four);
        expected.add(one);
        expected.add(two);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortJDK(animals, new AgeAnimalAndNickComparator(), time);
        Assertions.assertEquals(expected, animals);
    }

    @Test
    public void sortMergePerson() {
        List<Person> person = new LinkedList<>();

        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        List<Person> person2 = new LinkedList<>(person);

        person.sort(new LengthPasswordComparator());

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortMergePerson(person2, new LengthPasswordComparator(), time);

        Assertions.assertEquals(person,person2);
    }

    @Test
    public void sortMergePerson2() {
        List<Person> person = new LinkedList<>();

        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        List<Person> person2 = new LinkedList<>(person);

        person.sort(new LengthPasswordAndNickComparator());

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortMergePerson(person2, new LengthPasswordAndNickComparator(), time);

        Assertions.assertEquals(person,person2);
    }

    @Test
    public void sortMergePerson3() {
        List<Person> person = new ArrayList<>();

        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        List<Person> person2 = new ArrayList<>(person);

        person.sort(new LengthPasswordComparator());

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortMergePerson(person2, new LengthPasswordComparator(), time);

        Assertions.assertEquals(person,person2);
    }

    @Test
    public void sortMergePerson4() {
        List<Person> person = new ArrayList<>();

        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        List<Person> person2 = new ArrayList<>(person);

        person.sort(new LengthPasswordAndNickComparator());

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortMergePerson(person2, new LengthPasswordAndNickComparator(), time);

        Assertions.assertEquals(person, person2);
    }

    @Test
    public void sortCollectionAnimal(){
        List<Animal> animals = new LinkedList<>();
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);
        List<Animal> animals2 = new LinkedList<>(animals);
        Comparator<Animal> cmp = new AgeAnimalComparator();
        animals.sort(cmp);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortCollectionAnimal(animals2, cmp, time);
        Assertions.assertEquals(animals, animals2);
    }

    @Test
    public void sortCollectionAnimal2(){
        List<Animal> animals = new LinkedList<>();
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);
        List<Animal> animals2 = new LinkedList<>(animals);
        Comparator<Animal> cmp = new AgeAnimalAndNickComparator();
        animals.sort(cmp);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortCollectionAnimal(animals2, cmp, time);
        Assertions.assertEquals(animals, animals2);
    }

    @Test
    public void sortCollectionAnimal3(){
        List<Animal> animals = new ArrayList<>();
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);
        List<Animal> animals2 = new ArrayList<>(animals);
        Comparator<Animal> cmp = new AgeAnimalComparator();
        animals.sort(cmp);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortCollectionAnimal(animals2, cmp, time);
        Assertions.assertEquals(animals, animals2);
    }

    @Test
    public void sortCollectionAnimal4(){
        List<Animal> animals = new ArrayList<>();
        Time time = new Time();
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);
        List<Animal> animals2 = new ArrayList<>(animals);
        Comparator<Animal> cmp = new AgeAnimalAndNickComparator();
        animals.sort(cmp);

        SorterWithTime sorter = new SorterWithTime();

        sorter.sortCollectionAnimal(animals2, cmp, time);
        Assertions.assertEquals(animals, animals2);
    }
}

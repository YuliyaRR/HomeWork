package home_work_collections;

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

public class MainTest {
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

        Main.sortJDK(person, new LengthPasswordComparator(), time);
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

        Main.sortJDK(person, new LengthPasswordAndNickComparator(), time);
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

        Main.sortJDK(animals, new AgeAnimalComparator(), time);
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

        Main.sortJDK(animals, new AgeAnimalAndNickComparator(), time);
        Assertions.assertEquals(expected, animals);
    }

    @Test
    public void mergeAnimal() {
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        Animal[]animals = {one, two, four, three};
        Comparator<Animal> cmp = new AgeAnimalComparator();
        Main.mergeAnimal(animals, cmp);
        Animal[]expected  = {four, three,one, two};
        Assertions.assertArrayEquals(expected, animals);
    }

    @Test
    public void mergeAnimal2() {
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        Animal[]animals = {one, two, four, three};
        Comparator<Animal> cmp = new AgeAnimalAndNickComparator();
        Main.mergeAnimal(animals, cmp);
        Animal[]expected  = {three, four, one, two};
        Assertions.assertArrayEquals(expected, animals);
    }

    @Test
    public void mergePeople() {
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");
        Person[]people = {one, two, three, four};
        Comparator<Person> cmp = new LengthPasswordComparator();
        Main.mergePerson(people, cmp);
        Person[]expected = {four, two, three, one};
        Assertions.assertArrayEquals(expected, people);
    }

    @Test
    public void mergePeople2() {
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");
        Person[]people = {one, two, three, four};
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        Main.mergePerson(people, cmp);
        Person[]expected = {four, three, two, one};
        Assertions.assertArrayEquals(expected, people);
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

        Main.sortMergePerson(person2, new LengthPasswordComparator(), time);

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

        Main.sortMergePerson(person2, new LengthPasswordAndNickComparator(), time);

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

        Main.sortMergePerson(person2, new LengthPasswordComparator(), time);

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

        Main.sortMergePerson(person2, new LengthPasswordAndNickComparator(), time);

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
        Main.sortCollectionAnimal(animals2, cmp, time);
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
        Main.sortCollectionAnimal(animals2, cmp, time);
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
        Main.sortCollectionAnimal(animals2, cmp, time);
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
        Main.sortCollectionAnimal(animals2, cmp, time);
        Assertions.assertEquals(animals, animals2);
    }

    @Test
    public void deleteIterator(){
        List<Person> person = new ArrayList<>();
        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        Main.deleteIterator(person, time);
        Assertions.assertTrue(person.isEmpty());
    }

    @Test
    public void deleteIterator2(){
        List<Animal> animals = new ArrayList<>();
        Time time = new Time();
        animals.add(new Animal(5, "Bob"));
        animals.add(new Animal(7, "Lizzy"));
        animals.add(new Animal(3, "Karl"));
        animals.add(new Animal(3, "Karlitta"));
        Main.deleteIterator(animals, time);
        Assertions.assertTrue(animals.isEmpty());
    }

    @Test
    public void deleteJDK(){
        List<Person> person = new ArrayList<>();
        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        Main.deleteJDK(person, time);
        Assertions.assertTrue(person.isEmpty());
    }

    @Test
    public void deleteJDK2(){
        List<Animal> animals = new ArrayList<>();
        Time time = new Time();
        animals.add(new Animal(5, "Bob"));
        animals.add(new Animal(7, "Lizzy"));
        animals.add(new Animal(3, "Karl"));
        animals.add(new Animal(3, "Karlitta"));
        Main.deleteJDK(animals, time);
        Assertions.assertTrue(animals.isEmpty());
    }



}

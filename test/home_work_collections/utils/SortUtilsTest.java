package home_work_collections.utils;

import home_work_collections.comparator.AgeAnimalAndNickComparator;
import home_work_collections.comparator.AgeAnimalComparator;
import home_work_collections.comparator.LengthPasswordAndNickComparator;
import home_work_collections.comparator.LengthPasswordComparator;
import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

public class SortUtilsTest {

    @Test
    public void mergeSortAnimal() {
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        Animal[]animals = {one, two, four, three};
        Comparator<Animal> cmp = new AgeAnimalComparator();
        SortUtils.mergeSortAnimal(animals, cmp);
        Animal[]expected  = {four, three,one, two};
        Assertions.assertArrayEquals(expected, animals);
    }

    @Test
    public void mergeSortAnimal2() {
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(7, "Lizzy");
        Animal three = new Animal(3, "Karl");
        Animal four = new Animal(3, "Karlitta");
        Animal[]animals = {one, two, four, three};
        Comparator<Animal> cmp = new AgeAnimalAndNickComparator();
        SortUtils.mergeSortAnimal(animals, cmp);
        Animal[]expected  = {three, four, one, two};
        Assertions.assertArrayEquals(expected, animals);
    }

    @Test
    public void mergeSortPerson() {
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");
        Person[]people = {one, two, three, four};
        Comparator<Person> cmp = new LengthPasswordComparator();
        SortUtils.mergeSortPerson(people, cmp);
        Person[]expected = {four, two, three, one};
        Assertions.assertArrayEquals(expected, people);
    }

    @Test
    public void mergeSortPerson2() {
        Person one = new Person("Катя", "123456789", "олоо");
        Person two = new Person("Тася", "123456", "орларауаполоо");
        Person three = new Person("Жанна", "123456", "aрололо");
        Person four = new Person("Франсуаза", "12345", "щщщукааа");
        Person[]people = {one, two, three, four};
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        SortUtils.mergeSortPerson(people, cmp);
        Person[]expected = {four, three, two, one};
        Assertions.assertArrayEquals(expected, people);
    }
}

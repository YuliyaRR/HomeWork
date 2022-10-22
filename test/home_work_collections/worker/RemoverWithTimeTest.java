package home_work_collections.worker;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoverWithTimeTest {
    @Test
    public void deleteIterator(){
        List<Person> person = new ArrayList<>();
        Time time = new Time();
        person.add(new Person("Катя", "123456789", "олоо"));
        person.add(new Person("Тася", "123456", "орларауаполоо"));
        person.add(new Person("Жанна", "123456", "aрололо"));
        person.add(new Person("Франсуаза", "12345", "щщщукааа"));
        RemoverWithTime remover = new RemoverWithTime();
        remover.deleteIterator(person, time);
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
        RemoverWithTime remover = new RemoverWithTime();
        remover.deleteIterator(animals, time);
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
        RemoverWithTime remover = new RemoverWithTime();
        remover.deleteJDK(person, time);
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
        RemoverWithTime remover = new RemoverWithTime();
        remover.deleteJDK(animals, time);
        Assertions.assertTrue(animals.isEmpty());
    }
}

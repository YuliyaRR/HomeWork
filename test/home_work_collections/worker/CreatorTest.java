package home_work_collections.worker;

import home_work_collections.api.INumGenerator;
import home_work_collections.api.IStringGenerator;
import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.generator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatorTest {
    @Test
    public void doPerson(){
        IStringGenerator g1 = new GeneratorRandomName();
        IStringGenerator g2 = new GeneratorRandomPassword();
        IStringGenerator g3 = new GeneratorRandomEngString(6);
        Creator creator = new Creator();
        Person person = creator.doPerson(g1, g2, g3);
        Assertions.assertNotNull(person);
    }

    @Test
    public void doPerson2(){
        IStringGenerator g1 = new GeneratorRandomName();
        IStringGenerator g2 = new GeneratorRandomPassword();
        IStringGenerator g3 = new GeneratorRandomEngString(6);
        Creator creator = new Creator();
        Person person = creator.doPerson(g1, g2, g3);
        Assertions.assertNotNull(person.getName());
    }

    @Test
    public void doPerson3(){
        IStringGenerator g1 = new GeneratorRandomName();
        IStringGenerator g2 = new GeneratorRandomPassword();
        IStringGenerator g3 = new GeneratorRandomEngString(6);
        Creator creator = new Creator();
        Person person = creator.doPerson(g1, g2, g3);
        Assertions.assertNotNull(person.getNick());
    }

    @Test
    public void doPerson4(){
        IStringGenerator g1 = new GeneratorRandomName();
        IStringGenerator g2 = new GeneratorRandomPassword();
        IStringGenerator g3 = new GeneratorRandomEngString(6);
        Creator creator = new Creator();
        Person person = creator.doPerson(g1, g2, g3);
        Assertions.assertNotNull(person.getPassword());
    }

    @Test
    public void doAnimal() {
        IStringGenerator g1 = new GeneratorRandomNickAnimal();
        INumGenerator g2 = new GeneratorRandomAgeAnimals();
        Creator creator = new Creator();
        Animal animal = creator.doAnimal(g2, g1);
        Assertions.assertNotNull(animal);
    }

    @Test
    public void doAnimal2() {
        IStringGenerator g1 = new GeneratorRandomNickAnimal();
        INumGenerator g2 = new GeneratorRandomAgeAnimals();
        Creator creator = new Creator();
        Animal animal = creator.doAnimal(g2, g1);
        Assertions.assertTrue(animal.getAge() != 0);
    }

    @Test
    public void doAnimal3() {
        IStringGenerator g1 = new GeneratorRandomNickAnimal();
        INumGenerator g2 = new GeneratorRandomAgeAnimals();
        Creator creator = new Creator();
        Animal animal = creator.doAnimal(g2, g1);
        Assertions.assertNotNull(animal.getNick());
    }
}

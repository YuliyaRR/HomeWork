package home_work_collections.worker;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.api.INumGenerator;
import home_work_collections.api.IStringGenerator;

public class Creator {

    public Person doPerson (IStringGenerator g1, IStringGenerator g2, IStringGenerator g3){
        Person person = new Person(g1.generateString(),
                g2.generateString(), g3.generateString());
        return person;
    }

    public Animal doAnimal (INumGenerator g1, IStringGenerator g2){
        Animal animal = new Animal(g1.generateNum(), g2.generateString());
        return animal;
    }
}

package home_work_collections.worker;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import home_work_collections.generator.*;
import java.util.Collection;

public class FillerCollectionWithTime {

    public void addToCollectionPerson(Collection<Person> person, int size, Time t) {
        Time time = new Time("заполнение коллекции");
        long start = System.currentTimeMillis();

        Creator creator = new Creator();

        Person newPerson;
        for (int i = 0; i < size; i++) {
            newPerson = creator.doPerson(new GeneratorRandomNameFromFile(),
                    new GeneratorRandomPassword(),
                    new GeneratorRandomNickPeopleFromFile());
            person.add(newPerson);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public void addToCollectionAnimal(Collection<Animal> animal, int size, Time t) {
        Time time = new Time("заполнение коллекции");
        long start = System.currentTimeMillis();

        Creator creator = new Creator();

        Animal newAnimal;
        for (int i = 0; i < size; i++) {
            newAnimal = creator.doAnimal(new GeneratorRandomAgeAnimals(),
                    new GeneratorRandomNickAnimalFromFile());
            animal.add(newAnimal);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }
}

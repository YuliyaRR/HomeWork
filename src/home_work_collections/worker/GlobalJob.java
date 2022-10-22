package home_work_collections.worker;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;

import java.util.Collection;

public class GlobalJob {

    public void allWorkAnimal(Collection<Animal> collection, Time timer){
        FillerCollectionWithTime filler = new FillerCollectionWithTime();
        IteratorWithTime iterator = new IteratorWithTime();
        RemoverWithTime remover = new RemoverWithTime();

        filler.addToCollectionAnimal(collection,100_000, timer);
        iterator.iterationIterator(collection, timer);
        iterator.iterationForEach(collection,timer);
        remover.deleteIterator(collection, timer);
    }

    public void allWorkPerson(Collection<Person> collection, Time timer){
        FillerCollectionWithTime filler = new FillerCollectionWithTime();
        IteratorWithTime iterator = new IteratorWithTime();
        RemoverWithTime remover = new RemoverWithTime();

        filler.addToCollectionPerson(collection,100_000, timer);
        iterator.iterationIterator(collection, timer);
        iterator.iterationForEach(collection,timer);
        remover.deleteIterator(collection, timer);
    }
}

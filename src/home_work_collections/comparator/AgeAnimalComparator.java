package home_work_collections.comparator;

import home_work_collections.dto.Animal;

import java.util.Comparator;

public class AgeAnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }
}

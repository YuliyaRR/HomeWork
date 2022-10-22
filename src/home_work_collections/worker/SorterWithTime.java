package home_work_collections.worker;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import home_work_collections.utils.SortUtils;
import java.util.Comparator;
import java.util.List;

public class SorterWithTime {
    public <T> void sortJDK(List<T> list, Comparator<T> comparator, Time t) {
        Time time = new Time("сортировка коллекции с помощью метода sort() интерфейса List");
        long start = System.currentTimeMillis();

        list.sort(comparator);

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public void sortMergePerson(List<Person> list, Comparator<Person> comparator, Time t) {
        Time time = new Time("сортировка коллекции методом слияния");
        long start = System.currentTimeMillis();

        int size = list.size();
        Person[]arr = new Person[size];
        int k = 0;

        for (Person person : list) {
            arr[k] = person;
            k++;
        }

        SortUtils.mergeSortPerson(arr, comparator);

        list.clear();

        for (Person person : arr) {
            list.add(person);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);

    }

    public void sortCollectionAnimal(List<Animal> list, Comparator<Animal> comparator, Time t) {
        Time time = new Time("сортировка коллекции методом слияния");
        long start = System.currentTimeMillis();

        int size = list.size();
        Animal[]arr = new Animal[size];
        int k = 0;

        for (Animal animal : list) {
            arr[k] = animal;
            k++;
        }

        SortUtils.mergeSortAnimal(arr, comparator);

        list.clear();

        for (Animal animal : arr) {
            list.add(animal);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }
}

package home_work_collections;

import home_work_collections.comparator.AgeAnimalAndNickComparator;
import home_work_collections.comparator.AgeAnimalComparator;
import home_work_collections.comparator.LengthPasswordAndNickComparator;
import home_work_collections.comparator.LengthPasswordComparator;
import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import home_work_collections.generator.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("LinkedList<Person>");
        List<Person> listLinkedList = new LinkedList<>();
        Time timeLLP = new Time();

        addToCollectionPerson(listLinkedList, 100_000, timeLLP);
        iterationIterator(listLinkedList, timeLLP);
        sortJDK(listLinkedList, new LengthPasswordAndNickComparator(), timeLLP);
        iterationForEach(listLinkedList, timeLLP);
        sortMergePerson(listLinkedList, new LengthPasswordComparator(), timeLLP);
        deleteJDK(listLinkedList,timeLLP);

        allWorkPerson(listLinkedList,timeLLP);


        System.out.println("ArrayList<Person>");
        List<Person> listArrayList = new ArrayList<>();
        Time timeLAL = new Time();

        addToCollectionPerson(listArrayList, 100_000, timeLAL);
        iterationIterator(listArrayList, timeLAL);
        sortJDK(listArrayList, new LengthPasswordAndNickComparator(), timeLAL);
        iterationForEach(listArrayList, timeLAL);
        sortMergePerson(listArrayList, new LengthPasswordComparator(), timeLAL);
        deleteJDK(listArrayList,timeLAL);

        allWorkPerson(listArrayList, timeLAL);


        System.out.println("HashSet<Person>");
        Set<Person> setHashSet = new HashSet<>();
        Time timeSet = new Time();
        allWorkPerson(setHashSet,timeSet);


        System.out.println("TreeSet<Person>");
        Set<Person> setTreeSet = new TreeSet<>(new LengthPasswordAndNickComparator());
        Time timeTree = new Time();
        allWorkPerson(setTreeSet,timeTree);


        System.out.println("LinkedList<Animal>");
        List<Animal> listLinkedListAnimal = new LinkedList<>();
        Time timeLLA = new Time();

        addToCollectionAnimal(listLinkedListAnimal, 100_000, timeLLA);
        iterationIterator(listLinkedListAnimal, timeLLA);
        sortJDK(listLinkedListAnimal, new AgeAnimalAndNickComparator(), timeLLA);
        iterationForEach(listLinkedListAnimal, timeLLA);
        sortCollectionAnimal(listLinkedListAnimal, new AgeAnimalComparator(), timeLLA);
        deleteJDK(listLinkedListAnimal,timeLLA);

        allWorkAnimal(listLinkedListAnimal, timeLLA);


        System.out.println("ArrayList<Animal>");
        List<Animal> listArrayListAnimal = new ArrayList<>();
        Time timeALA = new Time();

        addToCollectionAnimal(listArrayListAnimal, 100_000, timeALA);
        iterationIterator(listArrayListAnimal, timeALA);
        sortJDK(listArrayListAnimal, new AgeAnimalAndNickComparator(), timeALA);
        iterationForEach(listArrayListAnimal, timeALA);
        sortCollectionAnimal(listArrayListAnimal, new AgeAnimalComparator(), timeALA);
        deleteJDK(listArrayListAnimal,timeALA);

        allWorkAnimal(listArrayListAnimal, timeALA);


        System.out.println("HashSet<Animal>");
        Set<Animal> setHashSetAnimal = new HashSet<>();
        Time timeHSA = new Time();
        allWorkAnimal(setHashSetAnimal, timeHSA);


        System.out.println("TreeSet<Animal>");
        Set<Animal> setTreeSetAnimal = new TreeSet<>(new AgeAnimalAndNickComparator());
        Time timeTSA = new Time();
        allWorkAnimal(setTreeSetAnimal, timeTSA);


        System.out.println("LinkedList<Person>");
        System.out.println(timeLLP.getListTime());
        System.out.println("LinkedList<Animal>");
        System.out.println(timeLLA.getListTime());

        System.out.println("ArrayList<Person>");
        System.out.println(timeLAL.getListTime());
        System.out.println("ArrayList<Animal>");
        System.out.println(timeALA.getListTime());

        System.out.println("HashSet<Person>");
        System.out.println(timeSet.getListTime());
        System.out.println("HashSet<Animal>");
        System.out.println(timeHSA.getListTime());

        System.out.println("TreeSet<Person>");
        System.out.println(timeTree.getListTime());
        System.out.println("TreeSet<Animal>");
        System.out.println(timeTSA.getListTime());

    }

    public static void allWorkAnimal(Collection<Animal> collection, Time timer){

        addToCollectionAnimal(collection,100_000, timer);

        iterationIterator(collection, timer);

        iterationForEach(collection,timer);

        deleteIterator(collection, timer);
    }

    public static void allWorkPerson(Collection<Person> collection, Time timer){

        addToCollectionPerson(collection,100_000, timer);

        iterationIterator(collection, timer);

        iterationForEach(collection,timer);

        deleteIterator(collection, timer);
    }

    public static Person doPerson (IStringGenerator g1, IStringGenerator g2, IStringGenerator g3){
        Person person = new Person(g1.generateString(),
                g2.generateString(), g3.generateString());
        return person;
    }

    public static Animal doAnimal (INumGenerator g1, IStringGenerator g2){
        Animal animal = new Animal(g1.generateNum(), g2.generateString());
        return animal;
    }

    public static void addToCollectionPerson(Collection<Person> personList, int size, Time t) {
        Time time = new Time("заполнение коллекции");
        long start = System.currentTimeMillis();

        Person newPerson;
        for (int i = 0; i < size; i++) {
            newPerson = doPerson(new GeneratorRandomNameFromFile(),
                        new GeneratorRandomPassword(),
                        new GeneratorRandomNickPeopleFromFile());
            personList.add(newPerson);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public static void addToCollectionAnimal(Collection<Animal> animalList, int size, Time t) {
        Time time = new Time("заполнение коллекции");
        long start = System.currentTimeMillis();

        Animal newAnimal;
        for (int i = 0; i < size; i++) {
            newAnimal = doAnimal(new GeneratorRandomAgeAnimals(),
                    new GeneratorRandomNickAnimalFromFile());
            animalList.add(newAnimal);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public static <T> void sortJDK(List<T> list, Comparator<T> comparator, Time t) {
        Time time = new Time("сортировка коллекции с помощью метода sort() интерфейса List");
        long start = System.currentTimeMillis();

        list.sort(comparator);

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public static void sortMergePerson(List<Person> list, Comparator<Person> comparator, Time t) {
        Time time = new Time("сортировка коллекции методом слияния");
        long start = System.currentTimeMillis();

        int size = list.size();
        Person[]arr = new Person[size];
        int k = 0;

        for (Person person : list) {
            arr[k] = person;
            k++;
        }

        mergePerson(arr, comparator);

        list.clear();

        for (Person person : arr) {
            list.add(person);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);

    }

    public static void mergePerson(Person[] arr, Comparator<Person> comparator) {
        int lengthArr = arr.length;
        if(lengthArr < 2) {
            return;
        }

        Person[]leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
        Person[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        mergePerson(leftArr,comparator);
        mergePerson(rightArr, comparator);

        int cursor1 = 0;
        int cursor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cursor1 == leftArr.length) {
                arr[i] =rightArr[cursor2];
                cursor2++;
            } else if (cursor2 == rightArr.length) {
                arr[i] = leftArr[cursor1];
                cursor1++;
            } else if (comparator.compare(leftArr[cursor1],rightArr[cursor2]) <= 0) {
                arr[i] = leftArr[cursor1];
                cursor1++;
            } else { //comparator.compare(leftArr[cursor1],rightArr[cursor2]) < 0
                arr[i] = rightArr[cursor2];
                cursor2++;

            }
        }
    }

    public static void sortCollectionAnimal(List<Animal> list, Comparator<Animal> comparator, Time t) {
        Time time = new Time("сортировка коллекции методом слияния");
        long start = System.currentTimeMillis();

        int size = list.size();
        Animal[]arr = new Animal[size];
        int k = 0;

        for (Animal animal : list) {
            arr[k] = animal;
            k++;
        }

        mergeAnimal(arr, comparator);

        list.clear();

        for (Animal animal : arr) {
            list.add(animal);
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);

    }

    public static void mergeAnimal(Animal[] arr, Comparator<Animal> comparator) {
        int lengthArr = arr.length;
        if(lengthArr < 2) {
            return;
        }

        Animal[]leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
        Animal[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        mergeAnimal(leftArr, comparator);
        mergeAnimal(rightArr, comparator);

        int cursor1 = 0;
        int cursor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cursor1 == leftArr.length) {
                arr[i] =rightArr[cursor2];
                cursor2++;
            } else if (cursor2 == rightArr.length) {
                arr[i] = leftArr[cursor1];
                cursor1++;
            } else if (comparator.compare(leftArr[cursor1],rightArr[cursor2]) <= 0) {
                arr[i] = leftArr[cursor1];
                cursor1++;
            } else { //comparator.compare(leftArr[cursor1],rightArr[cursor2]) < 0
                arr[i] = rightArr[cursor2];
                cursor2++;

            }
        }
    }


    public static <T> void iterationIterator (Collection <T> collection, Time t) {
        Time time = new Time("итерирование с помощью iterator");
        long start = System.currentTimeMillis();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);

    }

    public static <T> void iterationForEach (Collection <T> collection, Time t) {
        Time time = new Time("итерирование с помощью forEach");
        long start = System.currentTimeMillis();

        collection.forEach(System.out::println);

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public static <T> void deleteIterator(Collection<T> collection, Time t) {
        Time time = new Time("удаление с помощью iterator");
        long start = System.currentTimeMillis();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }

    public static <T> void deleteJDK(Collection<T> collection, Time t) {
        Time time = new Time("удаление с помощью метода clear() интерфейса Collection");
        long start = System.currentTimeMillis();

        collection.clear();

        long finish = System.currentTimeMillis();
        time.determineDuration(start, finish);
        t.addToList(time);
    }







}

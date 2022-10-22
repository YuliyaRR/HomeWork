package home_work_collections;

import home_work_collections.comparator.AgeAnimalAndNickComparator;
import home_work_collections.comparator.AgeAnimalComparator;
import home_work_collections.comparator.LengthPasswordAndNickComparator;
import home_work_collections.comparator.LengthPasswordComparator;
import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import home_work_collections.dto.Time;
import home_work_collections.worker.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FillerCollectionWithTime filler = new FillerCollectionWithTime();
        SorterWithTime sorter = new SorterWithTime();
        IteratorWithTime iterator = new IteratorWithTime();
        RemoverWithTime remover = new RemoverWithTime();
        GlobalJob job = new GlobalJob();

        System.out.println("LinkedList<Person>");
        List<Person> listLinkedList = new LinkedList<>();
        Time timeLLP = new Time();

        filler.addToCollectionPerson(listLinkedList, 100_000, timeLLP);
        iterator.iterationIterator(listLinkedList, timeLLP);
        sorter.sortJDK(listLinkedList, new LengthPasswordAndNickComparator(), timeLLP);
        iterator.iterationForEach(listLinkedList, timeLLP);
        sorter.sortMergePerson(listLinkedList, new LengthPasswordComparator(), timeLLP);
        remover.deleteJDK(listLinkedList,timeLLP);

        job.allWorkPerson(listLinkedList,timeLLP);


        System.out.println("ArrayList<Person>");
        List<Person> listArrayList = new ArrayList<>();
        Time timeLAL = new Time();

        filler.addToCollectionPerson(listArrayList, 100_000, timeLAL);
        iterator.iterationIterator(listArrayList, timeLAL);
        sorter.sortJDK(listArrayList, new LengthPasswordAndNickComparator(), timeLAL);
        iterator.iterationForEach(listArrayList, timeLAL);
        sorter.sortMergePerson(listArrayList, new LengthPasswordComparator(), timeLAL);
        remover.deleteJDK(listArrayList,timeLAL);

        job.allWorkPerson(listArrayList, timeLAL);


        System.out.println("HashSet<Person>");
        Set<Person> setHashSet = new HashSet<>();
        Time timeSet = new Time();
        job.allWorkPerson(setHashSet,timeSet);


        System.out.println("TreeSet<Person>");
        Set<Person> setTreeSet = new TreeSet<>(new LengthPasswordAndNickComparator());
        Time timeTree = new Time();
        job.allWorkPerson(setTreeSet,timeTree);


        System.out.println("LinkedList<Animal>");
        List<Animal> listLinkedListAnimal = new LinkedList<>();
        Time timeLLA = new Time();

        filler.addToCollectionAnimal(listLinkedListAnimal, 100_000, timeLLA);
        iterator.iterationIterator(listLinkedListAnimal, timeLLA);
        sorter.sortJDK(listLinkedListAnimal, new AgeAnimalAndNickComparator(), timeLLA);
        iterator.iterationForEach(listLinkedListAnimal, timeLLA);
        sorter.sortCollectionAnimal(listLinkedListAnimal, new AgeAnimalComparator(), timeLLA);
        remover.deleteJDK(listLinkedListAnimal,timeLLA);

        job.allWorkAnimal(listLinkedListAnimal, timeLLA);


        System.out.println("ArrayList<Animal>");
        List<Animal> listArrayListAnimal = new ArrayList<>();
        Time timeALA = new Time();

        filler.addToCollectionAnimal(listArrayListAnimal, 100_000, timeALA);
        iterator.iterationIterator(listArrayListAnimal, timeALA);
        sorter.sortJDK(listArrayListAnimal, new AgeAnimalAndNickComparator(), timeALA);
        iterator.iterationForEach(listArrayListAnimal, timeALA);
        sorter.sortCollectionAnimal(listArrayListAnimal, new AgeAnimalComparator(), timeALA);
        remover.deleteJDK(listArrayListAnimal,timeALA);

        job.allWorkAnimal(listArrayListAnimal, timeALA);


        System.out.println("HashSet<Animal>");
        Set<Animal> setHashSetAnimal = new HashSet<>();
        Time timeHSA = new Time();
        job.allWorkAnimal(setHashSetAnimal, timeHSA);


        System.out.println("TreeSet<Animal>");
        Set<Animal> setTreeSetAnimal = new TreeSet<>(new AgeAnimalAndNickComparator());
        Time timeTSA = new Time();
        job.allWorkAnimal(setTreeSetAnimal, timeTSA);


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
}

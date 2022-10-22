package home_work_collections.utils;

import home_work_collections.dto.Animal;
import home_work_collections.dto.Person;
import java.util.Arrays;
import java.util.Comparator;

public class SortUtils {

    public static void mergeSortPerson(Person[] arr, Comparator<Person> comparator) {
        int lengthArr = arr.length;
        if(lengthArr < 2) {
            return;
        }

        Person[]leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
        Person[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        mergeSortPerson(leftArr,comparator);
        mergeSortPerson(rightArr, comparator);

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
    public static void mergeSortAnimal(Animal[] arr, Comparator<Animal> comparator) {
        int lengthArr = arr.length;
        if(lengthArr < 2) {
            return;
        }

        Animal[]leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
        Animal[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        mergeSortAnimal(leftArr, comparator);
        mergeSortAnimal(rightArr, comparator);

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
}

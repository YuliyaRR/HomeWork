package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public void printAllElements(int[] arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы в консоль невозможно.");
        } else {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
    }
    @Override
    public void everySecondElement(int[] arr) {
        if (arr.length == 0) {
            System.out.print("Вывести второй элемент невозможно.");
        } else if (arr.length == 1) {
            System.out.print("Массив содержит всего один элемент. Вывести второй элемент невозможно.");
        } else {
            for (int j = 1; j < arr.length; j = j +2) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void reverseAllElements(int[]arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы массива в обратном порядке невозможно.");
        } else {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
    }
}

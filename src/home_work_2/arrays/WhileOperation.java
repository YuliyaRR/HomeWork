package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    @Override
    public void printAllElements(int[] arr) {
        int k = 0;
        if (arr.length == 0) {
            System.out.print("Вывести элементы в консоль невозможно.");
        } else {
            while (k < arr.length) {
                System.out.print(arr[k] + " ");
                k++;
            }
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        int k = 1;
        if (arr.length == 0) {
            System.out.print("Вывести второй элемент невозможно.");
        } else if (arr.length == 1) {
            System.out.print("Массив содержит всего один элемент. Вывести второй элемент невозможно.");
        } else {
            while (k < arr.length) {
                System.out.print(arr[k] + " ");
                k = k + 2;
            }
        }
        System.out.println();
    }

    @Override
    public void reverseAllElements(int[]arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы массива в обратном порядке невозможно.");
        } else {
            int k = arr.length - 1;
            while (k >= 0) {
                System.out.print(arr[k] + " ");
                k--;
            }
        }
        System.out.println();
    }
}

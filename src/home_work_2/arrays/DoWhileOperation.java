package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void printAllElements(int[] arr) {
        int i = 0;
        do {
            if (arr.length == 0) {
                System.out.print("Вывести элементы в консоль невозможно.");
                break;
            } else {
                System.out.print(arr[i] + " ");
            }
            i++;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        int i = 1;
        do {
            if (arr.length == 0) {
                System.out.print("Вывести второй элемент невозможно.");
                break;
            } else if (arr.length == 1) {
                System.out.print("Массив содержит всего один элемент. Вывести второй элемент невозможно.");
                break;
            } else {
                System.out.print(arr[i] + " ");
            }
            i = i + 2;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void reverseAllElements(int[] arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы массива в обратном порядке невозможно.");
        } else {
            int i = arr.length - 1;
            do {
                System.out.print(arr[i] + " ");
                i--;
            } while (i >= 0);
        }
        System.out.println();
    }
}

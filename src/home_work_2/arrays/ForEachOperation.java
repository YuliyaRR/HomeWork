package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void printAllElements(int[] arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы в консоль невозможно.");
        } else {
            for (int a: arr) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
    @Override
    public void everySecondElement(int[] arr) {
        int count = 0;
        if (arr.length == 0) {
            System.out.print("Вывести второй элемент невозможно.");
        } else if (arr.length == 1) {
            System.out.print("Массив содержит всего один элемент. Вывести второй элемент невозможно.");
        } else {
            for (int a: arr) {
                if (count % 2 != 0) {
                    System.out.print(a + " ");
                }
                count++;
            }
        }
        System.out.println();
    }

    @Override
    public void reverseAllElements(int[]arr) {
        if (arr.length == 0) {
            System.out.print("Вывести элементы массива в обратном порядке невозможно.");
        } else {
            int [] revers = new int[arr.length];
            int l = 1;
            for (int a: arr) {
                revers[revers.length - l] = a;
                l++;
            }
            for (int r: revers) {
                System.out.print(r + " ");
            }
        }
        System.out.println();
    }
}

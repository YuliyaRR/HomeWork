package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    @Override
    public String printAllElements(int[] arr) {
        StringBuilder stb = new StringBuilder();
        int k = 0;
        if (arr.length == 0) {
            return "Вывести элементы в консоль невозможно.";
        } else {
            while (k < arr.length) {
                stb.append(arr[k]).append(" ");
                k++;
            }
        }
        return stb.toString();
    }

    @Override
    public String everySecondElement(int[] arr) {
        StringBuilder stb = new StringBuilder();
        int k = 1;
        if (arr.length == 0) {
            return "Вывести второй элемент невозможно.";
        } else if (arr.length == 1) {
            return "Массив содержит всего один элемент. Вывести второй элемент невозможно.";
        } else {
            while (k < arr.length) {
                stb.append(arr[k]).append(" ");
                k = k + 2;
            }
        }
        return stb.toString();
    }

    @Override
    public String reverseAllElements(int[]arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести элементы массива в обратном порядке невозможно.";
        } else {
            int k = arr.length - 1;
            while (k >= 0) {
                stb.append(arr[k]).append(" ");
                k--;
            }
        }
        return stb.toString();
    }
}

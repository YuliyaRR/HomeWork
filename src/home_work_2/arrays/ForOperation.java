package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public String printAllElements(int[] arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести элементы в консоль невозможно.";
        } else {
            for (int j = 0; j < arr.length; j++) {
                stb.append(arr[j]).append(" ");
            }
        }
        return stb.toString();
    }
    @Override
    public String everySecondElement(int[] arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести второй элемент невозможно.";
        } else if (arr.length == 1) {
            return "Массив содержит всего один элемент. Вывести второй элемент невозможно.";
        } else {
            for (int j = 1; j < arr.length; j = j +2) {
                stb.append(arr[j]).append(" ");
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
            for (int j = arr.length - 1; j >= 0; j--) {
                stb.append(arr[j]).append(" ");
            }
        }
        return stb.toString();
    }
}

package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public String printAllElements(int[] arr) {
        int i = 0;
        StringBuilder stb = new StringBuilder();
        do {
            if (arr.length == 0) {
                return "Вывести элементы в консоль невозможно.";
            } else {
                stb.append(arr[i]).append(" ");
            }
            i++;
        } while (i < arr.length);
        return stb.toString();
    }

    @Override
    public String everySecondElement(int[] arr) {
        int i = 1;
        StringBuilder stb = new StringBuilder();
        do {
            if (arr.length == 0) {
                return "Вывести второй элемент невозможно.";
            } else if (arr.length == 1) {
                return "Массив содержит всего один элемент. Вывести второй элемент невозможно.";
            } else {
                stb.append(arr[i]).append(" ");
            }
            i = i + 2;
        } while (i < arr.length);
        return stb.toString();
    }

    @Override
    public String reverseAllElements(int[] arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести элементы массива в обратном порядке невозможно.";
        } else {
            int i = arr.length - 1;
            do {
                stb.append(arr[i]).append(" ");
                i--;
            } while (i >= 0);
        }
        return stb.toString();
    }
}

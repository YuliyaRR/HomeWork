package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public String printAllElements(int[] arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести элементы в консоль невозможно.";
        } else {
            for (int a: arr) {
                stb.append(a).append(" ");
            }
        }
        return stb.toString();
    }
    @Override
    public String everySecondElement(int[] arr) {
        int count = 0;
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести второй элемент невозможно.";
        } else if (arr.length == 1) {
            return "Массив содержит всего один элемент. Вывести второй элемент невозможно.";
        } else {
            for (int a: arr) {
                if (count % 2 != 0) {
                    stb.append(a).append(" ");
                }
                count++;
            }
            return stb.toString();
        }
    }

    @Override
    public String reverseAllElements(int[]arr) {
        StringBuilder stb = new StringBuilder();
        if (arr.length == 0) {
            return "Вывести элементы массива в обратном порядке невозможно.";
        } else {
            int [] revers = new int[arr.length];
            int l = 1;
            for (int a: arr) {
                revers[revers.length - l] = a;
                l++;
            }
            for (int r: revers) {
                stb.append(r).append(" ");
            }
            return stb.toString();
        }
    }
}

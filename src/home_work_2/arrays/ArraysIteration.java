package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int [] array = ArraysUtils.arrayFromConsole();//size = 5, [1001,6,87,93,123]
        printAllElements(array);
        everySecondElement(array);
        reverseAllElements(array);
    }

    /**
     * Метод выводит все элементы массива в консоль четырьмя способами (при помощи do....while, while, for, foreach)
     * @param arr - int - массив
     */
    public static void printAllElements(int[]arr) {
        //do....while
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

        //while
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

        //for
        if (arr.length == 0) {
            System.out.print("Вывести элементы в консоль невозможно.");
        } else {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();

        //foreach
        if (arr.length == 0) {
            System.out.print("Вывести элементы в консоль невозможно.");
        } else {
            for (int a: arr) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }

    /**
     * Метод выводит каждый второй элемент массива в консоль, т.е элементы с нечетными индексами
     * @param arr - int - массив
     */
    public static void everySecondElement(int[] arr) {

        //do..while
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

        //while
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

        //for
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

        //foreach
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

    /**
     * Метод выводит все элементы массива в консоль в обратном порядке
     * @param arr - int-массив
     */
    public static void reverseAllElements (int[] arr) {

        //do....while
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

        //while
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

        //for
        if (arr.length == 0) {
            System.out.print("Вывести элементы массива в обратном порядке невозможно.");
        } else {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();

        //foreach
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

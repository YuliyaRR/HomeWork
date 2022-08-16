package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;


public class Task_2_4 {
    public static void main(String[] args) {
        int size = 50;
        int maxValue = 100;
        int[]array = ArraysUtils.arrayRandom(size, maxValue);
        System.out.println("Исходный рабочий массив");
        System.out.println(Arrays.toString(array));

        int sumEvenPositive = sumOfEvenPositiveArrayElements(array);
        System.out.print("Сумма четных положительных элементов массива: ");
        System.out.println(sumEvenPositive);

        int maxElEvenIndex = maxElementWithEvenIndex(array);
        System.out.print("Максимальный из элементов массива с четными индексами: ");
        System.out.println(maxElEvenIndex);

        String lessArithmetic = lessArithmeticMean(array);
        System.out.print("Элементы массива, которые меньше среднего арифметического: ");
        System.out.println(lessArithmetic);

        String twoMinElements = twoMinArrayElements(array);
        System.out.print("Два наименьших элемента массива: ");
        System.out.println(twoMinElements);

        Scanner scanner = new Scanner(System.in);
        int start;
        int end;
        do {
            System.out.println("Введите начало интервала значений (от 0 до 100 не включительно), которые хотите удалить из массива");
            start = scanner.nextInt();
            System.out.println("Введите конец интервала значений (от 0 до 100 не включительно), которые хотите удалить из массива");
            end = scanner.nextInt();

            if(start > end || start < 0 || end < 0 || start > 100 || end > 100){
                System.out.println("Неверные границы интервала");
            }
        } while (start > end || start < 0 || end < 0 || start > 100 || end > 100);

        int[] compressedArray = arrayCompression(array, start, end);
        System.out.println("Сжатый массив:");
        System.out.println(Arrays.toString(compressedArray));

        int[]arrayNew = ArraysUtils.arrayRandom(size, maxValue);
        System.out.println("Новый рабочий массив");
        System.out.println(Arrays.toString(arrayNew));
        int sumDigits = sumAllDigitsInArray(arrayNew);
        System.out.print("Сумма цифр массива: ");
        System.out.println(sumDigits);

    }

    /**
     * Метод возвращает сумму четных положительных элементов массива
     * @param arr - int-массив
     * @return - сумма четных положительных элементов
     */
    public static int sumOfEvenPositiveArrayElements (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    /**
     * Метод возвращает максимальный из элементов массива с четными индексами
     * @param arr - массив для перебора элементов
     * @return - int, максимальный из элементов массива с четным индексом
     */
    public static int maxElementWithEvenIndex (int[]arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Метод возвращает элементы массива, значение которых меньше среднего арифметического от всех элементов массива
     * @param arr - int-массив для перебора
     * @return - строка, содержащая все элементы, значение которых меньше среднего арифметического
     */
    public static String lessArithmeticMean (int[]arr){
        int arithmeticMean;
        int sumAll = 0;
        String result = "";

        for (int a: arr) {
            sumAll = sumAll + a;
        }

        arithmeticMean = sumAll / arr.length;

        for (int a: arr) {
            if(a < arithmeticMean) {
                result = result + a + " ";
            }
        }
        return result;

    }

    /**
     * Метод возвращает два наименьших элемента в массиве
     * @param arr - int-массив для перебора
     * @return - строка, содержащая два наименьших элемента массива
     */
    public static String twoMinArrayElements (int[]arr) {
        int min;
        int nextMin;
        String result;

        if (arr[0] < arr[1]) {
            min = arr[0];
            nextMin = arr[1];
        } else {
            min = arr[1];
            nextMin = arr[0];
        }

        for (int i = 2; i <arr.length ; i++) {
            if (arr[i] < min) {
                nextMin = min;
                min = arr[i];
            } else {
                if (arr[i] < nextMin) {
                    nextMin = arr[i];
                }
            }
        }
        result = String.format("%d %d", min, nextMin);
        return result;
    }

    /**
     * Метод сжимает массив, удаляя элементы, принадлежащие интервалу. Данные элементы заменяются на 0 и перемещаются в конец массива
     * @param arr - массив для сжатия
     * @param a - начало интервала(включая а)
     * @param b - конец интервала (включая b)
     * @return - новый массив, не содержащий элементы, принадлежащие интервалу
     */
    public static int[] arrayCompression (int[]arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= a && arr[i] <= b){
                arr[i] = 0;
            }
        }

        //System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] != 0) {
                    newArr[i] = arr[j];
                    arr[j] = 0;
                    break;
                }
            }
        }
        return newArr;
    }

    /**
     * Метод вычисляет сумму всех цифр массива
     * @param arr - исследуемый массив
     * @return - int, сумма всех цифр массива
     */
    public static int sumAllDigitsInArray(int[]arr) {
        int sum = 0;
        for (int a : arr) {
            while (a!=0) {
                int rest = a % 10;
                sum = sum + rest;
                a = a / 10;
            }
        }
        return sum;
    }
}

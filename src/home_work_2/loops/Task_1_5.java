package home_work_2.loops;

import java.util.Arrays;
import java.util.Random;

public class Task_1_5 {

    /**
     * Метод ищет максимальную цифру в натуральном числе
     * @param num - натуральное число, введенное пользователем
     * @return - максимальная цифра в переданном числе
     */
    public static int maxDigitInNumber (int num) {
        int maxNumber = 0;
        do {
            int rest = num % 10;
            if (rest > maxNumber) {
                maxNumber = rest;
            }
            num = num / 10;
        } while (num != 0);
        return maxNumber;
    }

    /**
     * Метод определяет вероятность выпадения четных чисел на заданном диапазоне включительно
     * @param minBound - нижняя граница диапазона (включительно)
     * @param maxBound - верхняя граница диапазона (исключительно)
     * @return - вероятность выпадения четных чисел в %.
     */
    public static double probabilityOfEvenNumbers (int minBound, int maxBound) {

        int[] arr = randomArray(1000, minBound, maxBound);

        return probabilityOfEvenNumbers(arr);
    }

    /**
     * Перегрузка метода probabilityOfEvenNumbers (int minBound, int maxBound) для тестирования
     * @param arr - массив, на котором определяется вероятность четных чисел
     * @return - вероятность выпадения четных чисел в %.
     */
    public static double probabilityOfEvenNumbers (int[]arr) {
        if(arr.length == 0) {
            return 0;
        }
        double countEvenNumber = 0;
        double resultOfProbability;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEvenNumber++;
            }
        }
        resultOfProbability = countEvenNumber / arr.length * 100;
        return resultOfProbability;
    }

    /**
     * Метод генерирует рандомный массив заданного размера и содержащий числа в заданном диапазоне
     * @param size - размер будущего массива
     * @param minBound - минимальное возможное число, содержащееся в массиве
     * @param maxBound - максимальное возможное число, содержащееся в массиве
     * @return - int-массив, заполненный рандомными числами
     */
    public static int[] randomArray(int size, int minBound, int maxBound) {
        int []arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size ; i++) {
            int randomNum = random.nextInt(maxBound - minBound) + minBound;
            arr[i] = randomNum;
        }
        return arr;
    }

    /**
     * Метод подсчитывает количество четных и нечетных цифр в числе
     * @param n - число, введенное пользователем
     * @return - строка, содержащая количество четных и нечетных цифр в числе
     */
    public static String numberOfEvenAndOddDigits (int n) {
        int countEven = 0;
        int countOdd = 0;
        do {
            int rest = n % 10;
            if (rest % 2 == 0 ) {
                countEven++;
            } else {
                countOdd++;
            }
            n = n / 10;
        } while (n != 0);

        return String.format("четных цифр - %d, нечетных цифр - %d", countEven, countOdd);
    }

    /**
     * Метод возвращает заданное количество элементов ряда Фибоначчи
     * @param amount - количество элементов ряда Фибоначчи, которое необходимо вывести
     * @return - строку, содержащую заданное количество элементов ряда Фибоначчи
     */
    public static String fibonacciSeriesElements(int amount) {
        int fib1 = 1;
        int fib2 = 2;
        int count = 2;
        String result = "" + fib1 + " " + fib2;

        if (amount == 0) {
            return "0";
        }

        if (amount == 1) {
            result = "" + fib1;
        }

        while (count < amount) {
            int fibNext = fib1 + fib2;
            result = result + " " + fibNext;
            fib1 = fib2;
            fib2 = fibNext;
            count++;
        }

        return result;
    }

    /**
     * Метод заполняет диапазон значениями в заданных границах с учетом заданного шага
     * @param start - стартовое значение диапазона
     * @param end - конечная граница диапазона(включительно)
     * @param st - шаг, используемый для заполнения диапазона числами
     * @return - строка - последовательность чисел
     */
    public static String allNumbersInRange (int start, int end, int st) {

        if (start == end) {
            return "Диапазон пуст";
        } else if (start > end) {
            return "Неверные границы диапазона";
        } else { //startNumber < endNumber
            if (st > (end - start)) {
                return "Заданный шаг превышает размер диапазона";
            } else if (st == 0) {
                return "Невозможно заполнить диапазон значениями, шаг равен нулю";
            } else {
                StringBuilder stb = new StringBuilder();
                for (int i = start; i <= end; i += st) {
                    stb.append(i);
                    if(i != end) {
                        stb.append(" ");
                    }
                }
                return stb.toString();
            }
        }
    }


    /**
     * Метод разворачивает полученное число
     * @param nat - число, которое будет перевернуто
     * @return - строка, содержащая перевернутое число
     */
    public static String turnNumber (int nat) {
        String result = "";

        if (nat == 0) {
            return "0";
        }

        while (nat != 0){
            int rest = nat % 10;
            result = result + rest;
            nat = nat / 10;
        }
        return  result;
    }
}

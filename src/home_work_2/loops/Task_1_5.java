package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = scanner.nextInt();
        int maxDigit = maxDigitInNumber(number);
        System.out.printf("Максимальная цифра в числе %d - %d", number, maxDigit);

        System.out.println("Введите нижнюю границу диапазона, на котором хотите узнать вероятность выпадения четных чисел");
        int min = scanner.nextInt();
        System.out.println("Введите верхнюю границу диапазона, на котором хотите узнать вероятность выпадения четных чисел");
        int max = scanner.nextInt();
        double probability = probabilityOfEvenNumbers(min, max);
        System.out.printf("Для интервала [%d, %d] вероятность выпадения четных чисел составляет " + probability +"%%", min, max);

        System.out.println("Введите натуральное число");
        int numb = scanner.nextInt();
        String result = numberOfEvenAndOddDigits(numb);
        System.out.println("В числе " + numb + result);

        System.out.println("Введите количество элементов ряда Фибоначчи, которое необходимо вывести на экран");
        int amountOfElements = scanner.nextInt();
        String fibonacciSeries = fibonacciSeriesElements(amountOfElements);
        System.out.println(fibonacciSeries);

        System.out.println("Введите начальное число диапазона");
        int startNumber = scanner.nextInt();
        System.out.println("Введите конечное число диапазона");
        int endNumber = scanner.nextInt();
        System.out.println("Введите шаг диапазона");
        int step = scanner.nextInt();
        String allNumb;
        if (startNumber == endNumber && endNumber == step) {
            allNumb = "Диапазон пуст";
        } else if (startNumber > endNumber) {
            allNumb = "Неверные границы диапазона";
        } else { //startNumber < endNumber
            if (step > (endNumber - startNumber)) {
                allNumb = "Заданный шаг превышает размер диапазона";
            } else if (step == 0) {
                allNumb = "Невозможно заполнить диапазон значениями, шаг равен нулю";
            } else {
                allNumb = allNumbersInRange(startNumber, endNumber, step);
            }
        }
        System.out.println(allNumb);

        System.out.println("Введите натуральное число");
        int natNum = scanner.nextInt();
        String reverse;
        if (natNum == 0) {
            reverse = "0";
        } else {
            reverse = turnNumber(natNum);
        }
        System.out.printf("Обратная запись числа %d: " + reverse, natNum);

    }

    /**
     * Метод ищет максимальную цифру в числе
     * @param num - число, введенное пользователем
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
        double countEvenNumber = 0;
        double resultOfProbability;
        Random random = new Random();
        for (int i = 0; i < 1000 ; i++) {
            int randomNum = random.nextInt(maxBound - minBound + 1) + minBound;
            if (randomNum % 2 == 0) {
                countEvenNumber++;
            }
        }
        resultOfProbability = countEvenNumber / 1000 * 100;
        return resultOfProbability;
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

        return String.format(" четных цифр - %d, нечетных цифр - %d", countEven, countOdd);
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
        String result = "";
        for (int i = start; i <= end ; i += st) {
            result = result + i + " ";
        }
        return result;
    }

    /**
     * Метод разворачивает полученное число
     * @param nat - число, которое будет перевернуто
     * @return - строка, содержащая перевернутое число
     */
    public static String turnNumber (int nat) {
        String result = "";
        while (nat != 0){
            int rest = nat % 10;
            result = result + rest;
            nat = nat / 10;
        }
        return  result;
    }
}

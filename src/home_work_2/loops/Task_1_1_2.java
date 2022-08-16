package home_work_2.loops;

import java.util.Scanner;

public class Task_1_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Введите целое число больше ноля");
            userNumber = scanner.nextInt();
            if (userNumber < 0) {
                System.out.println("Некорректный ввод! Отрицательное число!");
            } else if (userNumber == 0) {
                System.out.println("Некорректный ввод! Вы ввели ноль!");
            }
        } while (userNumber <= 0);

        System.out.println("Вычисление:");
        String sample = "";
        for (int i = 1; i <= userNumber; i++) {
            sample = sample + i + " ";
            if (i < userNumber) {
                sample = sample + "* ";
            } else {
                sample = sample + "= ";
            }
        }
        long result = factorial(userNumber);
        if (result <= 0) {
            System.out.println("Переполнение! Слишком большое число");
            System.out.println(sample + result);
        } else {
            System.out.println(sample + result);
        }

    }

    public static long factorial(int num) {
        long result = 1;
        if (num == 1) {
            return result;
        }
        result = num * factorial(num - 1);

        return result;
    }
}

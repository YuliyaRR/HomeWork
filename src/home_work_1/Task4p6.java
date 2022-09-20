package home_work_1;

import java.util.Scanner;

public class Task4p6 {
    public static void main(String[] args) {
        System.out.println("Введите год, чтобы проверить високосный ли он");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(checkLeapYear(year) ? "Високосный год" : "Невисокосный год");

    }

    public static boolean checkLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}

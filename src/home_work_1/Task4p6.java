package home_work_1;

import java.util.Scanner;

public class Task4p6 {
    public static void main(String[] args) {
        System.out.println("Введите год, чтобы проверить високосный ли он");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }
}

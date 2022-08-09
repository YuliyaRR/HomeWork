package home_work_1;

import java.util.Scanner;

public class Task4p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        if (a > b && a < c || a > c && a < b) {
            System.out.println("Среднее число a = " + a);
        } else if (b > a && b < c || b > c && b < a) {
            System.out.println("Среднее число b = " + b);
        } else if (c > b && c < a || c > a && c < b ) {
            System.out.println("Среднее число c = " + c);
        } else if (a == b && b == c) {
            System.out.println("Все введенные числа равны!");
        } else {
            System.out.println("Введено два одинаковых числа! Определить среднее из них невозможно!");
        }


    }
}

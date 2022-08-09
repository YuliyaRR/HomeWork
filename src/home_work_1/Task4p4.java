package home_work_1;

import java.util.Scanner;

public class Task4p4 {
    public static void main(String[] args) {
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Вы ввели отрицательное число!! Введите положительное число!");
        } else {
            System.out.println("Хотите перевести его в байты (b) или килобайты (k)?");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("b")) {
                result = number / 1024;
                System.out.printf("%f байт = %f кб", number, result);
            } else if (choice.equalsIgnoreCase("k")) {
                result = number * 1024;
                System.out.printf("%f кб = %f байт", number, result);
            } else {
                System.out.println("Вы ввели неверный символ");
            }
        }
        scanner.close();
    }

}


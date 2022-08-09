package home_work_1;

import java.util.Scanner;

public class Task4p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 127");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            System.out.println("Вы ввели отрицательное число! Введите положительное число из диапазона 0..127");
        } else if (number > 127) {
            System.out.println("Вы превысили допустимый диапазон значений! Введите положительное число из диапазона 0..127");
        } else if (number >= 65 && number <= 90) {
            System.out.printf("Под кодом %d в таблице ASCII хранится заглавная буква английского алфавита", number);
        } else if (number >= 97 && number <= 122) {
            System.out.printf("Под кодом %d в таблице ASCII хранится строчная буква английского алфавита", number);
        } else if (number >= 48 && number <= 57) {
            System.out.printf("Под кодом %d в таблице ASCII хранится цифра",number);
        } else {
            System.out.printf("Под кодом %d в таблице ASCII хранится иной символ", number);
        }


    }
}

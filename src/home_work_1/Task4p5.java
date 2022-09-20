package home_work_1;

import java.util.Scanner;

public class Task4p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 127");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(searchInASCII(number));

    }

    public static String searchInASCII (int number) {
        if (number < 0) {
            return "Вы ввели отрицательное число!";
        } else if (number > 127) {
            return "Вы превысили допустимый диапазон значений!";
        } else if (number >= 65 && number <= 90) {
            return String.format("Под кодом %d в таблице ASCII хранится заглавная буква английского алфавита", number);
        } else if (number >= 97 && number <= 122) {
            return String.format("Под кодом %d в таблице ASCII хранится строчная буква английского алфавита", number);
        } else if (number >= 48 && number <= 57) {
            return String.format("Под кодом %d в таблице ASCII хранится цифра",number);
        } else {
            return String.format("Под кодом %d в таблице ASCII хранится иной символ", number);
        }
    }
}

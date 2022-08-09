package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6p1 {
    public static void main(String[] args) {
        String vasya = "Вася";
        String anastasiya = "Анастасия";
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите свое имя");
        String username = scanner.nextLine();
        scanner.close();

        if (Objects.equals(username,vasya)) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else {
            if (Objects.equals(username,anastasiya)) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }

    }


}


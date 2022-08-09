package home_work_1;

import java.util.Scanner;

public class Task5 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if (vacation || !weekday) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean canISleepYet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сейчас рабочий день? true/false");
        boolean weekday = scanner.nextBoolean();
        System.out.println("Я в отпуске? true/false");
        boolean vacation = scanner.nextBoolean();
        scanner.close();

        canISleepYet = sleepIn(weekday, vacation);

        if (canISleepYet) {
            System.out.println("Отлично,можно спать дальше!");
        } else {
            System.out.println("Эх, нужно вставать на работу :(");
        }
    }

}

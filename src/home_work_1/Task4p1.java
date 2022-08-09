package home_work_1;

import java.util.Scanner;

public class Task4p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println(String.format("Число %d - четное", number));
        } else {
            System.out.println((String.format("Число %d - нечетное", number)));
        }
    }
}

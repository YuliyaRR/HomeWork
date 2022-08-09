package home_work_1;

import java.util.Scanner;

public class Task4p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        scanner.close();
        if (secondNumber == 0) {
            System.out.println("На ноль делить нельзя!!");
        } else if (firstNumber % secondNumber == 0) {
            System.out.printf("Число %d делится без остатка на число %d", firstNumber,secondNumber);
        } else {
            System.out.printf("Число %d делится на число %d с остатком", firstNumber,secondNumber);
        }
    }
}

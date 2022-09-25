package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task4p4 {
    public static void main(String[] args) {
        double result;
        double number;
        boolean checkNumber;
        String choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите положительное число");
            number = scanner.nextDouble();
            checkNumber = checkInputNumber(number);
            if (!checkNumber) {
                System.out.println("Вы ввели отрицательное число!!");
            }
        } while (!checkNumber);


            System.out.println("Хотите перевести его в байты (b) или килобайты (k)?");
            choice = scanner.next();

            try {
                String resultCheck = checkInputSymbol(choice);
                if (resultCheck.equals("k")) {
                    result = convertBytesToKilobytes(number);
                    System.out.printf("%.02f байт = %.02f кб\n", number, result);
                } else {
                    result = convertKilobytesToBytes(number);
                    System.out.printf("%.02f кб = %.02f байт\n", number, result);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        System.out.println("Работа завершена");

    }

    public static boolean checkInputNumber(double userNumber) {

        return !(userNumber < 0);
    }

    public static String checkInputSymbol(String userSymbol) {
        if (Objects.equals(userSymbol,"k") || Objects.equals(userSymbol,"K")) {
            return "k";
        } else if (Objects.equals(userSymbol,"b") || Objects.equals(userSymbol,"B")) {
            return "b";
        } else {
            throw new IllegalArgumentException("Вы ввели неверный символ");
        }
    }

    public static double convertBytesToKilobytes (double bytes){
        return bytes / 1024;
    }

    public static double convertKilobytesToBytes (double kilobytes){
        return kilobytes * 1024;
    }








}


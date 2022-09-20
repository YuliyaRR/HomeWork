package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task4p4 {
    public static void main(String[] args) {
        double result;
        double number;
        boolean checkNumber;
        String choice;
        int resultCheckSymbol;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите положительное число");
            number = scanner.nextDouble();
            checkNumber = checkInputNumber(number);
            if (!checkNumber) {
                System.out.println("Вы ввели отрицательное число!!");
            }
        } while (!checkNumber);

        do {
            System.out.println("Хотите перевести его в байты (b) или килобайты (k)?");
            choice = scanner.next();
            resultCheckSymbol = checkInputSymbol(choice);
            if (resultCheckSymbol == 0) {
                System.out.println("Вы ввели неверный символ");
            }
        } while (resultCheckSymbol == 0);

        switch (resultCheckSymbol) {
            case 1:
                result = convertBytesToKilobytes(number);
                System.out.printf("%.02f байт = %.02f кб", number, result);
                break;
            case 2:
                result = convertKilobytesToBytes(number);
                System.out.printf("%.02f кб = %.02f байт", number, result);
                break;
        }

    }

    public static boolean checkInputNumber(double userNumber) {
        return !(userNumber < 0);
    }

    public static int checkInputSymbol(String userSymbol) {
        if (Objects.equals(userSymbol,"k") || Objects.equals(userSymbol,"K")) {
            return 1;
        } else if (Objects.equals(userSymbol,"b") || Objects.equals(userSymbol,"B")) {
            return 2;
        } else {
            return 0;
        }
    }

    public static double convertBytesToKilobytes (double bytes){
        return bytes / 1024;
    }

    public static double convertKilobytesToBytes (double kilobytes){
        return kilobytes * 1024;
    }








}


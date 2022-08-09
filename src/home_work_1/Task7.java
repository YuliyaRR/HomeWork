package home_work_1;

import java.util.Scanner;

public class Task7 {

    public  static String createPhoneNumber (int [] num) {

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", num [0],num [1], num [2], num [3], num [4], num [5], num [6], num [7], num [8], num [9]);
    }

    public static void main(String[] args) {
        //Вариант решения, если массив проинициализирован
        int [] numInit = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numInit));

        //Вариант решения, если значения вводит пользователь
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести 10 положительный цифр от 0 до 9");
        int [] number = new int [10];
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Введите %d-е число", i+1);
            int userNumber = scanner.nextInt();
            if (userNumber < 0 || userNumber > 9) {
                System.out.println("Вы ввели неверное число!");
                break;
            } else {
                number [i] = userNumber;
            }
        }
        System.out.println(createPhoneNumber(number));
        scanner.close();
    }
}

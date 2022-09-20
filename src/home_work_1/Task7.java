package home_work_1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        //Вариант решения, если массив проинициализирован
        int[] numInit = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numInit));

        //Вариант решения, если значения вводит пользователь
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        System.out.println("Необходимо ввести 10 положительных цифр от 0 до 9");
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Введите %d-е число", i + 1);
            int userNumber = scanner.nextInt();
            if(!checkRightNumber(userNumber)) {
                System.out.println("Некорректные входные данные");
                break;
            } else {
                number[i] = userNumber;
            }
        }

        System.out.println(createPhoneNumber(number));
        scanner.close();
    }

    public static boolean checkRightNumber(int number) {
        return number >= 0 && number <= 9;
    }

    public  static String createPhoneNumber (int [] num) {
        StringBuilder stb = new StringBuilder();
        stb.append("(");
        for (int i = 0; i < num.length; i++) {
            stb.append(num[i]);

            if(i == 2) {
                stb.append(") ");
            }

            if(i == 5) {
                stb.append("-");
            }
        }
        return stb.toString();

    }
}



package home_work_2.loops;

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {
        long a = 1;
        int first = 3;
        long beforeOverflowFirst;
        do {
            beforeOverflowFirst = a;
            a = a * first;
        } while (a > 0);
        System.out.println("Значение до переполнения " + beforeOverflowFirst);//4 052 555 153 018 976 267
        System.out.println("Значение после переполнения " + a);//-6 289 078 614 652 622 815

        a = 1;
        int second = 188;
        long beforeOverflowSecond;
        do {
            beforeOverflowSecond = a;
            a = a * second;
        } while (a > 0);
        System.out.println("Значение до переполнения " + beforeOverflowSecond);//1 560 496 482 665 168 896
        System.out.println("Значение после переполнения " + a);//-1 774 566 438 301 073 408

        a = 1;
        int third = -19;
        long beforeOverflowThird;
        do {
            beforeOverflowThird = a;
            a = a * third;
        } while (a / third == beforeOverflowThird);
        System.out.println("Значение до переполнения " + beforeOverflowThird);//799 006 685 782 884 121
        System.out.println("Значение после переполнения " + a);// 3 265 617 043 834 753 317

        a = 1;
        Scanner scanner = new Scanner(System.in);
        long userNumber;
        do{
            System.out.println("Введите целое число");
            userNumber = scanner.nextLong();
            if (userNumber == 0) {
                System.out.println("При умножении на ноль результат равен ноль. Переполнения не будет. Введите другое число.");
            } else if (userNumber == 1 | userNumber == -1) {
                System.out.println("При умножении на единицу(минус единицу) переполнения не будет. Введите другое число.");
            }
        } while (userNumber==0 || userNumber == 1 || userNumber == -1);

        long beforeOverflowUserNum;

        do {
            beforeOverflowUserNum = a;
            a = a * userNumber;
        } while (a / userNumber == beforeOverflowUserNum);
        System.out.println("Значение до переполнения " + beforeOverflowUserNum);
        System.out.println("Значение после переполнения " + a);








    }


}

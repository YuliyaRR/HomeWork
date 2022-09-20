package home_work_2.loops;

import java.util.Scanner;

public class Task_1_4 {

    public static String multiplyToOverflow(int n) {
        long a = 1;
        long beforeOverflow;

        if (n == 0) {
            return "При умножении на ноль результат равен ноль. Переполнения не будет.";
        }

        if (n == 1 | n == -1){
            return "При умножении на единицу(минус единицу) переполнения не будет.";
        }

        do {
            beforeOverflow = a;
            a = a * n;
        } while (a / n == beforeOverflow);

        return numBeforeOverflow(beforeOverflow) + "\n" + numAfterOverflow(a);
    }

    public static String numBeforeOverflow(long before) {
        return "Значение до переполнения " + before;
    }

    public static String numAfterOverflow(long after) {
        return "Значение после переполнения " + after;
    }




}

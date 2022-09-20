package home_work_1;

public class Task4p2 {

    public String averageNumber(int a, int b, int c) {
        if (a > b && a < c || a > c && a < b) {
            return "Среднее число a = " + a;
        } else if (b > a && b < c || b > c && b < a) {
            return "Среднее число b = " + b;
        } else if (c > b && c < a || c > a && c < b ) {
            return "Среднее число c = " + c;
        } else if (a == b && b == c) {
            return "Все введенные числа равны!";
        } else {
            return "Введено два одинаковых числа! Определить среднее из них невозможно!";
        }


    }
}

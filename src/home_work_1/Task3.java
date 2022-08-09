package home_work_1;

public class Task3 {
    public static void main(String[] args) {

        //Что большe: e (экспонента) в степени pi или pi в степени е.
        if (Math.pow(Math.E, Math.PI) > Math.pow(Math.PI, Math.E)) {
            System.out.println("e в степени pi больше, чем pi в степени e");
        } else if (Math.pow(Math.E, Math.PI) < Math.pow(Math.PI, Math.E)) {
            System.out.println("pi в степени e больше, чем e в степени pi");
        } else {
            System.out.println("e в степени pi равно pi в степени e");
        }

        //Даны длины двух катетов прям-го треугольника a и b. Вывести периметр тр-ка,округленный до целого по правилам математики.
        double a = 3.5;
        double b = 5.8;
        double c = Math.abs(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        long result = Math.round(a + b + c);
        System.out.println(result);

        //Дан угол g градусов. Вывести у = sin(g) + cos(g)
        double g = 40;
        double gToRadians = Math.toRadians(g);
        double y = Math.sin(gToRadians) + Math.cos(gToRadians);
        System.out.println(y);

        //Минимум и максимум
        int k = 10;
        int l = 15;
        int minResult = Math.min(k * 4 + l - 3, k * k + l * l);
        int maxResult = Math.max(k * 4 + l - 3, k * k + l * l);
        System.out.println(minResult);
        System.out.println(maxResult);

        //Сгенерировать случайное целое число в диапазоне [m;n)
        int m = 2;
        int n = 6;
        int randomNumber = (int) (Math.random()*(n - m)) + m;
        System.out.println(randomNumber);

    }
}

package home_work_2.loops;


import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Возведение в степень");
        System.out.println("Введите число, которое хотите возвести в степень");
        double number = scanner.nextDouble();//при вводе дробного числа через '.' - InputMismatchException, через ',' - ок
        double result = 0.0;
        int pow;

        do {
            System.out.println("Введите степень, в которую хотите возвести число. " +
                    "Степень должна быть целым положительным числом.");
            pow = scanner.nextInt();
            if (pow < 0) {
                System.out.println("Вы ввели отрицательное число.");
            }
        } while (pow < 0);

        result = exponentiate(number, pow);

        System.out.println(number + " ^ " + pow + " = " + result);


    }

    /**
     * Метод возводит число в положительную степень
     * @param num - число, которое нужно возвести в степень
     * @param p - степень, в которую нужно возвести число
     * @return  - результат возведения в степень
     */
    public static double exponentiate (double num, int p) {
        double answer;
        if (p == 0) { //если степень равна нулю
            answer = 1;
        } else {
            answer = num;
            for (int i = 1; i < p; i++) {
                answer = answer * num;
            }
        }
        return  answer;
    }
}

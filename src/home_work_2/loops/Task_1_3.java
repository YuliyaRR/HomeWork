package home_work_2.loops;

public class Task_1_3 {
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

    public static String sampleView (double num, int p) {
        return num + " ^ " + p + " = " + exponentiate(num, p);
    }
}

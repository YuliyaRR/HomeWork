package home_work_2.loops;

public class Task_1_1_1 {

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result = result * i;
        }
        return result;
    }

    public static String makeSample (String num) {
        int number = Integer.parseInt(num);
        StringBuilder stb = new StringBuilder();
        if (checkData(number)) {
            long fact = factorial(number);
            for (int i = 1; i <= number ; i++) {
                stb.append(i);
                if(i == number) {
                    stb.append(" = ");
                } else {
                    stb.append(" * ");
                }
            }
            if(checkOverflowInt(fact)) {
                stb.append("Переполнение! Слишком большое число!");
            } else {
                stb.append(fact);
            }
            return stb.toString();
        } else {
            return "Некорректные данные";
        }
    }

    public static boolean checkOverflowInt (long number) {
       return number > Integer.MAX_VALUE || number <= 0;
    }

    public static boolean checkData(int num) {
        return num > 0;
    }
}






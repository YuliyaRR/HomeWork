package home_work_2.loops;

public class Task_1_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число больше нуля");
        String userNumber = args [0];
        int number;
        long result = 1;
        String sample = "";

        if (userNumber.contains(".")) {
            System.out.println("Вы ввели дробное число!");
        } else {
            number = Integer.parseInt(userNumber);
            if (number < 0) {
                System.out.println("Вы ввели отрицательное число!");
            } if (number == 0) {
                System.out.println("Вы ввели ноль!");
            } else {
                for (int i = 1; i <= number ; i++) {
                    result = result * i;
                    sample = sample + i;
                    if (result > Integer.MAX_VALUE) {
                        System.out.println(sample + " = Переполнение! Слишком большое число!");
                        break;
                    } else {
                        if (i == number) {
                            sample = sample + " = ";
                            System.out.println(sample + result);
                        } else {
                            sample = sample + " * ";
                        }
                    }
                }


            }

        }

    }



}


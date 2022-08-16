package home_work_2.loops;




public class Task_1_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        String userNumber = args[0];
        System.out.println(userNumber);
        String calculationAndResult;
        int dataCheck = dataValidation(userNumber);

        if (dataCheck == -1) {
            System.out.println("Введено дробное число!");
        } else if (dataCheck == -2) {
            System.out.println("Введено не число");
        } else {
            calculationAndResult = multiplicationOfAllDigits(userNumber);
            System.out.println(calculationAndResult);
        }

    }

    /**
     * Метод проверяет корректность введенных пользователем данных (содержит ли строка только целые числа)
     * @param userNum - данные, введенные пользователем;
     * @return 0 - данные корректны;
     *         -1 - данные некорректны (пользователь ввел дробное число);
     *         -2 - данные некорректны (пользователь ввел букву либо иной символ).
     */
    public static int dataValidation(String userNum) {
        char[]arr = userNum.toCharArray();
        int result = 0;
        int countSpot = 0;

        for (char a: arr) {
            if (a == '.') {
                countSpot++;
                if (countSpot > 1) {
                    result = -2;
                    break;
                }
            } else if (Character.isLetter(a)) {
                result = -2;
                break;
            } else if (Character.isDigit(a)){
                result = 0;
            } else {
                result = -2;
            }
        }

        if (countSpot == 1) {
            result = -1;
        }

        return result;
    }

    /**
     * Метод перемножает между собой цифры, составляющие число, введенное пользователем
     * @param fromUser - число, введенное пользователем
     * @return строку в виде примера: содержит все цифры из числа пользователя перемноженные между собой
     *         и результат умножения.
     */
    public static String multiplicationOfAllDigits (String fromUser) {
        String [] userNumberToStringArray = fromUser.split("");
        int [] toIntArray = new int[userNumberToStringArray.length];
        String sample = "";
        int resultOfMultiply = 1;

        for (int i = 0; i < toIntArray.length; i++) {
            toIntArray [i] = Integer.parseInt(userNumberToStringArray[i]);
            sample = sample + toIntArray [i];
            resultOfMultiply = resultOfMultiply * toIntArray[i];
            if(i == toIntArray.length-1) {
                sample = sample + " = " + resultOfMultiply;
            }else {
                sample = sample + " * ";
            }
        }
        return sample;

    }
}

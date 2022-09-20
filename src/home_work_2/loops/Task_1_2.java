package home_work_2.loops;

public class Task_1_2 {

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
     * @return результат перемножения всех цифр числа.
     */
     public static long multiplicationOfAllDigits (int fromUser) {
        long resultOfMultiply = 1;
        int digit;
        while (fromUser != 0) {
            digit = fromUser % 10;
            resultOfMultiply = resultOfMultiply * digit;
            fromUser = fromUser / 10;
        }
        return resultOfMultiply;
    }


    public static String sampleView (String fromUser) {
        int userNum = Integer.parseInt(fromUser);
        StringBuilder stb = new StringBuilder();
        int stringLength = fromUser.length();
        for (int i = 0; i < stringLength; i++) {
            stb.append(fromUser.charAt(i));
            if (i == stringLength - 1) {
                stb.append(" = ").append(multiplicationOfAllDigits(userNum));
            } else {
                stb.append(" * ");
            }
        }

        return stb.toString();
    }

}

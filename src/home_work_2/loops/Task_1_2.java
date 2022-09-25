package home_work_2.loops;

public class Task_1_2 {

    /**
     * Метод проверяет корректность введенных пользователем данных (содержит ли строка только целые числа)
     * @param userNum - данные, введенные пользователем;
     * Throws:IllegalArgumentException - если введено не число
     * @return  - true, если данные корректны.
     * В случае некоректности данных метод выбрасывает исключение
     */

     public static boolean dataValidation(String userNum) {
        char[]arr = userNum.toCharArray();
        boolean result = false;
        int countSpot = 0;

        for (char a: arr) {
            if (a == '.') {
                countSpot++;
                if (countSpot > 1) {
                    throw new IllegalArgumentException("Введено не число");
                }
            } else if (Character.isLetter(a)) {
                throw new IllegalArgumentException("Введено не число");
            } else if (Character.isDigit(a)){
                result = true;
            } else {
                throw new IllegalArgumentException("Введено не число");
            }
        }

        if (countSpot == 1) {
            throw new IllegalArgumentException("Введено дробное число");
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

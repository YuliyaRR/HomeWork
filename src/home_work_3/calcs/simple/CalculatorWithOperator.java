package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Метод производит деление
     * @param a - делимое (double)
     * @param b - делитель (double)
     * @throws ArithmeticException - если b = 0;
     * @return - частное (double) - результат деления
     */
    public double divide (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    /**
     * Метод производит умножение
     * @param a - первый множитель (double)
     * @param b - второй множитель (double)
     * @return - произведение (double) - результат умножения
     */
    public double multiply (double a, double b) {
        return a * b;
    }

    /**
     * Метод определяет разность двух чисел
     * @param a - уменьшаемое
     * @param b - вычитаемое
     * @return - разность двух чисел
     */
    public double minus(double a, double b) {
        return a - b;
    }

    /**
     * Метод определяет сумму двух чисел
     * @param a - первое слагаемое
     * @param b - второе слагаемое
     * @return - сумма двух чисел (double)
     */
    public double sum (double a, double b) {
        return a + b;
    }

    /**
     * Метод возводит дробное положительное число в n-ую степень используя рекурсию
     * @param a - число, которое необходимо возвести в степень
     * @param b - степень(целое число), в которую необходимо возвести
     * @return - double (a в степени b)
     */
    public double degree(double a, int b) {
        double result;
        if (b == 0) {
            return result = 1;
        }
        result = a * degree(a, b-1);

        return result;
    }

    /**
     * Метод вычисляет модуль числа
     * @param a - число, модуль которого необходимо вычислить
     * @return - значение числа по модулю
     */
    public double module(double a) {
        return a >= 0? a: -a;
    }

    /**
     * Метод вычисляет квадратный корень из числа
     * @param a - число, квадратныц корень которого необходимо вычислить
     * @return - квадратный корень из числа
     */
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }





}

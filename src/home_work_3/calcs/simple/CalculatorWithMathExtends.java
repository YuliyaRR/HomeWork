package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    /**Метод возводит дробное положительное число в n-ую степень,используя класс Math
     * @param a - число, которое необходимо возвести в степень
     * @param b - степень(целое число), в которую необходимо возвести
     * @return - double (a в степени b)
     *
     */
    public double degree(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    /**
     * Метод вычисляет модуль числа, используя класс Math
     * @param a - число, модуль которого необходимо вычислить
     * @return - значение числа по модулю
     */
    public double module(double a) {
        return Math.abs(a);
    }

    /**
     * Метод вычисляет квадратный корень из числа, используя класс Math
     * @param a - число, квадратныц корень которого необходимо вычислить
     * @return - квадратный корень из числа
     */
    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}

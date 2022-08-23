package home_work_3.calcs.api;

public interface ICalculator {
     /**
      * Метод производит деление
      * @param a - делимое (double)
      * @param b - делитель (double)
      * @return - частное (double) - результат деления
      */
     double divide(double a, double b);

     /**
      * Метод производит умножение
      * @param a - первый множитель (double)
      * @param b - второй множитель (double)
      * @return - произведение (double) - результат умножения
      */
     double multiply(double a, double b);

     /**
      * Метод определяет разность двух чисел
      * @param a - уменьшаемое
      * @param b - вычитаемое
      * @return - разность двух чисел
      */
     double minus(double a, double b);

     /**
      * Метод определяет сумму двух чисел
      * @param a - первое слагаемое
      * @param b - второе слагаемое
      * @return - сумма двух чисел (double)
      */
     double sum (double a, double b);

     /**
      * Метод возводит дробное положительное число в n-ую степень используя рекурсию
      * @param a - число, которое необходимо возвести в степень
      * @param b - степень(целое число), в которую необходимо возвести
      * @return - double (a в степени b)
      */
     double degree(double a, int b);

     /**
      * Метод вычисляет модуль числа
      * @param a - число, модуль которого необходимо вычислить
      * @return - значение числа по модулю
      */
     double module(double a);

     /**
      * Метод вычисляет квадратный корень из числа
      * @param a - число, квадратныц корень которого необходимо вычислить
      * @return - квадратный корень из числа
      */
     double squareRoot(double a);





}

package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt(); //33 в двоичной системе 0010_0001
        int secondNumber = scanner.nextInt();//15 в двоичной системе 0000_1111
        scanner.close();
        int result1 = firstNumber & secondNumber; //результат 1 в двоичной системе 0000_0001 (ручной расчет)
        int result2 = firstNumber | secondNumber; ////результат 47 в двоичной системе 0010_1111 (ручной расчет)
        System.out.println(result1);
        System.out.println(result2);

        //Дополнительный программный перевод в двоичную систему счисления (результат из консоли) для проверки ручного расчета
        String result1ToBinary = Integer.toBinaryString(result1); //1
        String result2ToBinary = Integer.toBinaryString(result2); //101111
        System.out.println(result1ToBinary);
        System.out.println(result2ToBinary);

        //Попытка сделать побитовую операцию с числом 42.5

        double fractionalNumber = 42.5;
        //double result3 = fractionalNumber & firstNumber; //Error: Operator '&' cannot be applied to 'double'
        //Побитовые операции в Java проводятся только над целочисленными типами, поэтому данный код не скомпилируется,
        //будет выведена ошибка "bad operand types for binary operator '&'"


    }
}

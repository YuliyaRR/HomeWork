package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

//В комментариях производится проверка на примере числа (-42).
//Для облегчения проверки на ключевых этапах вывод помещен в комментарии.


public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte num = scanner.nextByte();//-42
        String toBinary = toBinaryString(num);
        System.out.println(toBinary);
    }

    public static String toBinaryString (byte number) {
        String result;
        byte num =(byte) Math.abs(number);
        String remainder = "";//в строку будем последовательно записывать остатки от деления num на 2
        String directBinary; //в строку будет записан прямой код
        String additionalBinary = "";//в строку будет записан дополнительный код
        //Обработаны частные случаи
        switch (num)  {
            case 0:
                remainder = remainder + 0;
                break;
            case 1:
                remainder = remainder + 1;
                break;
            case -128:
                remainder = "00000001";
                break;
            default:
                while (true) {
                    byte temp = (byte) (num / 2);
                    byte rest = (byte) (num % 2);
                    remainder = remainder + rest;
                    if (num / 2 == 1) {
                        remainder = remainder + 1;
                        break;
                    }
                    num = temp;
                }
        }

        //System.out.println(remainder); //010101

        //если длина строки меньше 8(из расчета 8 бит), то дополняем необходимым количеством незначащих нулей
        if (remainder.length() < 8) {
            do {
                remainder = remainder + 0;
            } while (remainder.length() != 8);
        }

        //System.out.println(remainder);//01010100

        //разворачиваем строку, чтобы получить прямой двоичный код
        directBinary = new StringBuilder(remainder).reverse().toString();
        //System.out.println(directBinary);//00101010

        //далее операции производятся только, если передано отрицательное число;
        //сначала прямой код переводится в обратный;
        //после к младшему значащему разряду обратного кода числа добавляется 1 и получается дополнительный код.

        if (number < 0) {
            //прямой код -> обратный код(0 меняется на 1, 1 меняется на 0).
            String [] fromDirectBinaryString = directBinary.split("");//[0, 0, 1, 0, 1, 0, 1, 0]
            int [] reversBinary = new int[fromDirectBinaryString.length];//создаем массив для хранения обратного кода
            for (int i = 0; i < fromDirectBinaryString.length; i++) {
                reversBinary[i] = Integer.parseInt(fromDirectBinaryString[i]);//преобразуем строковый элемент массива в число и записываем в аналогичную позицию числового массива
                if(reversBinary[i] == 1) {
                    reversBinary [i] = 0;
                } else {
                    reversBinary [i] = 1;
                }
            }
            //System.out.println(Arrays.toString(reversBinary));//[1, 1, 0, 1, 0, 1, 0, 1]

            //обратный код -> дополнительный код(к младшему значащему разряду обратного кода числа прибавляется 1)
            if (reversBinary[reversBinary.length - 1] == 0) { //если последняя цифра в массиве 0, то просто меняем ee на 1
                reversBinary[reversBinary.length - 1] = 1;
            } else { // если последняя цифра в массиве = 1,
                reversBinary[reversBinary.length - 1] = 0; //то меняем ее на 0
                reversBinary[reversBinary.length - 2] += 1 ;//и прибавляем 1 к предыдущей цифре
                for (int i = reversBinary.length - 2; i > 0; i--) {
                    if (reversBinary[i] == 1) {//если в итоге получили 1
                        break;//выходим из цикла
                    } else {// иначе, если получили 2
                        reversBinary[i] = 0;//меняем на 0
                        reversBinary[i - 1] = reversBinary[i - 1] + 1;//и прибавляем 1 к предыдущей цифре и т.д
                    }
                }
            }
            //System.out.println(Arrays.toString(reversBinary));//[1, 1, 0, 1, 0, 1, 1, 0] дополнительный код в массиве

            //переписываем дополнительный код в строку
            for (int r: reversBinary) {
                additionalBinary = additionalBinary + r;
            }
            //System.out.println(additionalBinary);//11010110
        }
        if (number >= 0) {
            result = directBinary;
        } else {
            result = additionalBinary;
        }
        return result;

    }


}

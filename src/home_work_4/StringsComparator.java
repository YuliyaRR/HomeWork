package home_work_4;

import java.util.Comparator;

public class StringsComparator implements Comparator<String> {

    /**
     * Метод реализует метод compare из интерфейса Comparator для типа String.
     * Объекты String сравниваются между собой по длинне строки.
     * @param s1 - первый объект типа String
     * @param s2 - второй объект типа String
     * @return - 0, если s1 =s2;
     *         - отрицательное число, если s1 < s2;
     *         - положительное число, если s1 > s2
     */
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

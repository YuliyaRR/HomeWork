package home_work_4;

import java.util.Comparator;

public class IntegersComparator implements Comparator<Integer> {

    /**
     * Метод реализует метод compare из интерфейса Comparator для типа Integer
     * Объекты Integer сравниваются между собой по значению.
     * @param i1 - первый объект типа Integer
     * @param i2 - второй объект типа Integer
     * @return - 0, если i1 = i2;
     *         - отрицательное число, если i1 < i2;
     *         - положительное число, если i1 > i2
     */
    @Override
    public int compare( Integer i1, Integer i2) {
        return i1 - i2;
    }

}

package home_work_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class IntegersComparatorTest {
    @Test
    public void compare() {
        Integer num = 5;
        Integer num2 = 12;
        Comparator<Integer> cmp = new IntegersComparator();
        int compare = cmp.compare(num, num2);
        Assertions.assertTrue(compare < 0);
    }

    @Test
    public void compare2() {
        Integer num = 5;
        Integer num2 = 5;
        Comparator<Integer> cmp = new IntegersComparator();
        int compare = cmp.compare(num, num2);
        Assertions.assertEquals(0, compare);
    }

    @Test
    public void compare3() {
        Integer num = 5;
        Integer num2 = 12;
        Comparator<Integer> cmp = new IntegersComparator();
        int compare = cmp.compare(num2, num);
        Assertions.assertTrue(compare > 0);
    }
}

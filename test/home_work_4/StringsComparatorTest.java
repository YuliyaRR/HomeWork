package home_work_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class StringsComparatorTest {
    @Test
    public void compare() {
        String word = "Cat";
        String word2 = "House";
        Comparator<String> cmp = new StringsComparator();
        int compare = cmp.compare(word, word2);
        Assertions.assertTrue(compare < 0);
    }

    @Test
    public void compare2() {
        String word = "Cat";
        String word2 = "Dog";
        Comparator<String> cmp = new StringsComparator();
        int compare = cmp.compare(word, word2);
        Assertions.assertEquals(0, compare);
    }

    @Test
    public void compare3() {
        String word = "Cat";
        String word2 = "House";
        Comparator<String> cmp = new StringsComparator();
        int compare = cmp.compare(word2, word);
        Assertions.assertTrue(compare > 0);
    }
}

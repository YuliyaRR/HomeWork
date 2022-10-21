package home_work_war_and_peace.comparator;

import home_work_war_and_peace.dto.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class ComparatorWordCountTest {
    @Test
    public void compare() {
        WordCount w1 = new WordCount("осень", 5);
        WordCount w2 = new WordCount("лето", 2);
        Comparator<WordCount> cmp = new ComparatorWordCount();
        int res = cmp.compare(w1, w2);
        Assertions.assertTrue(res < 0);
    }

    @Test
    public void compare2() {
        WordCount w1 = new WordCount("осень", 5);
        WordCount w2 = new WordCount("лето", 2);
        Comparator<WordCount> cmp = new ComparatorWordCount();
        int res = cmp.compare(w2, w1);
        Assertions.assertTrue(res > 0);
    }

    @Test
    public void compare3() {
        WordCount w1 = new WordCount("осень", 5);
        WordCount w2 = new WordCount("лето", 5);
        Comparator<WordCount> cmp = new ComparatorWordCount();
        Assertions.assertEquals(0, cmp.compare(w1, w2));
    }
}

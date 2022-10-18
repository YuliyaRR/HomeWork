package home_work_collections.comparator;

import home_work_collections.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class LengthPasswordAndNickComparatorTest {
    @Test
    public void compare() {
        Person one = new Person("Alex", "123456", "Al");
        Person two = new Person("Lola", "123456789", "OLOla");
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        int result = cmp.compare(one,two);
        Assertions.assertTrue(result < 0);
    }

    @Test
    public void compare2() {
        Person one = new Person("Alex", "123456", "Al");
        Person two = new Person("Lola", "123456789", "OLOla");
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        int result = cmp.compare(two, one);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void compare3() {
        Person one = new Person("Alex", "123456", "Al");
        Person two = new Person("Lola", "123456", "OL");
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        int result = cmp.compare(one, two);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void compare4() {
        Person one = new Person("Alex", "123456", "Al");
        Person two = new Person("Lola", "123456", "OL");
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        int result = cmp.compare(two, one);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void compare5() {
        Person one = new Person("Alex", "123456", "Al");
        Person two = new Person("Lola", "123456", "Al");
        Comparator<Person> cmp = new LengthPasswordAndNickComparator();
        int result = cmp.compare(two, one);
        Assertions.assertEquals(0, result);
    }
}

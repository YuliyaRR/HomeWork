package home_work_collections.comparator;

import home_work_collections.dto.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AgeAnimalComparatorTest {
    @Test
    public void compare(){
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(8, "Lizzy");
        Comparator<Animal> cmp = new AgeAnimalComparator();
        int result = cmp.compare(one,two);
        Assertions.assertTrue(result < 0);
    }

    @Test
    public void compare2(){
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(8, "Lizzy");
        Comparator<Animal> cmp = new AgeAnimalComparator();
        int result = cmp.compare(two, one);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void compare3(){
        Animal one = new Animal(5, "Bob");
        Animal two = new Animal(5, "Lizzy");
        Comparator<Animal> cmp = new AgeAnimalComparator();
        int result = cmp.compare(two, one);
        Assertions.assertEquals(0, result);
    }
}

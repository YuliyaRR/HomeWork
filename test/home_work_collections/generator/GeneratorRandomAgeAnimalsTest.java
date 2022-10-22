package home_work_collections.generator;

import home_work_collections.api.INumGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratorRandomAgeAnimalsTest {
    @Test
    public void generate() {
        INumGenerator iNumGenerator = new GeneratorRandomAgeAnimals();
        int age = iNumGenerator.generateNum();
        Assertions.assertTrue(age > 0 && age <= 15);
    }
}

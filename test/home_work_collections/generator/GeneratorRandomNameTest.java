package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class GeneratorRandomNameTest {
    @Test
    public void generateString() {
        GeneratorRandomName generator = new GeneratorRandomName();
        List<String>listName = generator.getPeopleNames();
        String name = generator.generateString();
        boolean result = false;
        for (String s : listName) {
            if(Objects.equals(name, s)) {
                result = true;
                break;
            }
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void generateString2() {
        IStringGenerator generator = new GeneratorRandomName();
        String name = generator.generateString();
        Assertions.assertNotNull(name);
    }
}

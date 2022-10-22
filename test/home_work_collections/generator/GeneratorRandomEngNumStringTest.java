package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratorRandomEngNumStringTest {
    @Test
    public void generateString() {
        IStringGenerator generator = new GeneratorRandomEngNumString(7);
        String result = generator.generateString();
        Assertions.assertEquals(7, result.length());
    }

    @Test
    public void generateString2() {
        IStringGenerator generator = new GeneratorRandomEngNumString();
        String result = generator.generateString();
        Assertions.assertTrue(result.length() > 0 && result.length() <=50);
    }

    @Test
    public void generateString3() {
        IStringGenerator generator = new GeneratorRandomEngNumString();
        String result = generator.generateString();
        Assertions.assertNotNull(result);
    }

    @Test
    public void generateString4() {
        IStringGenerator generator = new GeneratorRandomEngNumString(7);
        String result = generator.generateString();
        Assertions.assertNotNull(result);
    }
}

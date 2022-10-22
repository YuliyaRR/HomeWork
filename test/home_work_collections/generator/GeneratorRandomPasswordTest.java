package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratorRandomPasswordTest {
    @Test
    public void generateString() {
        IStringGenerator iStringGenerator = new GeneratorRandomPassword();
        String password = iStringGenerator.generateString();
        Assertions.assertTrue(password.length() >= 5 && password.length() <= 10);
    }

    @Test
    public void generateString2() {
        IStringGenerator generator = new GeneratorRandomPassword();
        String result = generator.generateString();
        Assertions.assertNotNull(result);
    }
}

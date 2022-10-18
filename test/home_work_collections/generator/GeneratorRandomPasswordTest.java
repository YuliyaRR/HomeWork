package home_work_collections.generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratorRandomPasswordTest {
    @Test
    public void generate() {
        IStringGenerator iStringGenerator = new GeneratorRandomPassword();
        String password = iStringGenerator.generateString();
        Assertions.assertTrue(password.length() >= 5 && password.length() <= 10);
    }
}

package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class GeneratorRandomNickAnimalTest {
    @Test
    public void generateString() {
        GeneratorRandomNickAnimal generator = new GeneratorRandomNickAnimal();
        List<String>listName = generator.getAnimalsNicks();
        String nick = generator.generateString();
        boolean result = false;
        for (String s : listName) {
            if(Objects.equals(nick, s)) {
                result = true;
                break;
            }
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void generateString2() {
        IStringGenerator generator = new GeneratorRandomNickAnimal();
        String name = generator.generateString();
        Assertions.assertNotNull(name);
    }
}

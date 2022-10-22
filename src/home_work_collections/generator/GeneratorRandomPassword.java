package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;

import java.util.Random;

public class GeneratorRandomPassword implements IStringGenerator {

    private int length;

    public GeneratorRandomPassword() {
        Random rnd = new Random();
        this.length = 5 + rnd.nextInt(6);
    }

    @Override
    public String generateString() {
        String charEngLetterAndNumber = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        Random rnd = new Random();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            stb.append(charEngLetterAndNumber.charAt(rnd.nextInt(61)));
        }
        return stb.toString();
    }
}

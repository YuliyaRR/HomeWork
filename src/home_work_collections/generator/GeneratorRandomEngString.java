package home_work_collections.generator;

import java.util.Random;

public class GeneratorRandomEngString implements IStringGenerator {
    private int length;

    public GeneratorRandomEngString(int length) {
        this.length = length;
    }

    public GeneratorRandomEngString() {
        Random rnd = new Random();
        this.length = rnd.nextInt(50) + 1;//чтобы не генерировало пустую строку доб.+1
    }

    @Override
    public String generateString() {
        String charEngLetterAndNumber = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            stb.append(charEngLetterAndNumber.charAt(rnd.nextInt(52)));
        }
        return stb.toString();
    }

}

package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;

import java.util.Random;

public class GeneratorRandomEngNumString implements IStringGenerator {
    private int length;

    public GeneratorRandomEngNumString(int length) {
        this.length = length;
    }

    public GeneratorRandomEngNumString() {
        Random rnd = new Random();
        this.length = rnd.nextInt(50) + 1;//чтобы не генерировало пустую строку доб.+1
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

package home_work_collections.generator;

import home_work_collections.api.IStringGenerator;

import java.util.Random;

public class GeneratorRandomRusString implements IStringGenerator {
    private int length;

    public GeneratorRandomRusString(int length) {
        this.length = length;
    }

    public GeneratorRandomRusString() {
        Random rnd = new Random();
        this.length = rnd.nextInt(50) + 1;//чтобы не генерировало пустую строку доб.+1
    }

    @Override
    public String generateString() {
        String charRusLetter = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random rnd = new Random();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            stb.append(charRusLetter.charAt(rnd.nextInt(66)));
        }
        return stb.toString();
    }

}

package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4p5Test {

    @Test
    public void searchInASCII(){
        Assertions.assertEquals("Под кодом 80 в таблице ASCII хранится заглавная буква английского алфавита",
                Task4p5.searchInASCII(80));
    }

    @Test
    public void searchInASCII2(){
        Assertions.assertEquals("Под кодом 65 в таблице ASCII хранится заглавная буква английского алфавита",
                Task4p5.searchInASCII(65));
    }

    @Test
    public void searchInASCII3(){
        Assertions.assertEquals("Под кодом 90 в таблице ASCII хранится заглавная буква английского алфавита",
                Task4p5.searchInASCII(90));
    }

    @Test
    public void searchInASCII4(){
        Assertions.assertEquals("Под кодом 100 в таблице ASCII хранится строчная буква английского алфавита",
                Task4p5.searchInASCII(100));
    }

    @Test
    public void searchInASCII5(){
        Assertions.assertEquals("Под кодом 97 в таблице ASCII хранится строчная буква английского алфавита",
                Task4p5.searchInASCII(97));
    }

    @Test
    public void searchInASCII6(){
        Assertions.assertEquals("Под кодом 122 в таблице ASCII хранится строчная буква английского алфавита",
                Task4p5.searchInASCII(122));
    }

    @Test
    public void searchInASCII7(){
        Assertions.assertEquals("Под кодом 48 в таблице ASCII хранится цифра",
                Task4p5.searchInASCII(48));
    }

    @Test
    public void searchInASCII8(){
        Assertions.assertEquals("Под кодом 57 в таблице ASCII хранится цифра",
                Task4p5.searchInASCII(57));
    }

    @Test
    public void searchInASCII9(){
        Assertions.assertEquals("Под кодом 52 в таблице ASCII хранится цифра",
                Task4p5.searchInASCII(52));
    }

    @Test
    public void searchInASCII10(){
        Assertions.assertEquals("Вы ввели отрицательное число!",
                Task4p5.searchInASCII(-15));
    }

    @Test
    public void searchInASCII11(){
        Assertions.assertEquals("Вы превысили допустимый диапазон значений!",
                Task4p5.searchInASCII(354));
    }

    @Test
    public void searchInASCII12(){
        Assertions.assertEquals("Вы превысили допустимый диапазон значений!",
                Task4p5.searchInASCII(128));
    }

    @Test
    public void searchInASCII13(){
        Assertions.assertEquals("Под кодом 127 в таблице ASCII хранится иной символ",
                Task4p5.searchInASCII(127));
    }

    @Test
    public void searchInASCII14(){
        Assertions.assertEquals("Под кодом 0 в таблице ASCII хранится иной символ",
                Task4p5.searchInASCII(0));
    }










}

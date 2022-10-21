package home_work_war_and_peace.workers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextSeparatorTest {
    @Test
    public void split(){
        TextSeparator separator = new TextSeparator();
        String str = "Он.шел,невольно:чуть-чуть припадая!на одну ногу, и (с этого) времени ?почти" +
                " все      его\n силы. души, вся " +
                "" +
                "" +
                "\t";
        String[]expected = {"Он", "шел", "невольно","чуть-чуть", "припадая", "на","одну", "ногу", "и",
                "с", "этого", "времени", "почти", "все", "его", "силы", "души", "вся"};
        Assertions.assertArrayEquals(expected, separator.splitTextByPunctuation(str));
    }

    @Test
    public void split2() {
        TextSeparator separator = new TextSeparator();
        String str = "Осень - пора -- года-года";
        String[]expected = {"Осень", "пора", "года-года"};
        Assertions.assertArrayEquals(expected, separator.splitTextByPunctuation(str));
    }

    @Test
    public void split3() {
        TextSeparator separator = new TextSeparator();
        String str = "Осень -- пора года";
        String[]expected = {"Осень", "пора", "года"};
        Assertions.assertArrayEquals(expected, separator.splitTextByPunctuation(str));
    }

    @Test
    public void split4() {
        TextSeparator separator = new TextSeparator();
        String str = "Осень;пора ;года-года";
        String[]expected = {"Осень", "пора", "года-года"};
        Assertions.assertArrayEquals(expected, separator.splitTextByPunctuation(str));
    }

    @Test
    public void split5() {
        TextSeparator separator = new TextSeparator();
        String str = "Осень     пора      года-года    ";
        String[]expected = {"Осень", "пора", "года-года"};
        Assertions.assertArrayEquals(expected, separator.splitTextByPunctuation(str));
    }
}

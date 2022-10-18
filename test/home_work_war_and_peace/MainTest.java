package home_work_war_and_peace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MainTest {
    @Test
    public void split(){
        String str = "Он.шел,невольно:чуть-чуть припадая!на одну ногу, и (с этого) времени ?почти" +
                " все      его\n силы. души, вся ";
        String[]expected = {"Он", "шел", "невольно","чуть-чуть", "припадая", "на","одну", "ногу","", "и", "",
                "с", "этого","", "времени","", "почти", "все","","","","","", "его", "","силы","", "души","", "вся"};
        Assertions.assertArrayEquals(expected, Main.splitText(str));
    }

    /*@Test
    public void split2() {
        String str = "Осень - пора -- года-года";
        String[]expected = {"Осень", "пора", "года"};
        System.out.println(Arrays.toString(Main.splitText(str)));
        //Assertions.assertArrayEquals(expected, Main.splitText(str));
    }

    @Test
    public void split3() {
        String str = "Осень -- пора года";
        String[]expected = {"Осень", "пора", "года"};
        System.out.println(Arrays.toString(Main.splitText(str)));
        //Assertions.assertArrayEquals(expected, Main.splitText(str));
    }*/

    @Test
    public void split4() {
        String str = "Осень;пора ;года-года";
        String[]expected = {"Осень", "пора", "", "года-года"};
        Assertions.assertArrayEquals(expected, Main.splitText(str));
    }

    @Test
    public void fillSet() {
        String[]str = {"Осень", "пора", "года", "осень", "пора"};
        Set<String> set = Main.fillSet(str);
        Assertions.assertEquals(4, set.size());
    }

    @Test
    public void fillSet2() {
        String[]str = {"Осень", "пора", "года", "осень", "",""};
        Set<String> set = Main.fillSet(str);
        Assertions.assertEquals(4, set.size());
    }

    @Test
    public void fillSet3() {
        String[]str = {"Осень", "пора", "года", "осень", "-", "--"};
        Set<String> set = Main.fillSet(str);
        Assertions.assertEquals(4, set.size());
    }

    @Test
    public void fillMap() {
        String[]str = {"Осень", "пора", "года", "осень", "пора"};
        Map<String, Integer> map = Main.fillMap(str);
        Assertions.assertEquals(4, map.size());
    }

    @Test
    public void fillMap2() {
        String[]str = {"Осень", "пора", "года", "осень", "пора"};
        Map<String, Integer> map = Main.fillMap(str);
        Assertions.assertEquals(2, map.get("пора"));
    }

    @Test
    public void fillMap3() {
        String[]str = {"Осень", "пора", "года", "осень", "пора"};
        Map<String, Integer> map = Main.fillMap(str);
        Assertions.assertEquals(1, map.get("Осень"));
    }

    @Test
    public void fillList() {
        Map<String, Integer> map = new HashMap<>();
        map.put("осень", 5);
        map.put("лето", 2);
        map.put("весна", 10);
        map.put("зима", 1);
        List<Map.Entry<String, Integer>> list = Main.fillList(map);
        Assertions.assertEquals(4, list.size());
    }

    @Test
    public void sortList() {
        Map<String, Integer> map = new HashMap<>();
        map.put("осень", 5);
        map.put("лето", 2);
        map.put("весна", 10);
        map.put("зима", 1);
        List<Map.Entry<String, Integer>> list = Main.fillList(map);
        Main.sortListEntry(list);
        Assertions.assertEquals("[весна=10, осень=5, лето=2, зима=1]", list.toString());
    }

}

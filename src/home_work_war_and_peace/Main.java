package home_work_war_and_peace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("HomeWork/WarAndPeace_Book.txt"))) {
            while(reader.ready()){
                stb.append(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String textFromBook = stb.toString();

        String[]textArray = splitText(textFromBook);

        Set<String>textInSet = fillSet(textArray);
        int setSize = textInSet.size();
        System.out.println("Количество использованных слов: " + setSize);

        Map<String, Integer>textInMap = fillMap(textArray);

        List<Map.Entry<String, Integer>> listFromMap = fillList(textInMap);

        sortListEntry(listFromMap);
        System.out.println("Топ использованных слов в книге: ");
        topWordsInBook(listFromMap, 1000);

        ISearchEngine easy = new EasySearch();

        System.out.println("EasySearch: ");

        long countWar = easy.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        long countAnd = easy.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        long countPeace = easy.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);

        ISearchEngine regEX = new RegExSearch();

        System.out.println("RegExSearch: ");

        countWar = regEX.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = regEX.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = regEX.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);

        String textFromBookIgnoreCase = textFromBook.toLowerCase();

        System.out.println("EasySearch (ignore case): ");

        countWar = easy.search(textFromBookIgnoreCase,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = easy.search(textFromBookIgnoreCase,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = easy.search(textFromBookIgnoreCase,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);

        System.out.println("RegExSearch (ignore case): ");

        countWar = regEX.search(textFromBookIgnoreCase,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = regEX.search(textFromBookIgnoreCase,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = regEX.search(textFromBookIgnoreCase,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


    }

    public static String[] splitText(String str) {
        return str.split("[\\s*(),.:;?!-+\n]");
    }

    public static Set<String> fillSet(String[] str) {
        Set<String>set = new HashSet<>();
        for (String s : str) {
            if(!s.equals("")&&!s.equals("--")&&!s.equals("-")) {
                set.add(s);
            }
        }
        return set;
    }

    public static Map<String, Integer> fillMap(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (!s.equals("") && !s.equals("--") && !s.equals("-")) {
                if (map.containsKey(s)) {
                    Integer countVal = map.get(s) + 1;
                    map.put(s, countVal);
                } else {
                    map.put(s, 1);
                }
            }
        }
        return map;
    }

    public static List<Map.Entry<String, Integer>>fillList(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> stringLongEntry : map.entrySet()) {
            list.add(stringLongEntry);
        }
        return list;
    }

    public static void sortListEntry(List<Map.Entry<String, Integer>> list) {
        Comparator<Map.Entry<String, Integer>> compare = (me1, me2) -> {
            Integer val1 = me1.getValue();
            Integer val2 = me2.getValue();
            return val2 - val1;
        };
        list.sort(compare);
    }

    public static void topWordsInBook (List<Map.Entry<String, Integer>> list, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));
        }
    }



}

package home_work_war_and_peace.workers;

import home_work_war_and_peace.dto.WordCount;

import java.io.File;
import java.util.*;

public class Filler {

    public Set<String> fillSetWithWords(String[] str) {
        Set<String>set = new HashSet<>();
        for (String s : str) {
            set.add(s);
        }
        return set;
    }

    public Set<String> fillSetWithWords(File file) {
        ReaderFromFile reader = new ReaderFromFile();
        TextSeparator separator = new TextSeparator();
        String[]str = separator.splitTextByPunctuation(reader.readBookFile(file));
        return fillSetWithWords(str);
    }

    public Set<String> fillSetWithWords(String path) {
        File file = new File(path);
        return fillSetWithWords(file);
    }

    public Map<String, Integer> fillMapWithWords(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (map.containsKey(s)) {
                Integer countVal = map.get(s) + 1;
                map.put(s, countVal);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public Map<String, Integer> fillMapWithWords(File file) {
        ReaderFromFile reader = new ReaderFromFile();
        TextSeparator separator = new TextSeparator();
        String[]str = separator.splitTextByPunctuation(reader.readBookFile(file));
        return fillMapWithWords(str);
    }

    public Map <String, Integer> fillMapWithWords(String path) {
        File file = new File(path);
        return fillMapWithWords(file);
    }

    public Map<Integer,String> fillMapWithBooksName(File file) {
        Map<Integer,String> books = new HashMap<>();
        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    books.put(i+1, arr[i].getName());
                }
            }
        }
        return books;
    }

    public Map<Integer,File> fillMapWithBooksFile(File file) {
        Map<Integer,File> booksFile = new HashMap<>();
        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    booksFile.put(i+1, arr[i]);
                }
            }
        }
        return booksFile;
    }

    public List<WordCount> fillListWithWords(Map<String, Integer> map) {
        List<WordCount> list = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            WordCount wordCount = new WordCount(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            list.add(wordCount);
        }
        return list;
    }

    public List<WordCount> fillTopWordToList(List<WordCount> list, int count) {
        return list.subList(0, count);
    }

    public Set<File> fillSetLibrary(File file){
        Set<File> library = new HashSet<>();
        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (File value : arr) {
                    library.add(value);
                }
            }
        }
        return library;
    }
}

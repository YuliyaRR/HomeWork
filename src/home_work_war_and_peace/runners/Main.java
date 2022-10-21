package home_work_war_and_peace.runners;

import home_work_war_and_peace.api.ISearchEngine;
import home_work_war_and_peace.comparator.ComparatorWordCount;
import home_work_war_and_peace.dto.WordCount;
import home_work_war_and_peace.workers.*;
import home_work_war_and_peace.searchers.EasySearch;
import home_work_war_and_peace.searchers.RegExSearch;
import home_work_war_and_peace.searchers.decorators.SearchEnginePunctuationNormalizer;
import home_work_war_and_peace.searchers.decorators.SearchEngineWithCaseIgnore;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "HomeWork/WarAndPeace_Book.txt";
        File file = new File(fileName);

        ReaderFromFile readerFromFile = new ReaderFromFile();

        String textFromBook = readerFromFile.readBookFile(file);

        Filler filler = new Filler();

        Set<String> wordInSet = filler.fillSetWithWords(file);
        int setSize = wordInSet.size();
        System.out.println("Количество использованных слов: " + setSize);

        Map<String, Integer> wordInMap = filler.fillMapWithWords(file);

        List<WordCount> wordInList = filler.fillListWithWords(wordInMap);

        Sorter sorter = new Sorter();

        sorter.sortWordCount(wordInList, new ComparatorWordCount());

        List<WordCount> topWordsInBook = filler.fillTopWordToList(wordInList, 1000);

        System.out.println("Топ использованных слов в книге: ");
        for (WordCount wordCount : topWordsInBook) {
            System.out.println(wordCount);
        }

        System.out.println("EasySearch: ");
        ISearchEngine easy = new EasySearch();

        long countWar = easy.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        long countAnd = easy.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        long countPeace = easy.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


        System.out.println("RegExSearch: ");
        ISearchEngine regEX = new RegExSearch();

        countWar = regEX.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = regEX.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = regEX.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


        System.out.println("SearchEnginePunctuationNormalizer + EasySearch: ");
        ISearchEngine normalizerEasy = new SearchEnginePunctuationNormalizer(easy);

        countWar = normalizerEasy.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = normalizerEasy.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = normalizerEasy.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


        System.out.println("SearchEnginePunctuationNormalizer + RegExSearch: ");
        ISearchEngine normalizerRegEX = new SearchEnginePunctuationNormalizer(regEX);

        countWar = normalizerRegEX.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = normalizerRegEX.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = normalizerRegEX.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


        System.out.println("SearchEngineWithCaseIgnore (EasySearch): ");
        ISearchEngine ignoreCaseEasy = new SearchEngineWithCaseIgnore(new EasySearch());

        countWar = ignoreCaseEasy.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = ignoreCaseEasy.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = ignoreCaseEasy.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);


        System.out.println("SearchEngineWithCaseIgnore (RegExSearch): ");
        ISearchEngine ignoreCaseRegEX = new SearchEngineWithCaseIgnore(new RegExSearch());

        countWar = ignoreCaseRegEX.search(textFromBook,"война");
        System.out.println("Частота употребления  слова \"война\" в тексте: " + countWar);

        countAnd = ignoreCaseRegEX.search(textFromBook,"и");
        System.out.println("Частота употребления  слова \"и\" в тексте: " + countAnd);

        countPeace = ignoreCaseRegEX.search(textFromBook,"мир");
        System.out.println("Частота употребления  слова \"мир\" в тексте: " + countPeace);
    }
}

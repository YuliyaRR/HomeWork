package home_work_war_and_peace.searchers;

import home_work_war_and_peace.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String COMMON_PATTERN = "\\s*(\\s-|\\s|--|!|\\?|\\.|,|:|;|(\")|\\(|\\)|\\*|')\\s*";

    public RegExSearch() {}

    @Override
    public long search(String text, String word) {
        long count = 0;

        if(text.length() < word.length()) {
            return -1;
        }

        Pattern one = Pattern.compile("^" + word + "$");
        Matcher matcherOne = one.matcher(text);
        if(matcherOne.matches()){
            count++;
        }

        Pattern two = Pattern.compile("(?m)^" + word + COMMON_PATTERN);
        Matcher matcherTwo = two.matcher(text);
        while(matcherTwo.find()){
            count++;
        }

        Pattern three = Pattern.compile(COMMON_PATTERN + word + COMMON_PATTERN);
        Matcher matcherThree = three.matcher(text);
        while(matcherThree.find()){
            count++;
        }

        Pattern four = Pattern.compile(COMMON_PATTERN + word + "$");
        Matcher matcherFour = four.matcher(text);
        while(matcherFour.find()){
            count++;
        }

        return count;
    }

    public long searchIgnoreCase(String text, String word) {
        long count = 0;

        if(text.length() < word.length()) {
            return -1;
        }

        Pattern one = Pattern.compile("^" + word + "$",
                Pattern.UNICODE_CASE + Pattern.CASE_INSENSITIVE);
        Matcher matcherOne = one.matcher(text);
        if(matcherOne.matches()){
            count++;
        }

        Pattern two = Pattern.compile("(?m)^" + word + COMMON_PATTERN,
                Pattern.UNICODE_CASE + Pattern.CASE_INSENSITIVE);
        Matcher matcherTwo = two.matcher(text);
        while(matcherTwo.find()){
            count++;
        }

        Pattern three = Pattern.compile(COMMON_PATTERN + word + COMMON_PATTERN,
                Pattern.UNICODE_CASE + Pattern.CASE_INSENSITIVE);
        Matcher matcherThree = three.matcher(text);
        while(matcherThree.find()){
            count++;
        }

        Pattern four = Pattern.compile(COMMON_PATTERN + word + "$",
                Pattern.UNICODE_CASE + Pattern.CASE_INSENSITIVE);
        Matcher matcherFour = four.matcher(text);
        while(matcherFour.find()){
            count++;
        }

        return count;
    }
}

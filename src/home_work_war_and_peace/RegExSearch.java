package home_work_war_and_peace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    private String text;
    private String word;
    private long count = 0L;

    public RegExSearch() {
    }

    @Override
    public long search(String text, String word) {
        this.text = text;
        this.word = word;
        this.count = 0;

        Pattern pattern = Pattern.compile("\\b" + word + "\\b");//tests failed 4,9

        Matcher matcher = pattern.matcher(text);
        while (true){
           boolean result = matcher.find();
           if (result) {
               count++;
           } else {
               break;
           }
        }

        return count;
    }
}

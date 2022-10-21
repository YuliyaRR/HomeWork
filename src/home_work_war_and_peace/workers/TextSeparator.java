package home_work_war_and_peace.workers;

public class TextSeparator {
    public String[] splitTextByPunctuation(String str) {
        String regEx = "\\s*(\\s-|\\s|--|!|\\?|\\.|,|:|;|(\")|\\(|\\)|\\*|'|\\n|\\t)\\s*";
        return str.split(regEx);
    }
}

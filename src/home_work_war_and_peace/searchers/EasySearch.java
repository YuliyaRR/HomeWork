package home_work_war_and_peace.searchers;

import home_work_war_and_peace.api.ISearchEngine;
import java.util.Objects;

//Реализовать поиск используя метод indexOf из класса String.
public class EasySearch implements ISearchEngine {
    private long count = 0L;
    private int indexFrom;
    private int index;
    private String text;
    private String word;

    public EasySearch() {
    }

    @Override
    public long search(String text, String word) {
        this.text = text;
        this.word = word;
        index = 0;
        indexFrom = 0;
        count = 0;

        while ((index = text.indexOf(word, indexFrom)) != -1) {
            indexFrom = index + word.length();
            boolean isSingle = isSingleWord();
            if(isSingle) {
                count++;
            }
        }

        return count;
    }

    public boolean isSingleWord() {
        return checkStartWord() && checkEndWord();
    }

    public boolean checkStartWord(){
        if(index == 0) {// слово первое в тексте - это отдельное слово
            return true;
        }

        int indexBeforeWord = index - 1;
        char before = text.charAt(indexBeforeWord);
        if(Character.isLetter(before)) { //если предыдущий символ буква - часть слова
            return false;
        } else if(Objects.equals(before, '-')) { //если предыдущий символ тире
            int beforeBeforeIndex = indexBeforeWord - 1; //проверяем символ перед тире
            if(beforeBeforeIndex >= 0) { // если такой символ вообще существует
                char beforeBefore = text.charAt(beforeBeforeIndex); //проверяем символ перед ним
                if (Character.isLetter(beforeBefore)) {// если перед тире буква
                   return false;//то слово составное
                } else { // иначе это отдельное слово
                   return true;
                }
            } else { //символа перед тире не существует: тире начало текста
                return true;
            }
        } else { // если предыдущий символ не буква и не тире, то это отдельное слово
            return true;
        }
    }

    public boolean checkEndWord(){
        int indexEndWord = index + word.length()-1;
        if(indexEndWord == text.length()-1) {//слово последнее в тексте - это отдельное слово
            return true;
        }

        int indexAfterWord = indexEndWord+1;
        char after = text.charAt(indexAfterWord);
        if(Character.isLetter(after)) { //если следующий символ буква - часть слова
            return false;
        } else if(Objects.equals(after, '-')) { //если след. символ тире
            int afterAfterIndex = indexAfterWord + 1; //проверяем символ после тире
            if(afterAfterIndex < text.length()) { // если такой символ вообще существует
                char afterAfter = text.charAt(afterAfterIndex); //проверяем символ после тире
                if (Character.isLetter(afterAfter)) {// если после тире буква
                    return false;//то слово составное
                } else { // иначе это отдельное слово
                    return true;
                }
            } else { //символа после тире не существует: тире конец текста
                return true;
            }
        } else { // если след. символ не буква и не тире, то это отдельное слово
            return true;
        }
    }
}

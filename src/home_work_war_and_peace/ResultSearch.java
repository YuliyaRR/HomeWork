package home_work_war_and_peace;

public class ResultSearch {
    private String nameFile;
    private String searchWord;
    private long count;

    public ResultSearch(String nameFile, String searchWord, long count) {
        this.nameFile = nameFile;
        this.searchWord = searchWord;
        this.count = count;
    }

    @Override
    public String toString() {
        return nameFile + " - " + searchWord + " - " + count + " \n";
    }
}

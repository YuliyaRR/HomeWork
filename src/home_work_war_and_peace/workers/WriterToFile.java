package home_work_war_and_peace.workers;

import home_work_war_and_peace.dto.ResultSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterToFile {

    public void writeResultToFile(File result, ResultSearch resultSearch) {
        try (Writer writer = new FileWriter(result, true)) {
            writer.write(resultSearch.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

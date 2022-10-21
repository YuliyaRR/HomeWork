package home_work_war_and_peace.workers;

import java.io.*;

public class ReaderFromFile {

    public ReaderFromFile() {
    }

    public String readBookFile(String fileName) {
        File file = new File(fileName);
        return readBookFile(file);
    }

    public String readBookFile(File file) {
        StringBuilder stb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while(reader.ready()){
                stb.append(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return stb.toString();
    }

    public String readResultFromFile(File file) {
        String result = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder builder = new StringBuilder();
            while (reader.ready()){
                builder.append(reader.readLine()).append("\n");
            }
            result = builder.toString();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


}

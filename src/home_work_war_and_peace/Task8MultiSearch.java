package home_work_war_and_peace;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task8MultiSearch {
    public static void main(String[] args) {

        Set<File> library = new HashSet<>();
        List<ResultSearch> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String pathDirectory = "HomeWork/eBooks";

        File file = new File(pathDirectory);

        fillLibrary(library, file);

        File fileForResult = new File("HomeWork/result3.txt");

        int exit = 1;
        while (exit != 0){
            System.out.println("Введите слово, которое хотите найти и посчитать в книгах: ");
            String word = scanner.next();
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            for (File file1 : library) {
                executorService.submit(new SearchCallable(file1, word, fileForResult));

                //Future <ResultSearch> future = executorService.submit(new SearchCallable(file1, word, fileForResult));

                /*try{
                    list.add(future.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }*/
            }

            System.out.println("Если хотите прекратить поиск введите 0, " +
                    "если хотите продолжить поиск введите любое другое число");
            exit = scanner.nextInt();

            if(exit == 0) {
                executorService.shutdown();
            }
        }

        System.out.println("Поиск окончен, данные записаны в файл");

        System.out.println("Чтение из файла: ");

        System.out.println(readFromFile(fileForResult));

        /*System.out.println("Из листа");
        for (ResultSearch resultSearch : list) {
            System.out.println(resultSearch);
        }*/
    }

    public static void fillLibrary(Set<File> library, File file){
        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (File value : arr) {
                    library.add(value);
                }
            }
        }
    }

    public static String readFromFile(File file) {
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

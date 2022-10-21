package home_work_war_and_peace.runners;

import home_work_war_and_peace.dto.ResultSearch;
import home_work_war_and_peace.workers.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task8MultiSearch {
    public static void main(String[] args) {
        Filler filler = new Filler();
        ReaderFromFile readerFromFile = new ReaderFromFile();
        WriterToFile writerToFile = new WriterToFile();
        Scanner scanner = new Scanner(System.in);
        String pathDirectory = "HomeWork/eBooks";

        File file = new File(pathDirectory);

        Set<File> library = filler.fillSetLibrary(file);
        List<Future<ResultSearch>> futureList = new ArrayList<>();

        File fileForResult = new File("HomeWork/resultMultiSearch.txt");

        int exit = 1;
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (exit != 0){
            System.out.println("Введите слово, которое хотите найти и посчитать в книгах: ");
            String word = scanner.next();

            for (File file1 : library) {
                Future<ResultSearch> future = executorService.submit(new SearchCallable(file1, word));
                futureList.add(future);
            }

            while(!futureList.isEmpty()) {
                for (int i = 0; i < futureList.size(); i++) {
                    if(futureList.get(i).isDone()){
                        try {
                            writerToFile.writeResultToFile(fileForResult, futureList.get(i).get());
                            futureList.remove(i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            System.out.println("Если хотите прекратить поиск введите 0, " +
                        "если хотите продолжить поиск введите любое другое число");

            exit = scanner.nextInt();

        }

        executorService.shutdown();

        scanner.close();

        System.out.println("Поиск окончен, данные записаны в файл");

        System.out.println("Чтение из файла: ");

        System.out.println(readerFromFile.readResultFromFile(fileForResult));

    }
}

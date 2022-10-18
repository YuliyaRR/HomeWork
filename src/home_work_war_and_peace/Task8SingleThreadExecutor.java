package home_work_war_and_peace;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

import static home_work_war_and_peace.Task7.*;

public class Task8SingleThreadExecutor {
    public static void main(String[] args) {
        Map<Integer,String> books = new HashMap<>();
        Map<Integer, File> booksFile = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String pathDirectory = "HomeWork/eBooks";

        File file = new File(pathDirectory);

        if(file.isDirectory()) {
            File[]arr = file.listFiles();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    books.put(i+1, arr[i].getName());
                    booksFile.put(i+1, arr[i]);
                }
            }
        }

        System.out.println("Список книг: ");

        printAllBooks(books);

        File fileForResult = new File("HomeWork/result2.txt");

        int exit = 1;
        int numberBook;
        ExecutorService executorService = null;
        while (exit != 0){
            do {
                System.out.println("Введите номер понравившейся книги: ");
                numberBook = scanner.nextInt();
            } while (!booksFile.containsKey(numberBook));

            File fileBook = booksFile.get(numberBook);

            System.out.println("Вы выбрали книгу - " + fileBook.getName());

            System.out.println("Введите слово, которое хотите найти и посчитать в тексте: ");
            String word = scanner.next();

            executorService = Executors.newSingleThreadExecutor();

            Future<ResultSearch> f1 = executorService.submit(new SearchCallable(fileBook, word, fileForResult));


            try {
                System.out.println("Thread 1 " + f1.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Если хотите прекратить поиск введите 0, " +
                    "если хотите продолжить поиск в другой книге - любое другое число");
            exit = scanner.nextInt();
        }

        System.out.println("Поиск окончен, данные записаны в файл");

        executorService.shutdown();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileForResult))) {
            StringBuilder builder = new StringBuilder();
            while (reader.ready()){
                builder.append(reader.readLine()).append("\n");
            }
            System.out.println(builder);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

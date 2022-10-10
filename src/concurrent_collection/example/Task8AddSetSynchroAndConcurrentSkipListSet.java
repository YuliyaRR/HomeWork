package concurrent_collection.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Task8AddSetSynchroAndConcurrentSkipListSet {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Set<Integer> setSynchro = Collections.synchronizedSet(new HashSet<>());
        Set<Integer> setConcurrent = new ConcurrentSkipListSet<>();

        fillSet(setSynchro,10_000);
        fillSet(setConcurrent,10_000);

        System.out.println("Set synchronized");
        checkSpeedWork(setSynchro);

        System.out.println("ConcurrentSkipListSet: ");
        checkSpeedWork(setConcurrent);
    }

    public static void fillSet(Set<Integer>set, int size) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < size ; i++) {
            set.add(rnd.nextInt());
        }
    }

    public static void checkSpeedWork(Set<Integer> set) throws ExecutionException, InterruptedException {
        //CountDownLatch latch = new CountDownLatch(1); //синхронизатор, чтобы потоки стартанули в одно время

        ExecutorService executorService = Executors.newFixedThreadPool(10);//

        Callable<Long> callable = () -> {
          //  latch.await();
            Long startTime = System.nanoTime();
            //fillSet(set,1000);
            ThreadLocalRandom rnd = ThreadLocalRandom.current();
            for (int i = 0; i < 1000; i++) {
                set.add(rnd.nextInt());
            }
            Long finishTime = System.nanoTime();
            return finishTime - startTime;
        };

        Future<Long> f1 = executorService.submit(callable);
        Future<Long> f2 = executorService.submit(callable);
        Future<Long> f3 = executorService.submit(callable);
        Future<Long> f4 = executorService.submit(callable);
        Future<Long> f5 = executorService.submit(callable);
        Future<Long> f6 = executorService.submit(callable);
        Future<Long> f7 = executorService.submit(callable);
        Future<Long> f8 = executorService.submit(callable);
        Future<Long> f9 = executorService.submit(callable);
        Future<Long> f10 = executorService.submit(callable);

        //latch.countDown();

        System.out.println("Thread 1 " + f1.get()/1000);
        System.out.println("Thread 2 " + f2.get()/1000);
        System.out.println("Thread 3 " + f3.get()/1000);
        System.out.println("Thread 4 " + f4.get()/1000);
        System.out.println("Thread 5 " + f5.get()/1000);
        System.out.println("Thread 6 " + f6.get()/1000);
        System.out.println("Thread 7 " + f7.get()/1000);
        System.out.println("Thread 8 " + f8.get()/1000);
        System.out.println("Thread 9 " + f9.get()/1000);
        System.out.println("Thread 10 " + f10.get()/1000);

        executorService.shutdown();
    }

}

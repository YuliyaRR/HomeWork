package concurrent_collection.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Task7AddSetSynchroAndCopyOnWriteSet {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Set<Integer> setSynchro = Collections.synchronizedSet(new HashSet<>());
        Set<Integer> setConcurrent = new CopyOnWriteArraySet<>();

        fillSet(setSynchro, 100_00);
        fillSet(setConcurrent,100_000);

        System.out.println("Set synchronized: ");
        checkSpeedWork(setSynchro);

        System.out.println("CopyOnWriteArraySet: ");
        checkSpeedWork(setConcurrent);
    }

    public static void fillSet(Set<Integer>set, int size) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < size ; i++) {
            set.add(rnd.nextInt());
        }
    }

    public static void checkSpeedWork(Set<Integer> set) throws ExecutionException, InterruptedException {
        CountDownLatch latch = new CountDownLatch(1); //синхронизатор, чтобы потоки стартанули в одно время

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Long> callable = () -> {
            latch.await();
            Long startTime = System.nanoTime();
            fillSet(set,1000);
            Long finishTime = System.nanoTime();
            return finishTime - startTime;
        };

        Future<Long> f1 = executorService.submit(callable);
        Future<Long> f2 = executorService.submit(callable);

        latch.countDown();

        System.out.println("Thread 1 " + f1.get()/1000);
        System.out.println("Thread 2 " + f2.get()/1000);

        executorService.shutdown();
    }


}

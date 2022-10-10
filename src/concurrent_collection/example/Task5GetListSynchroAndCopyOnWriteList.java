package concurrent_collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Task5GetListSynchroAndCopyOnWriteList {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listSynchro = Collections.synchronizedList(new ArrayList<>());
        List<Integer> listConcurrent = new CopyOnWriteArrayList<>();

        fillList(listSynchro,0, 100);
        fillList(listConcurrent,0, 100);

        System.out.println("List synchronized: ");
        checkSpeedWork(listSynchro);

        System.out.println("CopyOnWriteArrayList: ");
        checkSpeedWork(listConcurrent);
    }

    public static void fillList(List<Integer>list, int from, int to) {
        for (int i = from; i < to ; i++) {
            list.add(i);
        }
    }

    public static void checkSpeedWork(List<Integer> list) throws ExecutionException, InterruptedException {
        CountDownLatch latch = new CountDownLatch(1); //синхронизатор, чтобы потоки стартанули в одно время

        ExecutorService executorService = Executors.newFixedThreadPool(2);//

        Future<Long> f1 = executorService.submit(new ListRunner(0,50,list,latch));
        Future<Long> f2 = executorService.submit(new ListRunner(50,100,list,latch));

        latch.countDown();

        System.out.println("Thread 1 " + f1.get()/1000);
        System.out.println("Thread 2 " + f2.get()/1000);

        executorService.shutdown();
    }

    static class ListRunner implements Callable<Long> {
        private int from;
        private int to;
        private List<Integer> list;
        private CountDownLatch latch;

        public ListRunner(int from, int to, List<Integer> list, CountDownLatch latch) {
            this.from = from;
            this.to = to;
            this.list = list;
            this.latch = latch;
        }

        @Override
        public Long call() throws Exception {
            latch.await();

            Long startTime = System.nanoTime();
            for (int i = from; i < to; i++) {
                list.get(i);
            }
            Long finishTime = System.nanoTime();
            return finishTime - startTime;
        }
    }




}

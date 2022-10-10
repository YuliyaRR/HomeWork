package concurrent_collection.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class Task9AddHashMapSynchroAndConcurrencyHashMap {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<Integer,Integer> mapSynchro = Collections.synchronizedMap(new HashMap<>());
        Map<Integer,Integer> mapConcurrent = new ConcurrentHashMap<>();

        fillMap(mapSynchro,1000);
        fillMap(mapConcurrent,1000);

        System.out.println("Map synchronized: ");
        checkSpeedWork(mapSynchro);

        System.out.println("ConcurrentHashMap: ");
        checkSpeedWork(mapConcurrent);
    }

    public static void fillMap(Map<Integer,Integer>map, int size) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < size; i++) {
           int key = rnd.nextInt(2000);
           int val = rnd.nextInt(10000);
           map.put(key, val);
        }
    }

    public static void checkSpeedWork(Map<Integer, Integer> map) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);//

        Future<Long> f1 = executorService.submit(new MapRunner(500,map));
        Future<Long> f2 = executorService.submit(new MapRunner(500,map));
        Future<Long> f3 = executorService.submit(new MapRunner(500,map));
        Future<Long> f4 = executorService.submit(new MapRunner(500,map));
        Future<Long> f5 = executorService.submit(new MapRunner(500,map));
        Future<Long> f6 = executorService.submit(new MapRunner(500,map));
        Future<Long> f7 = executorService.submit(new MapRunner(500,map));
        Future<Long> f8 = executorService.submit(new MapRunner(500,map));
        Future<Long> f9 = executorService.submit(new MapRunner(500,map));
        Future<Long> f10 = executorService.submit(new MapRunner(500,map));


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

    static class MapRunner implements Callable<Long> {
        private int count;
        private Map<Integer, Integer> map;
        
        public MapRunner(int count, Map<Integer, Integer> map) {
            this.count = count;
            this.map = map;
        }

        @Override
        public Long call() throws Exception {
            Long startTime = System.nanoTime();
            for (int i = 0; i < count; i++) {
                fillMap(map, count);
            }
            Long finishTime = System.nanoTime();
            return finishTime - startTime;
        }
    }

}



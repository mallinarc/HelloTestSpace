package app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        //stats before tasks execution
        System.out.println(".......Largest Execution:"+pool.getLargestPoolSize());
        System.out.println(" Maximum allowed threads:"+ pool.getMaximumPoolSize());
        System.out.println("Current threads in pool:" + pool.getActiveCount());
        System.out.println("Currently Executing threads:"+ pool.getActiveCount());
        System.out.println("Total number of threads ever scheduled:"+ pool.getTaskCount());
        for(int i = 0; i < 7; i ++){
            executor.submit(new Task());
        }
        
    }

    static class Task implements Runnable {

        public void run() {
           
           try {
              Long duration = (long) (Math.random() * 5);
              System.out.println("Running Task! Thread Name: " +
                 Thread.currentThread().getName());
                 TimeUnit.SECONDS.sleep(duration);
              
              System.out.println("Task Completed! Thread Name: " +
                 Thread.currentThread().getName());
           } catch (InterruptedException e) {
              e.printStackTrace();
           }
        }
     }
    
}

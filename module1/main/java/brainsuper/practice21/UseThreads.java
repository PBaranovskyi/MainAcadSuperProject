package brainsuper.practice21;

import brainsuper.practice20.UseThreads.MyTestRunnable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by citsym on 08.04.17.
 */
public class UseThreads {

    public static void main(String[] args) throws Exception {

        long before = System.currentTimeMillis();

        ExecutorService executorService = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new LinkedBlockingDeque());

//        executorService.wait();

//        List<Future> listOfResults = new ArrayList<Future>();
        Collection<Callable<Integer>> listOfTasks = new ArrayList<Callable<Integer>>();


        for (int i = 0; i < 30; i++) {
            MyTestRunnable newTask = new MyTestRunnable(i);
            listOfTasks.add(newTask);
        }

        List<Future<Integer>> futures = executorService.invokeAll(listOfTasks);

        for (Future listOfResult : futures) {
            System.out.println(listOfResult.get());
        }
//        executorService.notifyAll();

        System.out.println("Timing : " + (System.currentTimeMillis()-before));

        executorService.shutdown();


    }
}

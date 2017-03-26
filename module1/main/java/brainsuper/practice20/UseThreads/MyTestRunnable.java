package brainsuper.practice20.UseThreads;

/**
 * Created by citsym on 26.03.17.
 */
public class MyTestRunnable implements Runnable {


    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        int sum = 0;
        for (int i = 0; i < 1_000_000_000; i++) {

            sum += i;
//            System.out.println("Name " + name + " i= " + i + " time " + System.currentTimeMillis());
        }



        System.out.println("finished work " + sum);
    }
}

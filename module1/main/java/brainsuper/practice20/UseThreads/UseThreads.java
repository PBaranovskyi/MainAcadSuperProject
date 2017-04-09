package brainsuper.practice20.UseThreads;

/**
 * Created by citsym on 26.03.17.
 */
public class UseThreads {


    public static void main(String[] args) throws InterruptedException {

        long before = System.currentTimeMillis();

        System.out.println("main method start");
        MyTestRunnable run1 = new MyTestRunnable(1);
//        Thread thr1 = new Thread(run1);
//        Thread thr2 = new Thread(run1);
        System.out.println("thread created");
//        thr1.start();
//        thr1.join();
//        thr2.start();
//        thr2.join();
//        run1.run();
//        run1.run();
        System.out.println("thread started");


        System.out.println("time " + (System.currentTimeMillis() - before));


//        String name = Thread.currentThread().getName();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            System.out.println("Name " + name + " i= " + i + " time " + System.currentTimeMillis());
//        }
    }
}
